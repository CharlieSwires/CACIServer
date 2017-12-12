package caci.order.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		return uniqueInstance;
	}
	
	private HashMap<Integer,RetrieveOrderBean> internalStore = new HashMap<Integer,RetrieveOrderBean>();

	private int orderNum = 0;
	
	public MakeOrderBean makeOrder(long bricks){
		RetrieveOrderBean newOrder = new RetrieveOrderBean();
		newOrder.setBricks(bricks);
		newOrder.setOrderNum(orderNum);
		internalStore.put(orderNum, newOrder);
		MakeOrderBean returnValue = new MakeOrderBean();
		returnValue.setOrderNum(orderNum++);
		return returnValue;
	}

	public RetrieveOrderBean retrieveOrder(int orderNum2) {
		// TODO Auto-generated method stub
		return (RetrieveOrderBean) internalStore.get(orderNum2);
	}

	public RetrieveOrdersBean retrieveOrders() {
		
		Collection<RetrieveOrderBean> list = (Collection<RetrieveOrderBean>) internalStore.values();
		ArrayList<RetrieveOrderBean> alist = new ArrayList<RetrieveOrderBean>();
		for(RetrieveOrderBean item: list){
			alist.add(item);
		}
		RetrieveOrdersBean bean = new RetrieveOrdersBean();
		bean.setBeans((List<RetrieveOrderBean>)alist);
		return bean;
	}
}
