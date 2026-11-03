package CampusCanteenOrderProcessing;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Order {
    int orderNumber;
    String customerName;
    String orderItem;

    public Order(int orderNumber, String customerName, String orderItem) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderItem = orderItem;
    }

    public void displayOrder() {
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Item: " + orderItem);
        System.out.println("----------------------------");
    }
}

public class CampusCanteenOrderProcessing {

    static Queue<Order> pendingOrders = new LinkedList<>();
    static Scanner input = new Scanner(System.in);
    static int nextOrderNumber = 1;

    // 1. Add Customer Order
    public static void addCustomerOrder() {
        System.out.print("Enter Customer Name: ");
        String name = input.nextLine();

        System.out.print("Enter Order Item: ");
        String item = input.nextLine();

        Order newOrder = new Order(nextOrderNumber, name, item);
        pendingOrders.add(newOrder);

        System.out.println("\nOrder successfully added!");
        System.out.println("Your Order Number is: " + nextOrderNumber);

        nextOrderNumber++;
    }

    // 2. Display Pending Orders
    public static void displayPendingOrders() {
        if (pendingOrders.isEmpty()) {
            System.out.println("\nNo pending orders.");
            return;
        }

        System.out.println("\n===== PENDING ORDERS =====");

        for (Order order : pendingOrders) {
            order.displayOrder();
        }
    }

    // 3. Serve Next Order
    public static void serveNextOrder() {
        if (pendingOrders.isEmpty()) {
            System.out.println("\nNo orders to serve.");
            return;
        }

        Order servedOrder = pendingOrders.poll();

        System.out.println("\n===== ORDER SERVED =====");
        servedOrder.displayOrder();

        System.out.println("Order successfully served!");
    }

    // 4. Search by Order Number
    public static void searchOrder() {
        System.out.print("\nEnter Order Number to Search: ");
        int searchNumber;

        try {
            searchNumber = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid order number!");
            return;
        }

        for (Order order : pendingOrders) {
            if (order.orderNumber == searchNumber) {
                System.out.println("\n===== ORDER FOUND =====");
                order.displayOrder();
                return;
            }
        }

        System.out.println("\nOrder not found in pending orders.");
    }

    // Main Menu
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println(" CAMPUS CANTEEN ORDER PROCESS");
            System.out.println("================================");
            System.out.println("1. Add Customer Order");
            System.out.println("2. Display Pending Orders");
            System.out.println("3. Serve Next Order");
            System.out.println("4. Search by Order Number");
            System.out.println("5. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    addCustomerOrder();
                    break;

                case 2:
                    displayPendingOrders();
                    break;

                case 3:
                    serveNextOrder();
                    break;

                case 4:
                    searchOrder();
                    break;

                case 5:
                    System.out.println("\nThank you for using Campus Canteen Order Process!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 5);

        input.close();
    }
}