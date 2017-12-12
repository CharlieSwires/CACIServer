package caci.order.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/OrderService")
public class OrderService {
	@POST
	@Path("/makeOrder")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public MakeOrderBean makeOrder(OrderBrick bricks) {

		Singleton store = Singleton.getInstance();
		MakeOrderBean result = store.makeOrder(bricks.getBricks());
		return result;

	}
	
	@POST
	@Path("/retrieveAllOrders")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public RetrieveOrdersBean retrieveAllOrders(Dummy val) {

		Singleton store = Singleton.getInstance();
		RetrieveOrdersBean result = store.retrieveOrders();
		return result;

	}
	
	@POST
	@Path("/retrieveOrder")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public RetrieveOrderBean retrieveOrder(OrderNum orderNum) {

		Singleton store = Singleton.getInstance();
		RetrieveOrderBean result = store.retrieveOrder(orderNum.getOrderNum());
		return result;

	}	

}
