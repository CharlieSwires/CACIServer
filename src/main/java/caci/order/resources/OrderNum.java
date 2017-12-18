package caci.order.resources;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class OrderNum {
	private int orderNum;

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	 
}
