
package campuscanteenorderprocessing;

public class CanteenItemList {
    
    public void loadIntoTable(
    javax.swing.table.DefaultTableModel model) {

    ItemNode current = head;

    while (current != null) {

        CanteenItem item = current.data;

        model.addRow(new Object[]{
            item.getItemID(),
            item.getItemName(),
            item.getCategory(),
            item.getPrice()
        });

        current = current.next;
    }
}
    
    //Singly LinkedList
    //
    private ItemNode head;

    // INSERT ITEM
    public void insert(CanteenItem item) {

        ItemNode newNode = new ItemNode(item);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // DISPLAY ALL ITEMS
    public void displayAll() {

        ItemNode current = head;

        while (current != null) {
            current.data.displayInfo();
            System.out.println("-------------------");

            current = current.next;
        }
    }

    // SEARCH ITEM
    public CanteenItem search(String itemID) {

        ItemNode current = head;

        while (current != null) {

            if (current.data.getItemID()
                    .equalsIgnoreCase(itemID)) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    // UPDATE ITEM
    public boolean update(String itemID, String newName,
                          double newPrice) {

        CanteenItem item = search(itemID);

        if (item != null) {
            item.setItemName(newName);
            item.setPrice(newPrice);
            return true;
        }

        return false;
    }

    // DELETE ITEM
    public boolean delete(String itemID) {

        if (head == null) {
            return false;
        }

        if (head.data.getItemID().equalsIgnoreCase(itemID)) {
            head = head.next;
            return true;
        }

        ItemNode current = head;

        while (current.next != null) {

            if (current.next.data.getItemID()
                    .equalsIgnoreCase(itemID)) {

                current.next = current.next.next;
                return true;
            }

            current = current.next;
        }

        return false;
    }
}
