package br.com.treinar;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.treinar.model.Contact;
import br.com.treinar.model.Email;
import br.com.treinar.model.Phone;

@Path("/contacts")
public class ContactsService {

	private static List<Contact> contacts = new ArrayList<Contact>();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Contact getContact(@PathParam("id") int id) {

		Contact result = null;

		for (Contact contact : contacts) {
			if (contact.getId() == id) {
				result = contact;
				break;
			}
		}

		if (result == null) {
			throw new WebApplicationException(404);
		}

		return result;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> list() {
		return contacts;
	}
	
	@GET
	@Path("/{id}/phones")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Phone> listPhones(@PathParam("id") int id) {
		Contact c = getContact(id);
		return c.getPhones();
	}
	
	@GET
	@Path("/{id}/emails")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Email> listEmails(@PathParam("id") int id) {
		Contact c = getContact(id);
		return c.getEmails();
	}

	@GET
	@Path("/find/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> findByName(@PathParam("name") String name) {
		List<Contact> result = new ArrayList<Contact>();
		for (Contact contact : contacts) {
			if (contact.getName() != null && contact.getName().toLowerCase().contains(name.toLowerCase())) {
				result.add(contact);
			}
		}
		return result;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Contact add(Contact contact) {

		if (contact.getName() == null || contact.getName().trim().equals("")) {
			throw new WebApplicationException(
					Response.status(Response.Status.BAD_REQUEST).entity("O nome do contato é obrigatório").build());
		}

		contacts.add(contact);
		contact.setId(contacts.indexOf(contact) + 1);
		return contact;
	}

	@POST
	@Path("/{id}/phones")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Phone addPhone(@PathParam("id") int id, Phone phone) {

		Contact c = getContact(id);
		c.getPhones().add(phone);

		return phone;

	}
	@POST
	@Path("/{id}/emails")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Email addEmails(@PathParam("id") int id, Email email) {
		
		Contact c = getContact(id);
		c.getEmails().add(email);
		
		return email;
		
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(@PathParam("id") int id, Contact contact) {
		contacts.set(id - 1, contact);
		contact.setId(contacts.indexOf(contact) + 1);
	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		Contact contact = contacts.get(id - 1);
		contacts.remove(contact);
	}

}