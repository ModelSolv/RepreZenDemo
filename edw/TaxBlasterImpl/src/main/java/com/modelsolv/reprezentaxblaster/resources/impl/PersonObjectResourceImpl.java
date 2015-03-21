package com.modelsolv.reprezentaxblaster.resources.impl;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.common.base.Optional;
import com.modelsolv.reprezen.resources.taxblasterinterface.PersonObjectResource;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonObject;
import com.modelsolv.reprezen.taxblaster.dao.PersonDAO;
import com.modelsolv.reprezen.taxblaster.dao.PersonImpl;

@Path("people/{id}")
public class PersonObjectResourceImpl implements PersonObjectResource {

	private PersonDAO personDao;

	public PersonObjectResourceImpl(PersonDAO dao) {
		this.personDao = dao;
	}

	@GET
	@Produces({ "application/json" })
	@UnitOfWork
	@Override
	public PersonImpl getPersonObject(@PathParam("id") long userId) {
		return findSafely(userId);
	}

	@PUT
	@Consumes("application/json")
	@UnitOfWork
	@Override
	public PersonObject putPersonObject(long id, PersonObject personobject) {
		PersonImpl person = PersonImpl.fromJaxb(personobject);
		PersonImpl result = personDao.create(person);
		return result;
	}

	private PersonImpl findSafely(long personId) {
		Optional<PersonImpl> person = personDao.findById(personId);
		if (!person.isPresent()) {
			throw new com.sun.jersey.api.NotFoundException(
					"No user with this id exists: " + personId);
		}
		return person.get();
	}

}
