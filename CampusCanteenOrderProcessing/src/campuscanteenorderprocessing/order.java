
package campuscanteenorderprocessing;

public class order {
    
    private int orderNumber;
    private String customerName;
    private String orderItem;

    public order(int orderNumber, String customerName, String orderItem) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderItem = orderItem;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderItem() {
        return orderItem;
    }
}