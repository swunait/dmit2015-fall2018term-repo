
package dmit2015.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fahrenheitToCelisusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fahrenheitToCelisusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="celsiusValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fahrenheitToCelisusResponse", propOrder = {
    "celsiusValue"
})
public class FahrenheitToCelisusResponse {

    protected double celsiusValue;

    /**
     * Gets the value of the celsiusValue property.
     * 
     */
    public double getCelsiusValue() {
        return celsiusValue;
    }

    /**
     * Sets the value of the celsiusValue property.
     * 
     */
    public void setCelsiusValue(double value) {
        this.celsiusValue = value;
    }

}
