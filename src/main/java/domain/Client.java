package domain;

import lombok.ToString;
import observer.Observer;

@ToString
public class Client implements Observer {
    private String name;
    private double happiness;

    public Client(String name, double happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void consume(Food food) {
        System.out.println("Client: Started to eat food, client: " + this.toString() + food.toString());
        System.out.println("Client: Csam csam nyam nyam");
        happiness += food.calculateHappiness(getHappiness());
        System.out.println("Client: Food eaten, client: " + this.toString());
    }


    public void update(Food value) {
        consume(value);
    }

}
