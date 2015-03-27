package com.modelsolv.reprezentaxblaster.resources.impl;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.common.base.Optional;
import com.modelsolv.reprezen.resources.taxblasterinterface.TaxFilingObjectResource;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.TaxFilingObject;
import com.modelsolv.reprezen.taxblaster.dao.TaxFilingDAO;
import com.modelsolv.reprezen.taxblaster.dao.TaxFilingImpl;

@Path("taxfilings/{id}")
public class TaxFilingObjectResourceImpl implements TaxFilingObjectResource {

	private TaxFilingDAO taxFilingDao;

	public TaxFilingObjectResourceImpl(TaxFilingDAO dao) {
		this.taxFilingDao = dao;
	}

	@GET
	@UnitOfWork
	@Produces({ "application/json" })
	@Override
	public TaxFilingObject getTaxFilingObject(@PathParam("id") long userId) {
		return findSafely(userId).toJaxb();
	}

	private TaxFilingImpl findSafely(long taxfilingId) {
		Optional<TaxFilingImpl> result = taxFilingDao.findById(taxfilingId);
		if (!result.isPresent()) {
			throw new com.sun.jersey.api.NotFoundException(
					"No user with this id exists: " + taxfilingId);
		}
		TaxFilingImpl taxFiling = result.get();
		return taxFiling;
	}

}
