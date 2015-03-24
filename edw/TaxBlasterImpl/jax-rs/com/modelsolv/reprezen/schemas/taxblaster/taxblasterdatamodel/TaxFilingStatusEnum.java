
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFilingStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxFilingStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxFilingStatusEnum", namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel")
@XmlEnum(Integer.class)
public enum TaxFilingStatusEnum {

    @XmlEnumValue("0")
    DRAFT(0),
    @XmlEnumValue("1")
    PENDING_CPA_REVIEW(1),
    @XmlEnumValue("2")
    PENDING_CLIENT_REVIEW(2),
    @XmlEnumValue("3")
    FILED(3),
    @XmlEnumValue("4")
    AMENDED(4),
    @XmlEnumValue("5")
    CLOSED(5);
    private final int value;

    TaxFilingStatusEnum(int v) {
        value = v;
    }

    public int value() {
        return value;
    }

    public static TaxFilingStatusEnum fromValue(int v) {
        for (TaxFilingStatusEnum c: TaxFilingStatusEnum.values()) {
            if (c.value == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }

}
