
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonTaxFilingCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonTaxFilingCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxFilingsList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taxFiling" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface}PersonTaxFilingCollection_taxFilings" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="taxpayerID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonTaxFilingCollection", propOrder = {
    "taxFilingsList"
})
public class PersonTaxFilingCollection {

    protected PersonTaxFilingCollection.TaxFilingsList taxFilingsList;
    @XmlAttribute(name = "taxpayerID")
    protected Long taxpayerID;
    @XmlAttribute(name = "lastName")
    protected String lastName;
    @XmlAttribute(name = "firstName")
    protected String firstName;

    /**
     * Gets the value of the taxFilingsList property.
     * 
     * @return
     *     possible object is
     *     {@link PersonTaxFilingCollection.TaxFilingsList }
     *     
     */
    public PersonTaxFilingCollection.TaxFilingsList getTaxFilingsList() {
        return taxFilingsList;
    }

    /**
     * Sets the value of the taxFilingsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTaxFilingCollection.TaxFilingsList }
     *     
     */
    public void setTaxFilingsList(PersonTaxFilingCollection.TaxFilingsList value) {
        this.taxFilingsList = value;
    }

    /**
     * Gets the value of the taxpayerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxpayerID() {
        return taxpayerID;
    }

    /**
     * Sets the value of the taxpayerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxpayerID(Long value) {
        this.taxpayerID = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
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
     *         &lt;element name="taxFiling" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface}PersonTaxFilingCollection_taxFilings" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxFiling"
    })
    public static class TaxFilingsList {

        @XmlElement(required = true)
        protected List<PersonTaxFilingCollectionTaxFilings> taxFiling;

        /**
         * Gets the value of the taxFiling property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxFiling property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxFiling().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonTaxFilingCollectionTaxFilings }
         * 
         * 
         */
        public List<PersonTaxFilingCollectionTaxFilings> getTaxFiling() {
            if (taxFiling == null) {
                taxFiling = new ArrayList<PersonTaxFilingCollectionTaxFilings>();
            }
            return this.taxFiling;
        }

    }

}
