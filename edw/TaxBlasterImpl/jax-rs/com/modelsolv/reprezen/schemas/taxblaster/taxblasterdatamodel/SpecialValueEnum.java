
package com.modelsolv.reprezen.schemas.taxblaster.taxblasterdatamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialValueEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialValueEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="-65534"/>
 *     &lt;enumeration value="-65533"/>
 *     &lt;enumeration value="-65532"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialValueEnum", namespace = "http://modelsolv.com/reprezen/schemas/taxblaster/taxblasterdatamodel")
@XmlEnum(Integer.class)
public enum SpecialValueEnum {

    @XmlEnumValue("0")
    NORMAL_VALUE(0),
    @XmlEnumValue("-65534")
    NOT_AVAILABLE(-65534),
    @XmlEnumValue("-65533")
    NOT_APPLICABLE(-65533),
    @XmlEnumValue("-65532")
    RESTRICTED(-65532);
    private final int value;

    SpecialValueEnum(int v) {
        value = v;
    }

    public int value() {
        return value;
    }

    public static SpecialValueEnum fromValue(int v) {
        for (SpecialValueEnum c: SpecialValueEnum.values()) {
            if (c.value == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }

}
