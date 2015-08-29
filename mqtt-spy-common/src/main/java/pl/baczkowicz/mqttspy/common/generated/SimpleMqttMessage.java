//
// Copyright (c) 2015 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SimpleMqttMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleMqttMessage"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="topic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="qos" type="{http://baczkowicz.pl/mqtt-spy/common}qos" /&gt;
 *       &lt;attribute name="retained" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
*/
@SuppressWarnings("all")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleMqttMessage", propOrder = {
    "value"
})
@XmlSeeAlso({
    LoggedMqttMessage.class
})
public class SimpleMqttMessage implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "topic", required = true)
    protected String topic;
    @XmlAttribute(name = "qos")
    protected Integer qos;
    @XmlAttribute(name = "retained")
    protected Boolean retained;

    /**
     * Default no-arg constructor
     * 
     */
    public SimpleMqttMessage() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SimpleMqttMessage(final String value, final String topic, final Integer qos, final Boolean retained) {
        this.value = value;
        this.topic = topic;
        this.qos = qos;
        this.retained = retained;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the qos property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQos() {
        return qos;
    }

    /**
     * Sets the value of the qos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQos(Integer value) {
        this.qos = value;
    }

    /**
     * Gets the value of the retained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetained() {
        return retained;
    }

    /**
     * Sets the value of the retained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetained(Boolean value) {
        this.retained = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            strategy.appendField(locator, this, "topic", buffer, theTopic);
        }
        {
            Integer theQos;
            theQos = this.getQos();
            strategy.appendField(locator, this, "qos", buffer, theQos);
        }
        {
            Boolean theRetained;
            theRetained = this.isRetained();
            strategy.appendField(locator, this, "retained", buffer, theRetained);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SimpleMqttMessage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SimpleMqttMessage that = ((SimpleMqttMessage) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsTopic;
            lhsTopic = this.getTopic();
            String rhsTopic;
            rhsTopic = that.getTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                return false;
            }
        }
        {
            Integer lhsQos;
            lhsQos = this.getQos();
            Integer rhsQos;
            rhsQos = that.getQos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qos", lhsQos), LocatorUtils.property(thatLocator, "qos", rhsQos), lhsQos, rhsQos)) {
                return false;
            }
        }
        {
            Boolean lhsRetained;
            lhsRetained = this.isRetained();
            Boolean rhsRetained;
            rhsRetained = that.isRetained();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retained", lhsRetained), LocatorUtils.property(thatLocator, "retained", rhsRetained), lhsRetained, rhsRetained)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
        }
        {
            Integer theQos;
            theQos = this.getQos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qos", theQos), currentHashCode, theQos);
        }
        {
            Boolean theRetained;
            theRetained = this.isRetained();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retained", theRetained), currentHashCode, theRetained);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof SimpleMqttMessage) {
            final SimpleMqttMessage copy = ((SimpleMqttMessage) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.topic!= null) {
                String sourceTopic;
                sourceTopic = this.getTopic();
                String copyTopic = ((String) strategy.copy(LocatorUtils.property(locator, "topic", sourceTopic), sourceTopic));
                copy.setTopic(copyTopic);
            } else {
                copy.topic = null;
            }
            if (this.qos!= null) {
                Integer sourceQos;
                sourceQos = this.getQos();
                Integer copyQos = ((Integer) strategy.copy(LocatorUtils.property(locator, "qos", sourceQos), sourceQos));
                copy.setQos(copyQos);
            } else {
                copy.qos = null;
            }
            if (this.retained!= null) {
                Boolean sourceRetained;
                sourceRetained = this.isRetained();
                Boolean copyRetained = ((Boolean) strategy.copy(LocatorUtils.property(locator, "retained", sourceRetained), sourceRetained));
                copy.setRetained(copyRetained);
            } else {
                copy.retained = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SimpleMqttMessage();
    }

}
