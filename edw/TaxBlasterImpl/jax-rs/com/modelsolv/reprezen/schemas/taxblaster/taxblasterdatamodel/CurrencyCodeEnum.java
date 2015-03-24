
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Euro"/>
 *     &lt;enumeration value="Canadian Dollar"/>
 *     &lt;enumeration value="US Dollar"/>
 *     &lt;enumeration value="Swiss Franc"/>
 *     &lt;enumeration value="Japanese Yen"/>
 *     &lt;enumeration value="Indian Rupee"/>
 *     &lt;enumeration value="Brazilian Real"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeEnum", namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel")
@XmlEnum
public enum CurrencyCodeEnum {

    @XmlEnumValue("Euro")
    EUR("Euro"),
    @XmlEnumValue("Canadian Dollar")
    CAD("Canadian Dollar"),
    @XmlEnumValue("US Dollar")
    USD("US Dollar"),
    @XmlEnumValue("Swiss Franc")
    CHF("Swiss Franc"),
    @XmlEnumValue("Japanese Yen")
    JPY("Japanese Yen"),
    @XmlEnumValue("Indian Rupee")
    INR("Indian Rupee"),
    @XmlEnumValue("Brazilian Real")
    BRL("Brazilian Real");
    private final String value;

    CurrencyCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyCodeEnum fromValue(String v) {
        for (CurrencyCodeEnum c: CurrencyCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
