
package campuscanteenorderprocessing;

public class ItemNode {

    CanteenItem data;
    ItemNode next;

    public ItemNode(CanteenItem data) {
        this.data = data;
        this.next = null;
    }
}
