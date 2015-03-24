
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDefinedDataTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedDataTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ssn" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}SocialSecurityNumber" />
 *       &lt;attribute name="day1" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}DayOfYear" />
 *       &lt;attribute name="da12" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}DayOfYear1" />
 *       &lt;attribute name="quantity" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}WholesaleQuantity" />
 *       &lt;attribute name="fValue" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}FractionalValue" />
 *       &lt;attribute name="age" type="{http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel}ChildTravelerAge" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedDataTypes")
public class UserDefinedDataTypes {

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "ssn")
    protected String ssn;
    @XmlAttribute(name = "day1")
    protected Integer day1;
    @XmlAttribute(name = "da12")
    protected Integer da12;
    @XmlAttribute(name = "quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "fValue")
    protected BigDecimal fValue;
    @XmlAttribute(name = "age")
    protected BigInteger age;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the day1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDay1() {
        return day1;
    }

    /**
     * Sets the value of the day1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDay1(Integer value) {
        this.day1 = value;
    }

    /**
     * Gets the value of the da12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDa12() {
        return da12;
    }

    /**
     * Sets the value of the da12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDa12(Integer value) {
        this.da12 = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the fValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFValue() {
        return fValue;
    }

    /**
     * Sets the value of the fValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFValue(BigDecimal value) {
        this.fValue = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

}
