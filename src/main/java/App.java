import domain.Client;
import domain.Order;
import robot.CookRobot;

import java.util.Arrays;
import java.util.Collections;

public class App {

    public App() {
    }

    public static void main(String[] args) {
        Order order1 = new Order("hotdog", Collections.singletonList("ketchup"));
        Order order2 = new Order("chips", Arrays.asList("ketchup", "mustard"));
        Order order3 = new Order("hotdog", Arrays.asList("ketchup", "ketchup", "ketchup"));
        Client adam = new Client("Adam", 100);
        Client eve = new Client("Eve", 200);

        CookRobot cookRobot = new CookRobot();
        cookRobot.addOrder(adam, order1);
        cookRobot.addOrder(eve, order2);
        cookRobot.addOrder(eve, order3);

        cookRobot.processOrders();
    }
}
