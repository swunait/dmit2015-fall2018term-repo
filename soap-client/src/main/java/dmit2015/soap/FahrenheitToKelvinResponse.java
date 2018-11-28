
package dmit2015.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fahrenheitToKelvinResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fahrenheitToKelvinResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kelvinValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fahrenheitToKelvinResponse", propOrder = {
    "kelvinValue"
})
public class FahrenheitToKelvinResponse {

    protected double kelvinValue;

    /**
     * Gets the value of the kelvinValue property.
     * 
     */
    public double getKelvinValue() {
        return kelvinValue;
    }

    /**
     * Sets the value of the kelvinValue property.
     * 
     */
    public void setKelvinValue(double value) {
        this.kelvinValue = value;
    }

}
