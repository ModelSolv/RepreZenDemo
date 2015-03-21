package com.modelsolv.reprezentaxblaster.resources.impl;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.common.base.Optional;
import com.modelsolv.reprezen.resources.taxblasterinterface.TaxFilingCollectionResource;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.TaxFilingCollection;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.TaxFilingObject;
import com.modelsolv.reprezen.taxblaster.dao.PersonDAO;
import com.modelsolv.reprezen.taxblaster.dao.PersonImpl;
import com.modelsolv.reprezen.taxblaster.dao.TaxFilingDAO;
import com.modelsolv.reprezen.taxblaster.dao.TaxFilingImpl;

@Path("taxFilings")
public class TaxFilingCollectionResourceImpl implements
		TaxFilingCollectionResource {

	private final TaxFilingDAO taxFilingDAO;
	private final PersonDAO peopleDAO;

	public TaxFilingCollectionResourceImpl(TaxFilingDAO taxFilingDAO,
			PersonDAO peopleDAO) {
		this.taxFilingDAO = taxFilingDAO;
		this.peopleDAO = peopleDAO;
	}

	@POST
	@Consumes({ "application/javascript", "application/ecmascript",
			"application/json" })
	@Produces({ "application/javascript", "application/ecmascript",
			"application/json" })
	@UnitOfWork
	public TaxFilingObject postTaxFilingCollection(
			TaxFilingObject taxfilingobject) {
		PersonImpl taxpayerObject = findPerson(taxfilingobject.getTaxpayer()
				.getTaxpayerID());
		TaxFilingImpl taxfiling = TaxFilingImpl.fromJaxb(taxfilingobject,
				taxpayerObject);
		TaxFilingImpl result = taxFilingDAO.create(taxfiling);
		return result.toJaxb();
	}

	private PersonImpl findPerson(long personId) {
		Optional<PersonImpl> person = peopleDAO.findById(personId);
		if (!person.isPresent()) {
			throw new com.sun.jersey.api.NotFoundException(
					"No user with this id exists: " + personId);
		}
		return person.get();
	}

	@Override
	public TaxFilingCollection getTaxFilingCollection() {
		// TODO Auto-generated method stub
		return null;
	}

}
