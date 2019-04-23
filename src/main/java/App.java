import domain.Client;
import domain.Order;
import robot.CookRobot;

import java.util.List;

public class App {

    public App() {
    }

    public static void main(String[] args) {
/*    Workflow
        - The client orders a product
        - The orders are prepared by a robot one after another (FIFO)
        - The client receives and consumes the products*/

        // TODO: Orders are created here and sent to CookRobot

        Order order1 = new Order("hotdog", null);
        Order order2 = new Order("chips", null);
        Client adam = new Client("Adam", 100);
        Client eve = new Client("Eve", 200);

        CookRobot cookRobot = new CookRobot();
        cookRobot.addOrder(adam, order1);
        cookRobot.addOrder(eve, order2);

        cookRobot.processOrders();
    }
}