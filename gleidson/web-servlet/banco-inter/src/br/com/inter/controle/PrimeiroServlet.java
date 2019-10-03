package br.com.inter.controle;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.inter.modelo.Pessoa;
import br.com.inter.service.IComando;

@SuppressWarnings("unchecked")
@WebServlet(urlPatterns = { "/inter", "/treinar", "*.bco" }, loadOnStartup = -1)
public class PrimeiroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private List<String> comandosDeSessao;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		comandosDeSessao = (List<String>) config.getServletContext().getAttribute("comandosDeSessao");
	}

	@Override
	public void init() throws ServletException {
		super.init();
	}

	public PrimeiroServlet() {
		System.out.println("Estou sendo criado");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String comando = request.getParameter("comando");

		if (comando != null) {
			IComando c = criarComando(comando, request.getSession());
			c.executar(request, response);
		}

		String nome = request.getParameter("nome");
		String dataNascimento = request.getParameter("dataNascimento");
		try {
			Pessoa p = new Pessoa();
			if (request.getSession().getAttribute("contador") != null) {
				Integer cont = (Integer) request.getSession().getAttribute("contador");
				p.setContadorAcessos(++cont);
				request.getSession().setAttribute("contador", cont);
			} else {
				p.setContadorAcessos(1);
				request.getSession().setAttribute("contador", 1);
			}
			p.setNome(nome);
			p.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento));
			p.setMaiorDeIdade(false);
			request.setAttribute("pessoa", p);
			request.getRequestDispatcher("primeira.jsp").forward(request, response);
		} catch (ParseException e) {
			System.out.println("Deu Erro");
		}
	}

	private IComando criarComando(String comando, HttpSession httpSession) {
		try {
			IComando c = null;
			if (!comandosDeSessao.contains(comando)) {
				c = (IComando) Class.forName(comando).newInstance();
			} else if (httpSession.getAttribute(comando) != null) {
				c = (IComando) httpSession.getAttribute(comando);
			} else {
				c = (IComando) Class.forName(comando).newInstance();
				httpSession.setAttribute(comando, c);
			}

			return c;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
