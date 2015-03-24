
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel.CurrencyCodeEnum;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel.TaxFilingStatusEnum;
import org.w3._2005.atom.LinkType;


/**
 * <p>Java class for TaxFilingCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFilingCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxFilingCollectionItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="filingID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="jurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="currency" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}CurrencyCodeEnum" />
 *                 &lt;attribute name="grossIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="taxLiability" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="status" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}TaxFilingStatusEnum" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFilingCollection", propOrder = {
    "taxFilingCollectionItem"
})
public class TaxFilingCollection {

    @XmlElement(name = "TaxFilingCollectionItem")
    protected List<TaxFilingCollection.TaxFilingCollectionItem> taxFilingCollectionItem;

    /**
     * Gets the value of the taxFilingCollectionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxFilingCollectionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxFilingCollectionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxFilingCollection.TaxFilingCollectionItem }
     * 
     * 
     */
    public List<TaxFilingCollection.TaxFilingCollectionItem> getTaxFilingCollectionItem() {
        if (taxFilingCollectionItem == null) {
            taxFilingCollectionItem = new ArrayList<TaxFilingCollection.TaxFilingCollectionItem>();
        }
        return this.taxFilingCollectionItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
     *       &lt;/sequence>
     *       &lt;attribute name="filingID" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="jurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="currency" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}CurrencyCodeEnum" />
     *       &lt;attribute name="grossIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="taxLiability" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="status" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}TaxFilingStatusEnum" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "link"
    })
    public static class TaxFilingCollectionItem {

        @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
        protected LinkType link;
        @XmlAttribute(name = "filingID")
        protected Long filingID;
        @XmlAttribute(name = "jurisdiction")
        protected String jurisdiction;
        @XmlAttribute(name = "year")
        protected Integer year;
        @XmlAttribute(name = "period")
        protected Integer period;
        @XmlAttribute(name = "currency")
        protected CurrencyCodeEnum currency;
        @XmlAttribute(name = "grossIncome")
        protected BigDecimal grossIncome;
        @XmlAttribute(name = "taxLiability")
        protected BigDecimal taxLiability;
        @XmlAttribute(name = "status")
        protected TaxFilingStatusEnum status;

        /**
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link LinkType }
         *     
         */
        public LinkType getLink() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link LinkType }
         *     
         */
        public void setLink(LinkType value) {
            this.link = value;
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

    }

}
