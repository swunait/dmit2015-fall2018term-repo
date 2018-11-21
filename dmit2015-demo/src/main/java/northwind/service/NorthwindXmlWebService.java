package northwind.service;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import northwind.entity.Shipper;

@WebService(
		serviceName="NorthwindEndPoint",
		targetNamespace="http://localhost/",
		portName="NorthwindPort"
	)
public class NorthwindXmlWebService {

	@Inject
	private NorthwindService northwindService;
	
	public List<Shipper> findAllShipper() {
		return northwindService.findAllShipper();		
	}
	
	public @WebResult(name="Shipper") Shipper findOneShipper(@WebParam(name="shipperId") int shipperId) {
		return northwindService.findOneShipper(shipperId);
	}
	
	
}
