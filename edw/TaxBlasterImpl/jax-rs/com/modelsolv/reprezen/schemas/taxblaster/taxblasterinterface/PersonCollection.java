
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel.SpecialValueEnum;
import org.w3._2005.atom.LinkType;


/**
 * <p>Java class for PersonCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonCollectionItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="otherNamesList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="taxFilingsList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="taxFilings" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="addressesList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface}PersonCollection_addresses" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="taxpayerID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="netWorth" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="netWorthSpecialValue" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}SpecialValueEnum" />
 *                 &lt;attribute name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dOB" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "PersonCollection", propOrder = {
    "personCollectionItem"
})
public class PersonCollection {

    @XmlElement(name = "PersonCollectionItem")
    protected List<PersonCollection.PersonCollectionItem> personCollectionItem;

    /**
     * Gets the value of the personCollectionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personCollectionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonCollectionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCollection.PersonCollectionItem }
     * 
     * 
     */
    public List<PersonCollection.PersonCollectionItem> getPersonCollectionItem() {
        if (personCollectionItem == null) {
            personCollectionItem = new ArrayList<PersonCollection.PersonCollectionItem>();
        }
        return this.personCollectionItem;
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
     *         &lt;element name="otherNamesList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="taxFilingsList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="taxFilings" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="addressesList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface}PersonCollection_addresses" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="taxpayerID" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="netWorth" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="netWorthSpecialValue" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}SpecialValueEnum" />
     *       &lt;attribute name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dOB" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherNamesList",
        "taxFilingsList",
        "addressesList"
    })
    public static class PersonCollectionItem {

        protected PersonCollection.PersonCollectionItem.OtherNamesList otherNamesList;
        protected PersonCollection.PersonCollectionItem.TaxFilingsList taxFilingsList;
        protected PersonCollection.PersonCollectionItem.AddressesList addressesList;
        @XmlAttribute(name = "taxpayerID")
        protected Long taxpayerID;
        @XmlAttribute(name = "lastName")
        protected String lastName;
        @XmlAttribute(name = "firstName")
        protected String firstName;
        @XmlAttribute(name = "netWorth")
        protected BigDecimal netWorth;
        @XmlAttribute(name = "netWorthSpecialValue")
        protected SpecialValueEnum netWorthSpecialValue;
        @XmlAttribute(name = "preferredLanguage")
        protected String preferredLanguage;
        @XmlAttribute(name = "dOB")
        protected String dob;

        /**
         * Gets the value of the otherNamesList property.
         * 
         * @return
         *     possible object is
         *     {@link PersonCollection.PersonCollectionItem.OtherNamesList }
         *     
         */
        public PersonCollection.PersonCollectionItem.OtherNamesList getOtherNamesList() {
            return otherNamesList;
        }

        /**
         * Sets the value of the otherNamesList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonCollection.PersonCollectionItem.OtherNamesList }
         *     
         */
        public void setOtherNamesList(PersonCollection.PersonCollectionItem.OtherNamesList value) {
            this.otherNamesList = value;
        }

        /**
         * Gets the value of the taxFilingsList property.
         * 
         * @return
         *     possible object is
         *     {@link PersonCollection.PersonCollectionItem.TaxFilingsList }
         *     
         */
        public PersonCollection.PersonCollectionItem.TaxFilingsList getTaxFilingsList() {
            return taxFilingsList;
        }

        /**
         * Sets the value of the taxFilingsList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonCollection.PersonCollectionItem.TaxFilingsList }
         *     
         */
        public void setTaxFilingsList(PersonCollection.PersonCollectionItem.TaxFilingsList value) {
            this.taxFilingsList = value;
        }

        /**
         * Gets the value of the addressesList property.
         * 
         * @return
         *     possible object is
         *     {@link PersonCollection.PersonCollectionItem.AddressesList }
         *     
         */
        public PersonCollection.PersonCollectionItem.AddressesList getAddressesList() {
            return addressesList;
        }

        /**
         * Sets the value of the addressesList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonCollection.PersonCollectionItem.AddressesList }
         *     
         */
        public void setAddressesList(PersonCollection.PersonCollectionItem.AddressesList value) {
            this.addressesList = value;
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
         * Gets the value of the netWorth property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNetWorth() {
            return netWorth;
        }

        /**
         * Sets the value of the netWorth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNetWorth(BigDecimal value) {
            this.netWorth = value;
        }

        /**
         * Gets the value of the netWorthSpecialValue property.
         * 
         * @return
         *     possible object is
         *     {@link SpecialValueEnum }
         *     
         */
        public SpecialValueEnum getNetWorthSpecialValue() {
            return netWorthSpecialValue;
        }

        /**
         * Sets the value of the netWorthSpecialValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialValueEnum }
         *     
         */
        public void setNetWorthSpecialValue(SpecialValueEnum value) {
            this.netWorthSpecialValue = value;
        }

        /**
         * Gets the value of the preferredLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferredLanguage() {
            return preferredLanguage;
        }

        /**
         * Sets the value of the preferredLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferredLanguage(String value) {
            this.preferredLanguage = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOB(String value) {
            this.dob = value;
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
         *         &lt;element name="address" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterinterface}PersonCollection_addresses" maxOccurs="unbounded"/>
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
            "address"
        })
        public static class AddressesList {

            @XmlElement(required = true)
            protected List<PersonCollectionAddresses> address;

            /**
             * Gets the value of the address property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the address property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddress().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PersonCollectionAddresses }
             * 
             * 
             */
            public List<PersonCollectionAddresses> getAddress() {
                if (address == null) {
                    address = new ArrayList<PersonCollectionAddresses>();
                }
                return this.address;
            }

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
         *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
            "item"
        })
        public static class OtherNamesList {

            @XmlElement(required = true)
            protected List<String> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getItem() {
                if (item == null) {
                    item = new ArrayList<String>();
                }
                return this.item;
            }

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
         *         &lt;element name="taxFilings" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
         *                 &lt;/sequence>
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
        @XmlType(name = "", propOrder = {
            "taxFilings"
        })
        public static class TaxFilingsList {

            protected List<PersonCollection.PersonCollectionItem.TaxFilingsList.TaxFilings> taxFilings;

            /**
             * Gets the value of the taxFilings property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxFilings property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxFilings().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PersonCollection.PersonCollectionItem.TaxFilingsList.TaxFilings }
             * 
             * 
             */
            public List<PersonCollection.PersonCollectionItem.TaxFilingsList.TaxFilings> getTaxFilings() {
                if (taxFilings == null) {
                    taxFilings = new ArrayList<PersonCollection.PersonCollectionItem.TaxFilingsList.TaxFilings>();
                }
                return this.taxFilings;
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
            public static class TaxFilings {

                @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
                protected LinkType link;

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

            }

        }

    }

}
