package br.com.inter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("br.com.inter.NomeValidator")
public class NomeValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String nome = value.toString();	
		if (nome == null || nome.trim().indexOf(" ") == -1) {
			FacesMessage msg =
		            new FacesMessage("Nome da Pessoa","Deve possuir nome e sobrenome");
		         msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		         throw new ValidatorException(msg);
		}
	}

}
