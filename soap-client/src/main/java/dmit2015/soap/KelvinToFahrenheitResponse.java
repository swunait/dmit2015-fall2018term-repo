
package dmit2015.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kelvinToFahrenheitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kelvinToFahrenheitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fahrenheitValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kelvinToFahrenheitResponse", propOrder = {
    "fahrenheitValue"
})
public class KelvinToFahrenheitResponse {

    protected double fahrenheitValue;

    /**
     * Gets the value of the fahrenheitValue property.
     * 
     */
    public double getFahrenheitValue() {
        return fahrenheitValue;
    }

    /**
     * Sets the value of the fahrenheitValue property.
     * 
     */
    public void setFahrenheitValue(double value) {
        this.fahrenheitValue = value;
    }

}
