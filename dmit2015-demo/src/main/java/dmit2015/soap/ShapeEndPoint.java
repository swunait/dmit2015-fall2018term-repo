
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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ShapeEndPoint", targetNamespace = "http://localhost/", wsdlLocation = "http://localhost:8080/dmit2015-fall2018term-demo/ShapeEndPoint?wsdl")
public class ShapeEndPoint
    extends Service
{

    private final static URL SHAPEENDPOINT_WSDL_LOCATION;
    private final static WebServiceException SHAPEENDPOINT_EXCEPTION;
    private final static QName SHAPEENDPOINT_QNAME = new QName("http://localhost/", "ShapeEndPoint");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/dmit2015-fall2018term-demo/ShapeEndPoint?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHAPEENDPOINT_WSDL_LOCATION = url;
        SHAPEENDPOINT_EXCEPTION = e;
    }

    public ShapeEndPoint() {
        super(__getWsdlLocation(), SHAPEENDPOINT_QNAME);
    }

    public ShapeEndPoint(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHAPEENDPOINT_QNAME, features);
    }

    public ShapeEndPoint(URL wsdlLocation) {
        super(wsdlLocation, SHAPEENDPOINT_QNAME);
    }

    public ShapeEndPoint(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHAPEENDPOINT_QNAME, features);
    }

    public ShapeEndPoint(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShapeEndPoint(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ShapeXmlWebService
     */
    @WebEndpoint(name = "ShapePort")
    public ShapeXmlWebService getShapePort() {
        return super.getPort(new QName("http://localhost/", "ShapePort"), ShapeXmlWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShapeXmlWebService
     */
    @WebEndpoint(name = "ShapePort")
    public ShapeXmlWebService getShapePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost/", "ShapePort"), ShapeXmlWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHAPEENDPOINT_EXCEPTION!= null) {
            throw SHAPEENDPOINT_EXCEPTION;
        }
        return SHAPEENDPOINT_WSDL_LOCATION;
    }

}
