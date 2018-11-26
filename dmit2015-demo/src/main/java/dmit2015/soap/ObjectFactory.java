
package dmit2015.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dmit2015.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AreaOfCircleResponse_QNAME = new QName("http://localhost/", "areaOfCircleResponse");
    private final static QName _CircumferenceOfCircle_QNAME = new QName("http://localhost/", "circumferenceOfCircle");
    private final static QName _DiameterOfCiricle_QNAME = new QName("http://localhost/", "diameterOfCiricle");
    private final static QName _CircumferenceOfCircleResponse_QNAME = new QName("http://localhost/", "circumferenceOfCircleResponse");
    private final static QName _DiameterOfCiricleResponse_QNAME = new QName("http://localhost/", "diameterOfCiricleResponse");
    private final static QName _AreaOfCircle_QNAME = new QName("http://localhost/", "areaOfCircle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dmit2015.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CircumferenceOfCircleResponse }
     * 
     */
    public CircumferenceOfCircleResponse createCircumferenceOfCircleResponse() {
        return new CircumferenceOfCircleResponse();
    }

    /**
     * Create an instance of {@link DiameterOfCiricleResponse }
     * 
     */
    public DiameterOfCiricleResponse createDiameterOfCiricleResponse() {
        return new DiameterOfCiricleResponse();
    }

    /**
     * Create an instance of {@link AreaOfCircleResponse }
     * 
     */
    public AreaOfCircleResponse createAreaOfCircleResponse() {
        return new AreaOfCircleResponse();
    }

    /**
     * Create an instance of {@link CircumferenceOfCircle }
     * 
     */
    public CircumferenceOfCircle createCircumferenceOfCircle() {
        return new CircumferenceOfCircle();
    }

    /**
     * Create an instance of {@link DiameterOfCiricle }
     * 
     */
    public DiameterOfCiricle createDiameterOfCiricle() {
        return new DiameterOfCiricle();
    }

    /**
     * Create an instance of {@link AreaOfCircle }
     * 
     */
    public AreaOfCircle createAreaOfCircle() {
        return new AreaOfCircle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaOfCircleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/", name = "areaOfCircleResponse")
    public JAXBElement<AreaOfCircleResponse> createAreaOfCircleResponse(AreaOfCircleResponse value) {
        return new JAXBElement<AreaOfCircleResponse>(_AreaOfCircleResponse_QNAME, AreaOfCircleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumferenceOfCircle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/", name = "circumferenceOfCircle")
    public JAXBElement<CircumferenceOfCircle> createCircumferenceOfCircle(CircumferenceOfCircle value) {
        return new JAXBElement<CircumferenceOfCircle>(_CircumferenceOfCircle_QNAME, CircumferenceOfCircle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiameterOfCiricle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/", name = "diameterOfCiricle")
    public JAXBElement<DiameterOfCiricle> createDiameterOfCiricle(DiameterOfCiricle value) {
        return new JAXBElement<DiameterOfCiricle>(_DiameterOfCiricle_QNAME, DiameterOfCiricle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumferenceOfCircleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/", name = "circumferenceOfCircleResponse")
    public JAXBElement<CircumferenceOfCircleResponse> createCircumferenceOfCircleResponse(CircumferenceOfCircleResponse value) {
        return new JAXBElement<CircumferenceOfCircleResponse>(_CircumferenceOfCircleResponse_QNAME, CircumferenceOfCircleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiameterOfCiricleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/", name = "diameterOfCiricleResponse")
    public JAXBElement<DiameterOfCiricleResponse> createDiameterOfCiricleResponse(DiameterOfCiricleResponse value) {
        return new JAXBElement<DiameterOfCiricleResponse>(_DiameterOfCiricleResponse_QNAME, DiameterOfCiricleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaOfCircle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/", name = "areaOfCircle")
    public JAXBElement<AreaOfCircle> createAreaOfCircle(AreaOfCircle value) {
        return new JAXBElement<AreaOfCircle>(_AreaOfCircle_QNAME, AreaOfCircle.class, null, value);
    }

}
