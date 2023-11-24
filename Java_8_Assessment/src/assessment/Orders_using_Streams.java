package assessment;

import java.util.Arrays;
import java.util.List;

public class Orders_using_Streams {
	
	private int orderId;
    private double price;
    private String status;
    
    
	public Orders_using_Streams(int orderId, double price, String status) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "[orderId=" + orderId + ", price=" + price + ", status=" + status + "]";
	}
    
	public static void main(String[] args) {
        List<Orders_using_Streams> orders = Arrays.asList(
                new Orders_using_Streams(1, 12000, "ACCEPTED"),
                new Orders_using_Streams(2, 8000, "PENDING"),
                new Orders_using_Streams(3, 15000, "COMPLETED"),
                new Orders_using_Streams(4, 9000, "ACCEPTED"),
                new Orders_using_Streams(5, 11000, "COMPLETED")
        );

        // Use lambda expressions and Stream API to filter and print orders
        orders.stream()
                .filter(order -> order.getPrice() > 10000 && ("ACCEPTED".equals(order.getStatus()) || "COMPLETED".equals(order.getStatus())))
                .forEach(System.out::println);
    }

}
