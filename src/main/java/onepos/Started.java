
package onepos;

import javax.persistence.Embedded;

import lombok.Data;

@Data
public class Started extends AbstractEvent {

	 private int id; 
	    private int orderId;
	    private int storeId;
	    private String status;
	    private OrderStatus orderStatus;
	    private String nextStep;
	    
	    @Embedded
	    OrderItem orderItems = new OrderItem();

}
