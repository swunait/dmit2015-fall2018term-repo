
package dmit2015.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for celisusToFahrenheit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="celisusToFahrenheit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="celisusValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "celisusToFahrenheit", propOrder = {
    "celisusValue"
})
public class CelisusToFahrenheit {

    protected double celisusValue;

    /**
     * Gets the value of the celisusValue property.
     * 
     */
    public double getCelisusValue() {
        return celisusValue;
    }

    /**
     * Sets the value of the celisusValue property.
     * 
     */
    public void setCelisusValue(double value) {
        this.celisusValue = value;
    }

}
