package caci.order.resources;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class OrderBrick {

	private long bricks;

	public long getBricks() {
		return bricks;
	}

	public void setBricks(long bricks) {
		this.bricks = bricks;
	}
}
