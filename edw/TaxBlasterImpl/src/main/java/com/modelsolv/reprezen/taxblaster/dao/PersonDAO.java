package com.modelsolv.reprezen.taxblaster.dao;

import io.dropwizard.hibernate.AbstractDAO;

import java.util.List;

import org.hibernate.SessionFactory;

import com.google.common.base.Optional;

public class PersonDAO extends AbstractDAO<PersonImpl> {
    public PersonDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<PersonImpl> findById(Long id) {
        return Optional.fromNullable(get(id));
    }

    public PersonImpl create(PersonImpl person) {
        return persist(person);
    }

    public List<PersonImpl> findAll() {
        return list(namedQuery("com.modelsolv.reprezen.taxblaster.PersonImpl.findAll"));
    }
}