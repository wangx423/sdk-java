//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 04:19:10 PM PDT 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settingNameEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="settingNameEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="emailCustomer"/>
 *     &lt;enumeration value="merchantEmail"/>
 *     &lt;enumeration value="allowPartialAuth"/>
 *     &lt;enumeration value="headerEmailReceipt"/>
 *     &lt;enumeration value="footerEmailReceipt"/>
 *     &lt;enumeration value="recurringBilling"/>
 *     &lt;enumeration value="duplicateWindow"/>
 *     &lt;enumeration value="testRequest"/>
 *     &lt;enumeration value="hostedProfileReturnUrl"/>
 *     &lt;enumeration value="hostedProfileReturnUrlText"/>
 *     &lt;enumeration value="hostedProfilePageBorderVisible"/>
 *     &lt;enumeration value="hostedProfileIFrameCommunicatorUrl"/>
 *     &lt;enumeration value="hostedProfileHeadingBgColor"/>
 *     &lt;enumeration value="hostedProfileValidationMode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "settingNameEnum")
@XmlEnum
public enum SettingNameEnum {


    /**
     * true/false. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("emailCustomer")
    EMAIL_CUSTOMER("emailCustomer"),

    /**
     * string. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("merchantEmail")
    MERCHANT_EMAIL("merchantEmail"),

    /**
     * true/false. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("allowPartialAuth")
    ALLOW_PARTIAL_AUTH("allowPartialAuth"),

    /**
     * string. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("headerEmailReceipt")
    HEADER_EMAIL_RECEIPT("headerEmailReceipt"),

    /**
     * string. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("footerEmailReceipt")
    FOOTER_EMAIL_RECEIPT("footerEmailReceipt"),

    /**
     * true/false. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("recurringBilling")
    RECURRING_BILLING("recurringBilling"),

    /**
     * number. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("duplicateWindow")
    DUPLICATE_WINDOW("duplicateWindow"),

    /**
     * true/false. Used by createTransaction method.
     * 
     */
    @XmlEnumValue("testRequest")
    TEST_REQUEST("testRequest"),

    /**
     * string. Used by getHostedProfilePage method.
     * 
     */
    @XmlEnumValue("hostedProfileReturnUrl")
    HOSTED_PROFILE_RETURN_URL("hostedProfileReturnUrl"),

    /**
     * string. Used by getHostedProfilePage method.
     * 
     */
    @XmlEnumValue("hostedProfileReturnUrlText")
    HOSTED_PROFILE_RETURN_URL_TEXT("hostedProfileReturnUrlText"),

    /**
     * true/false. Used by getHostedProfilePage method.
     * 
     */
    @XmlEnumValue("hostedProfilePageBorderVisible")
    HOSTED_PROFILE_PAGE_BORDER_VISIBLE("hostedProfilePageBorderVisible"),

    /**
     * string. Used by getHostedProfilePage method.
     * 
     */
    @XmlEnumValue("hostedProfileIFrameCommunicatorUrl")
    HOSTED_PROFILE_I_FRAME_COMMUNICATOR_URL("hostedProfileIFrameCommunicatorUrl"),

    /**
     * #e0e0e0. Used by getHostedProfilePage method.
     * 
     */
    @XmlEnumValue("hostedProfileHeadingBgColor")
    HOSTED_PROFILE_HEADING_BG_COLOR("hostedProfileHeadingBgColor"),

    /**
     * 
     *                         liveMode/testMode 
     *                         liveMode: generates a transaction to the processor in the amount of 0.01 or 0.00. is immediately voided, if successful.
     *                         testMode: performs field validation only, all fields are validated except unrestricted field definitions (viz. telephone number) do not generate errors.
     *                         If a validation transaction is unsuccessful, the profile is not created, and the merchant receives an error.
     *                     
     * 
     */
    @XmlEnumValue("hostedProfileValidationMode")
    HOSTED_PROFILE_VALIDATION_MODE("hostedProfileValidationMode");
    private final String value;

    SettingNameEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettingNameEnum fromValue(String v) {
        for (SettingNameEnum c: SettingNameEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
