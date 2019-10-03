package br.com.inter.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MoedaListener
 *
 */
@WebListener
public class MoedaListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MoedaListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("Desligando o servidor...");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	
    	List<String> comandosDeSessao = new ArrayList<>();
    	comandosDeSessao.add("br.com.inter.service.ListagemService");
    	
    	List<String> moedas = Arrays.asList("Dolar", "Euro", "Real");
        sce.getServletContext().setAttribute("moedas", moedas);
        sce.getServletContext().setAttribute("comandosDeSessao", comandosDeSessao);
    }
	
}
