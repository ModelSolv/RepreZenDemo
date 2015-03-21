package com.modelsolv.reprezen.taxblaster.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonCollection;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonObject;

@Entity
@Table(name = "people")
@NamedQueries({ @NamedQuery(name = "com.modelsolv.reprezen.taxblaster.PersonImpl.findAll", query = "SELECT p FROM PersonImpl p") })
public class PersonImpl extends PersonObject {

	protected List<String> otherNames = new ArrayList<String>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Override
	public Long getTaxpayerID() {
		return super.getTaxpayerID();
	}

	@Column(name = "firstName")
	@Override
	public String getFirstName() {
		return super.getFirstName();
	}

	@Column(name = "lastName")
	@Override
	public String getLastName() {
		return super.getLastName();
	}

	@ElementCollection
	@CollectionTable(name = "people_othernames", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "othernames")
	public List<String> getOtherNames() {
		return otherNames;
	}

	@ElementCollection
	@CollectionTable(name = "people_othernames", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "othernames")
	public void setOtherNames(List<String> otherNames) {
		this.otherNames = otherNames;
	}

	@Transient
	@Override
	public PersonObject.OtherNamesList getOtherNamesList() {
		return super.getOtherNamesList();
	}

	public PersonObject toPersonObjectDTO() {
		PersonObject person = new PersonObject();
		person.setTaxpayerID(getTaxpayerID());
		person.setFirstName(getFirstName());
		person.setLastName(getLastName());
		PersonObject.OtherNamesList otherNames = new PersonObject.OtherNamesList();
		person.setOtherNamesList(otherNames);
		otherNames.getItem().addAll(getOtherNames());
		return person;
	}
	
	public PersonCollection.PersonCollectionItem toPersonCollectionItemDTO() {
		PersonCollection.PersonCollectionItem person = new PersonCollection.PersonCollectionItem();
		person.setTaxpayerID(getTaxpayerID());
		person.setFirstName(getFirstName());
		person.setLastName(getLastName());
		PersonCollection.PersonCollectionItem.OtherNamesList otherNames = new PersonCollection.PersonCollectionItem.OtherNamesList();
		person.setOtherNamesList(otherNames);
		otherNames.getItem().addAll(getOtherNames());
		return person;
	}
	
	public static PersonImpl fromJaxb(PersonObject personObject) {
		PersonImpl person = new PersonImpl();
		person.setTaxpayerID(personObject.getTaxpayerID());
		person.setFirstName(personObject.getFirstName());
		person.setLastName(personObject.getLastName());
		person.getOtherNames().clear();
		if (personObject.getOtherNamesList() != null) {
			person.getOtherNames().addAll(
					personObject.getOtherNamesList().getItem());
		}
		return person;
	}

}
