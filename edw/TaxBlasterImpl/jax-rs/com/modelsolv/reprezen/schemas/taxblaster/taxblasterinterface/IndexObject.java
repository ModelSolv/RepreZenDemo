
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2005.atom.LinkType;


/**
 * <p>Java class for IndexObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peopleList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="people" maxOccurs="unbounded" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexObject", propOrder = {
    "peopleList",
    "taxFilingsList"
})
public class IndexObject {

    protected IndexObject.PeopleList peopleList;
    protected IndexObject.TaxFilingsList taxFilingsList;

    /**
     * Gets the value of the peopleList property.
     * 
     * @return
     *     possible object is
     *     {@link IndexObject.PeopleList }
     *     
     */
    public IndexObject.PeopleList getPeopleList() {
        return peopleList;
    }

    /**
     * Sets the value of the peopleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexObject.PeopleList }
     *     
     */
    public void setPeopleList(IndexObject.PeopleList value) {
        this.peopleList = value;
    }

    /**
     * Gets the value of the taxFilingsList property.
     * 
     * @return
     *     possible object is
     *     {@link IndexObject.TaxFilingsList }
     *     
     */
    public IndexObject.TaxFilingsList getTaxFilingsList() {
        return taxFilingsList;
    }

    /**
     * Sets the value of the taxFilingsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexObject.TaxFilingsList }
     *     
     */
    public void setTaxFilingsList(IndexObject.TaxFilingsList value) {
        this.taxFilingsList = value;
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
     *         &lt;element name="people" maxOccurs="unbounded" minOccurs="0">
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
        "people"
    })
    public static class PeopleList {

        protected List<IndexObject.PeopleList.People> people;

        /**
         * Gets the value of the people property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the people property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPeople().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndexObject.PeopleList.People }
         * 
         * 
         */
        public List<IndexObject.PeopleList.People> getPeople() {
            if (people == null) {
                people = new ArrayList<IndexObject.PeopleList.People>();
            }
            return this.people;
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
        public static class People {

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

        protected List<IndexObject.TaxFilingsList.TaxFilings> taxFilings;

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
         * {@link IndexObject.TaxFilingsList.TaxFilings }
         * 
         * 
         */
        public List<IndexObject.TaxFilingsList.TaxFilings> getTaxFilings() {
            if (taxFilings == null) {
                taxFilings = new ArrayList<IndexObject.TaxFilingsList.TaxFilings>();
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
