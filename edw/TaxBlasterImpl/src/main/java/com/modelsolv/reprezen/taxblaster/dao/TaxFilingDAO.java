package com.modelsolv.reprezen.taxblaster.dao;

import io.dropwizard.hibernate.AbstractDAO;

import java.util.List;

import org.hibernate.SessionFactory;

import com.google.common.base.Optional;

public class TaxFilingDAO extends AbstractDAO<TaxFilingImpl> {
    public TaxFilingDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<TaxFilingImpl> findById(Long id) {
        return Optional.fromNullable(get(id));
    }

    public TaxFilingImpl create(TaxFilingImpl person) {
        return persist(person);
    }

    public List<TaxFilingImpl> findAll() {
        return list(namedQuery("com.modelsolv.reprezen.taxblaster.TaxFilingImpl.findAll"));
    }
}