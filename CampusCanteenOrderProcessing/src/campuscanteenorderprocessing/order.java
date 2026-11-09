
package campuscanteenorderprocessing;

public class order {

    private int orderNumber;
    private String itemName;
    private double totalPrice;

    public order(int orderNumber, String itemName, double totalPrice) {
        this.orderNumber = orderNumber;
        this.itemName = itemName;
        this.totalPrice = totalPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}