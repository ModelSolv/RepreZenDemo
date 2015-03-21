package com.modelsolv.reprezen.taxblaster.dao;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.w3._2005.atom.LinkType;

import com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel.CurrencyCodeEnum;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.TaxFilingObject;

@Entity
@Table(name = "taxfilings")
@javax.persistence.Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({ @NamedQuery(name = "com.modelsolv.reprezen.taxblaster.TaxFilingImpl.findAll", query = "SELECT p FROM TaxFilingImpl p") })
public class TaxFilingImpl extends TaxFilingObject {

	private static final String PEOPLE_RESOURCE = "people";
	private static final String BASE_URL = "localhost:8080";
	protected PersonImpl taxpayerObject;

	@javax.persistence.OneToOne
	@javax.persistence.JoinColumn(name = "taxpayer", referencedColumnName = "id")
	public PersonImpl getTaxpayerObject() {
		return taxpayerObject;
	}

	public void setTaxpayerObject(PersonImpl taxpayerObject) {
		this.taxpayerObject = taxpayerObject;
	}

	@Transient
	@Override
	public void setTaxpayer(Taxpayer value) {
		super.setTaxpayer(value);
	}

	@Transient
	@Override
	public Taxpayer getTaxpayer() {
		return super.getTaxpayer();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Override
	public Long getFilingID() {
		return super.getFilingID();
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "currency")
	@Override
	public CurrencyCodeEnum getCurrency() {
		return super.getCurrency();
	}

	@Column(name = "grossIncome")
	@Override
	public BigDecimal getGrossIncome() {
		return super.getGrossIncome();
	}

	@Column(name = "jurisdiction")
	@Override
	public String getJurisdiction() {
		return super.getJurisdiction();
	}

	@Column(name = "period")
	@Override
	public Integer getPeriod() {
		return super.getPeriod();
	}

	@Column(name = "taxLiability")
	@Override
	public BigDecimal getTaxLiability() {
		return super.getTaxLiability();
	}

	public TaxFilingObject toJaxb() {
		TaxFilingObject result = new TaxFilingObject();
		Taxpayer taxpayer = new Taxpayer();
		taxpayer.setTaxpayerID(getTaxpayerObject().getTaxpayerID());
		taxpayer.setFirstName(getTaxpayerObject().getFirstName());
		LinkType link = new LinkType();
		link.setRel("rel");
		link.setHref(BASE_URL + "/" + PEOPLE_RESOURCE + "/"
				+ getTaxpayerObject().getTaxpayerID());
		taxpayer.setLink(link);
		result.setTaxpayer(taxpayer);

		result.setFilingID(getFilingID());
		result.setCurrency(getCurrency());
		result.setGrossIncome(getGrossIncome());
		result.setJurisdiction(getJurisdiction());
		result.setPeriod(getPeriod());
		result.setTaxLiability(getTaxLiability());
		return result;
	}

	public static TaxFilingImpl fromJaxb(TaxFilingObject taxfilingobject,
			PersonImpl taxpayerObject) {
		TaxFilingImpl result = new TaxFilingImpl();
		result.setFilingID(taxfilingobject.getFilingID());
		result.setTaxpayerObject(taxpayerObject);
		result.setCurrency(taxfilingobject.getCurrency());
		result.setGrossIncome(taxfilingobject.getGrossIncome());
		result.setJurisdiction(taxfilingobject.getJurisdiction());
		result.setPeriod(taxfilingobject.getPeriod());
		result.setTaxLiability(taxfilingobject.getTaxLiability());
		return result;
	}
}
