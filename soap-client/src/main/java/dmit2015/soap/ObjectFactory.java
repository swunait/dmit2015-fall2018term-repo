
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

    private final static QName _KelvinToCelisus_QNAME = new QName("http://xml.webservices.dmit2015/", "kelvinToCelisus");
    private final static QName _KelvinToFahrenheitResponse_QNAME = new QName("http://xml.webservices.dmit2015/", "kelvinToFahrenheitResponse");
    private final static QName _CelisusToKelvinResponse_QNAME = new QName("http://xml.webservices.dmit2015/", "celisusToKelvinResponse");
    private final static QName _FahrenheitToCelisus_QNAME = new QName("http://xml.webservices.dmit2015/", "fahrenheitToCelisus");
    private final static QName _CelisusToKelvin_QNAME = new QName("http://xml.webservices.dmit2015/", "celisusToKelvin");
    private final static QName _CelisusToFahrenheit_QNAME = new QName("http://xml.webservices.dmit2015/", "celisusToFahrenheit");
    private final static QName _CelisusToFahrenheitResponse_QNAME = new QName("http://xml.webservices.dmit2015/", "celisusToFahrenheitResponse");
    private final static QName _FahrenheitToKelvinResponse_QNAME = new QName("http://xml.webservices.dmit2015/", "fahrenheitToKelvinResponse");
    private final static QName _KelvinToFahrenheit_QNAME = new QName("http://xml.webservices.dmit2015/", "kelvinToFahrenheit");
    private final static QName _FahrenheitToKelvin_QNAME = new QName("http://xml.webservices.dmit2015/", "fahrenheitToKelvin");
    private final static QName _KelvinToCelisusResponse_QNAME = new QName("http://xml.webservices.dmit2015/", "kelvinToCelisusResponse");
    private final static QName _FahrenheitToCelisusResponse_QNAME = new QName("http://xml.webservices.dmit2015/", "fahrenheitToCelisusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dmit2015.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FahrenheitToCelisusResponse }
     * 
     */
    public FahrenheitToCelisusResponse createFahrenheitToCelisusResponse() {
        return new FahrenheitToCelisusResponse();
    }

    /**
     * Create an instance of {@link KelvinToFahrenheit }
     * 
     */
    public KelvinToFahrenheit createKelvinToFahrenheit() {
        return new KelvinToFahrenheit();
    }

    /**
     * Create an instance of {@link CelisusToFahrenheitResponse }
     * 
     */
    public CelisusToFahrenheitResponse createCelisusToFahrenheitResponse() {
        return new CelisusToFahrenheitResponse();
    }

    /**
     * Create an instance of {@link FahrenheitToKelvinResponse }
     * 
     */
    public FahrenheitToKelvinResponse createFahrenheitToKelvinResponse() {
        return new FahrenheitToKelvinResponse();
    }

    /**
     * Create an instance of {@link FahrenheitToKelvin }
     * 
     */
    public FahrenheitToKelvin createFahrenheitToKelvin() {
        return new FahrenheitToKelvin();
    }

    /**
     * Create an instance of {@link KelvinToCelisusResponse }
     * 
     */
    public KelvinToCelisusResponse createKelvinToCelisusResponse() {
        return new KelvinToCelisusResponse();
    }

    /**
     * Create an instance of {@link CelisusToKelvinResponse }
     * 
     */
    public CelisusToKelvinResponse createCelisusToKelvinResponse() {
        return new CelisusToKelvinResponse();
    }

    /**
     * Create an instance of {@link FahrenheitToCelisus }
     * 
     */
    public FahrenheitToCelisus createFahrenheitToCelisus() {
        return new FahrenheitToCelisus();
    }

    /**
     * Create an instance of {@link CelisusToFahrenheit }
     * 
     */
    public CelisusToFahrenheit createCelisusToFahrenheit() {
        return new CelisusToFahrenheit();
    }

    /**
     * Create an instance of {@link CelisusToKelvin }
     * 
     */
    public CelisusToKelvin createCelisusToKelvin() {
        return new CelisusToKelvin();
    }

    /**
     * Create an instance of {@link KelvinToCelisus }
     * 
     */
    public KelvinToCelisus createKelvinToCelisus() {
        return new KelvinToCelisus();
    }

    /**
     * Create an instance of {@link KelvinToFahrenheitResponse }
     * 
     */
    public KelvinToFahrenheitResponse createKelvinToFahrenheitResponse() {
        return new KelvinToFahrenheitResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelisus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "kelvinToCelisus")
    public JAXBElement<KelvinToCelisus> createKelvinToCelisus(KelvinToCelisus value) {
        return new JAXBElement<KelvinToCelisus>(_KelvinToCelisus_QNAME, KelvinToCelisus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToFahrenheitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "kelvinToFahrenheitResponse")
    public JAXBElement<KelvinToFahrenheitResponse> createKelvinToFahrenheitResponse(KelvinToFahrenheitResponse value) {
        return new JAXBElement<KelvinToFahrenheitResponse>(_KelvinToFahrenheitResponse_QNAME, KelvinToFahrenheitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelisusToKelvinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "celisusToKelvinResponse")
    public JAXBElement<CelisusToKelvinResponse> createCelisusToKelvinResponse(CelisusToKelvinResponse value) {
        return new JAXBElement<CelisusToKelvinResponse>(_CelisusToKelvinResponse_QNAME, CelisusToKelvinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitToCelisus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "fahrenheitToCelisus")
    public JAXBElement<FahrenheitToCelisus> createFahrenheitToCelisus(FahrenheitToCelisus value) {
        return new JAXBElement<FahrenheitToCelisus>(_FahrenheitToCelisus_QNAME, FahrenheitToCelisus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelisusToKelvin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "celisusToKelvin")
    public JAXBElement<CelisusToKelvin> createCelisusToKelvin(CelisusToKelvin value) {
        return new JAXBElement<CelisusToKelvin>(_CelisusToKelvin_QNAME, CelisusToKelvin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelisusToFahrenheit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "celisusToFahrenheit")
    public JAXBElement<CelisusToFahrenheit> createCelisusToFahrenheit(CelisusToFahrenheit value) {
        return new JAXBElement<CelisusToFahrenheit>(_CelisusToFahrenheit_QNAME, CelisusToFahrenheit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelisusToFahrenheitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "celisusToFahrenheitResponse")
    public JAXBElement<CelisusToFahrenheitResponse> createCelisusToFahrenheitResponse(CelisusToFahrenheitResponse value) {
        return new JAXBElement<CelisusToFahrenheitResponse>(_CelisusToFahrenheitResponse_QNAME, CelisusToFahrenheitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitToKelvinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "fahrenheitToKelvinResponse")
    public JAXBElement<FahrenheitToKelvinResponse> createFahrenheitToKelvinResponse(FahrenheitToKelvinResponse value) {
        return new JAXBElement<FahrenheitToKelvinResponse>(_FahrenheitToKelvinResponse_QNAME, FahrenheitToKelvinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToFahrenheit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "kelvinToFahrenheit")
    public JAXBElement<KelvinToFahrenheit> createKelvinToFahrenheit(KelvinToFahrenheit value) {
        return new JAXBElement<KelvinToFahrenheit>(_KelvinToFahrenheit_QNAME, KelvinToFahrenheit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitToKelvin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "fahrenheitToKelvin")
    public JAXBElement<FahrenheitToKelvin> createFahrenheitToKelvin(FahrenheitToKelvin value) {
        return new JAXBElement<FahrenheitToKelvin>(_FahrenheitToKelvin_QNAME, FahrenheitToKelvin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelisusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "kelvinToCelisusResponse")
    public JAXBElement<KelvinToCelisusResponse> createKelvinToCelisusResponse(KelvinToCelisusResponse value) {
        return new JAXBElement<KelvinToCelisusResponse>(_KelvinToCelisusResponse_QNAME, KelvinToCelisusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitToCelisusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.webservices.dmit2015/", name = "fahrenheitToCelisusResponse")
    public JAXBElement<FahrenheitToCelisusResponse> createFahrenheitToCelisusResponse(FahrenheitToCelisusResponse value) {
        return new JAXBElement<FahrenheitToCelisusResponse>(_FahrenheitToCelisusResponse_QNAME, FahrenheitToCelisusResponse.class, null, value);
    }

}
