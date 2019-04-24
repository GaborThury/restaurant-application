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
        System.out.println(", Order: " + order.toString());
    }

    public void processOrders() {
        int numberOfOrders = orders.size();
        System.out.println("CookRobot: Processing " + numberOfOrders + " order(s)...");

        for (int i = 0; i < numberOfOrders; i++) {
            Food food = FoodFactory.createFood(orders.element());
            orders.remove().notifyObservers(food);
        }
        System.out.println("CookRobot: Orders processed.");
    }

}
