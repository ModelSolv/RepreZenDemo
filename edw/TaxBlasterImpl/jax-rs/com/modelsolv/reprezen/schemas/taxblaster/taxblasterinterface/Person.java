
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


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
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
@XmlType(name = "Person", propOrder = {
    "otherNamesList"
})
public class Person {

    protected Person.OtherNamesList otherNamesList;
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
     *     {@link Person.OtherNamesList }
     *     
     */
    public Person.OtherNamesList getOtherNamesList() {
        return otherNamesList;
    }

    /**
     * Sets the value of the otherNamesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.OtherNamesList }
     *     
     */
    public void setOtherNamesList(Person.OtherNamesList value) {
        this.otherNamesList = value;
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

}
