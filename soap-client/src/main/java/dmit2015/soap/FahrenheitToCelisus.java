
package dmit2015.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fahrenheitToCelisus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fahrenheitToCelisus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fahrenheintValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fahrenheitToCelisus", propOrder = {
    "fahrenheintValue"
})
public class FahrenheitToCelisus {

    protected double fahrenheintValue;

    /**
     * Gets the value of the fahrenheintValue property.
     * 
     */
    public double getFahrenheintValue() {
        return fahrenheintValue;
    }

    /**
     * Sets the value of the fahrenheintValue property.
     * 
     */
    public void setFahrenheintValue(double value) {
        this.fahrenheintValue = value;
    }

}
