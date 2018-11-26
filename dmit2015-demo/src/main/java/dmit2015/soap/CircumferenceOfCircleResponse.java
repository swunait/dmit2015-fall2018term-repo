
package dmit2015.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circumferenceOfCircleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circumferenceOfCircleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="circumference" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circumferenceOfCircleResponse", propOrder = {
    "circumference"
})
public class CircumferenceOfCircleResponse {

    protected double circumference;

    /**
     * Gets the value of the circumference property.
     * 
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * Sets the value of the circumference property.
     * 
     */
    public void setCircumference(double value) {
        this.circumference = value;
    }

}
