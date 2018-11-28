
package dmit2015.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TemperatureConverterService", targetNamespace = "http://xml.webservices.dmit2015/", wsdlLocation = "http://localhost:8080/dmit2015-fall2018term-demo/TemperatureConverter?wsdl")
public class TemperatureConverterService
    extends Service
{

    private final static URL TEMPERATURECONVERTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException TEMPERATURECONVERTERSERVICE_EXCEPTION;
    private final static QName TEMPERATURECONVERTERSERVICE_QNAME = new QName("http://xml.webservices.dmit2015/", "TemperatureConverterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/dmit2015-fall2018term-demo/TemperatureConverter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPERATURECONVERTERSERVICE_WSDL_LOCATION = url;
        TEMPERATURECONVERTERSERVICE_EXCEPTION = e;
    }

    public TemperatureConverterService() {
        super(__getWsdlLocation(), TEMPERATURECONVERTERSERVICE_QNAME);
    }

    public TemperatureConverterService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPERATURECONVERTERSERVICE_QNAME, features);
    }

    public TemperatureConverterService(URL wsdlLocation) {
        super(wsdlLocation, TEMPERATURECONVERTERSERVICE_QNAME);
    }

    public TemperatureConverterService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPERATURECONVERTERSERVICE_QNAME, features);
    }

    public TemperatureConverterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TemperatureConverterService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TemperatureConverter
     */
    @WebEndpoint(name = "TemperatureConverterPort")
    public TemperatureConverter getTemperatureConverterPort() {
        return super.getPort(new QName("http://xml.webservices.dmit2015/", "TemperatureConverterPort"), TemperatureConverter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TemperatureConverter
     */
    @WebEndpoint(name = "TemperatureConverterPort")
    public TemperatureConverter getTemperatureConverterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xml.webservices.dmit2015/", "TemperatureConverterPort"), TemperatureConverter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPERATURECONVERTERSERVICE_EXCEPTION!= null) {
            throw TEMPERATURECONVERTERSERVICE_EXCEPTION;
        }
        return TEMPERATURECONVERTERSERVICE_WSDL_LOCATION;
    }

}