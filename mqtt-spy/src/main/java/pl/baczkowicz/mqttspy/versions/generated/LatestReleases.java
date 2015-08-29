//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.29 at 06:35:20 PM BST 
//


package pl.baczkowicz.mqttspy.versions.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for LatestReleases complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatestReleases"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LatestRelease" type="{http://baczkowicz.pl/mqtt-spy-versions}LatestRelease" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatestReleases", propOrder = {
    "latestRelease"
})
public class LatestReleases
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "LatestRelease")
    protected List<LatestRelease> latestRelease;

    /**
     * Gets the value of the latestRelease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latestRelease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatestRelease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LatestRelease }
     * 
     * 
     */
    public List<LatestRelease> getLatestRelease() {
        if (latestRelease == null) {
            latestRelease = new ArrayList<LatestRelease>();
        }
        return this.latestRelease;
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
            List<LatestRelease> theLatestRelease;
            theLatestRelease = (((this.latestRelease!= null)&&(!this.latestRelease.isEmpty()))?this.getLatestRelease():null);
            strategy.appendField(locator, this, "latestRelease", buffer, theLatestRelease);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LatestReleases)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LatestReleases that = ((LatestReleases) object);
        {
            List<LatestRelease> lhsLatestRelease;
            lhsLatestRelease = (((this.latestRelease!= null)&&(!this.latestRelease.isEmpty()))?this.getLatestRelease():null);
            List<LatestRelease> rhsLatestRelease;
            rhsLatestRelease = (((that.latestRelease!= null)&&(!that.latestRelease.isEmpty()))?that.getLatestRelease():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestRelease", lhsLatestRelease), LocatorUtils.property(thatLocator, "latestRelease", rhsLatestRelease), lhsLatestRelease, rhsLatestRelease)) {
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
            List<LatestRelease> theLatestRelease;
            theLatestRelease = (((this.latestRelease!= null)&&(!this.latestRelease.isEmpty()))?this.getLatestRelease():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestRelease", theLatestRelease), currentHashCode, theLatestRelease);
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
        if (draftCopy instanceof LatestReleases) {
            final LatestReleases copy = ((LatestReleases) draftCopy);
            if ((this.latestRelease!= null)&&(!this.latestRelease.isEmpty())) {
                List<LatestRelease> sourceLatestRelease;
                sourceLatestRelease = (((this.latestRelease!= null)&&(!this.latestRelease.isEmpty()))?this.getLatestRelease():null);
                @SuppressWarnings("unchecked")
                List<LatestRelease> copyLatestRelease = ((List<LatestRelease> ) strategy.copy(LocatorUtils.property(locator, "latestRelease", sourceLatestRelease), sourceLatestRelease));
                copy.latestRelease = null;
                if (copyLatestRelease!= null) {
                    List<LatestRelease> uniqueLatestReleasel = copy.getLatestRelease();
                    uniqueLatestReleasel.addAll(copyLatestRelease);
                }
            } else {
                copy.latestRelease = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LatestReleases();
    }

}
