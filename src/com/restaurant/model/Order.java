public class Order {
    private int orderId;
    private String orderDetails;
    private double orderAmount;

    public Order(int orderId, String orderDetails, double orderAmount) {
        this.orderId = orderId;
        this.orderDetails = orderDetails;
        this.orderAmount = orderAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}