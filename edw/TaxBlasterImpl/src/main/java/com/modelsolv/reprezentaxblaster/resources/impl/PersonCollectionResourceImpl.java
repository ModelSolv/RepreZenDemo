package com.modelsolv.reprezentaxblaster.resources.impl;

import java.util.List;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

import com.modelsolv.reprezen.resources.taxblasterinterface.PersonCollectionResource;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonCollection;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonObject;
import com.modelsolv.reprezen.taxblaster.dao.PersonDAO;
import com.modelsolv.reprezen.taxblaster.dao.PersonImpl;

public class PersonCollectionResourceImpl implements PersonCollectionResource {

	private final PersonDAO peopleDAO;

	public PersonCollectionResourceImpl(PersonDAO peopleDAO) {
		this.peopleDAO = peopleDAO;
	}

	@GET
	@Produces("application/json")
	@UnitOfWork
	public PersonCollection getPersonCollection() {
		PersonCollection result = new PersonCollection();
		List<PersonImpl> allPeople = peopleDAO.findAll();
		// TODO switch to Java 8
		for (PersonImpl person : allPeople) {
			PersonCollection.PersonCollectionItem personCollectionItemDTO = person
					.toPersonCollectionItemDTO();
			result.getPersonCollectionItem().add(personCollectionItemDTO);
		}
		return result;
	}

	@POST
	@Consumes({ "application/javascript", "application/ecmascript",
			"application/json" })
	@Produces({ "application/javascript", "application/ecmascript",
			"application/json" })
	@UnitOfWork
	@Override
	public PersonObject postPersonCollection(PersonObject personObject) {
		PersonImpl person = PersonImpl.fromJaxb(personObject);
		PersonImpl result = peopleDAO.create(person);
		return result;
	}

}
