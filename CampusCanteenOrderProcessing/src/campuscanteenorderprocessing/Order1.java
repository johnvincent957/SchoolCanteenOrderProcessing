
package campuscanteenorderprocessing;

public class Order1 {

    private int orderNumber;
    private String itemName;
    private double totalPrice;

    public Order1(int orderNumber, String itemName, double totalPrice) {
        this.orderNumber = orderNumber;
        this.itemName = itemName;
        this.totalPrice = totalPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
