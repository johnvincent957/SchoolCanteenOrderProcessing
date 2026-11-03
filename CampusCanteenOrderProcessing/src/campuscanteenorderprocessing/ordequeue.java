package campuscanteenorderprocessing;

import java.util.LinkedList;
import java.util.Queue;

public class ordequeue {

    private Queue<order> orders;

    public ordequeue() {
        orders = new LinkedList<>();
    }

    // Add a new order
    public void addorder(order order) {
        orders.add(order);
    }

    // Serve the next order
    public order serveNextOrder() {
        return orders.poll();
    }

    // Display all pending orders
    public Queue<order> getPendingorders() {
        return new LinkedList<>(orders);
    }

    // Search for an order
    public order searchOrder(int orderNumber) {

        for (order order : orders) {

            if (order.getOrderNumber() == orderNumber) {
                return order;
            }
        }

        return null;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return orders.isEmpty();
    }

    // Get number of pending orders
    public int getOrderCount() {
        return orders.size();
    }
}