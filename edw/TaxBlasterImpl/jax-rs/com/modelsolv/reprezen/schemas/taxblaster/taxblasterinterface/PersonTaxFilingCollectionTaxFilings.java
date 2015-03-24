
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel.CurrencyCodeEnum;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel.TaxFilingStatusEnum;


/**
 * <p>Java class for PersonTaxFilingCollection_taxFilings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonTaxFilingCollection_taxFilings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="currency" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}CurrencyCodeEnum" />
 *       &lt;attribute name="filingID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="grossIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="jurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}TaxFilingStatusEnum" />
 *       &lt;attribute name="taxLiability" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonTaxFilingCollection_taxFilings")
public class PersonTaxFilingCollectionTaxFilings {

    @XmlAttribute(name = "currency")
    protected CurrencyCodeEnum currency;
    @XmlAttribute(name = "filingID")
    protected Long filingID;
    @XmlAttribute(name = "grossIncome")
    protected BigDecimal grossIncome;
    @XmlAttribute(name = "jurisdiction")
    protected String jurisdiction;
    @XmlAttribute(name = "period")
    protected Integer period;
    @XmlAttribute(name = "status")
    protected TaxFilingStatusEnum status;
    @XmlAttribute(name = "taxLiability")
    protected BigDecimal taxLiability;
    @XmlAttribute(name = "year")
    protected Integer year;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeEnum }
     *     
     */
    public CurrencyCodeEnum getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeEnum }
     *     
     */
    public void setCurrency(CurrencyCodeEnum value) {
        this.currency = value;
    }

    /**
     * Gets the value of the filingID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilingID() {
        return filingID;
    }

    /**
     * Sets the value of the filingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilingID(Long value) {
        this.filingID = value;
    }

    /**
     * Gets the value of the grossIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossIncome() {
        return grossIncome;
    }

    /**
     * Sets the value of the grossIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossIncome(BigDecimal value) {
        this.grossIncome = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFilingStatusEnum }
     *     
     */
    public TaxFilingStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFilingStatusEnum }
     *     
     */
    public void setStatus(TaxFilingStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the taxLiability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxLiability() {
        return taxLiability;
    }

    /**
     * Sets the value of the taxLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxLiability(BigDecimal value) {
        this.taxLiability = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

}
