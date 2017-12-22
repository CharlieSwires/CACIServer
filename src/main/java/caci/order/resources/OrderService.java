package caci.order.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/OrderService")
public class OrderService {
	@POST
	@Path("/makeOrder")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public MakeOrderBean makeOrder(OrderBrick bricks) {

		Singleton store = Singleton.getInstance();
		MakeOrderBean result = store.makeOrder(bricks.getBricks());
		return result;

	}
	
	@GET
	@Path("/retrieveOrder/{orderID}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public RetrieveOrderBean retrieveOrder(@PathParam("orderID") int orderNum) 
	{
	    Singleton store = Singleton.getInstance();
	    RetrieveOrderBean result = store.retrieveOrder(orderNum);
	    return result;
	}
	
	@GET
	@Path("/retrieveAllOrders")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public RetrieveOrdersBean retrieveAllOrders() {

		Singleton store = Singleton.getInstance();
		RetrieveOrdersBean result = store.retrieveOrders();
		return result;

	}
}
