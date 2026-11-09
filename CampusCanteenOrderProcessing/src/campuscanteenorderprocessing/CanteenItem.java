
package campuscanteenorderprocessing;


public class CanteenItem {
    private String itemID;
    private String itemName;
    private String category;
    private double price;

    // Constructor
    public CanteenItem(String itemID, String itemName,
                       String category, double price) {

        this.itemID = itemID;
        this.itemName = itemName;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Item Name: " + itemName);
        System.out.println("Category: " + category);
        System.out.println("Price: ₱" + price);
    }
}

