package robot;

import domain.Client;
import domain.Food;
import domain.Order;
import factory.FoodFactory;

import java.util.LinkedList;
import java.util.Queue;

public class CookRobot {

    private final Queue<Order> orders = new LinkedList<Order>();

    public CookRobot() {
    }

    public void addOrder(Client client, Order order) {
        order.addObserver(client);
        orders.add(order);
        System.out.print("CookRobot: Order registered, ");
        System.out.print("Client: " + client.toString());
        System.out.println("Order: " + order.toString());
    }

    public void processOrders() {
        int numberOfElements = orders.size();
        System.out.println("Processing " + numberOfElements + " order(s)...");

        for (int i = 0; i < numberOfElements; i++) {
            // todo: notifying observers of order
            FoodFactory.createFood(orders.element());
            orders.element().notifyObservers();
        }
    }

}
