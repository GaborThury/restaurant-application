package domain;

import lombok.ToString;

@ToString
public class Client {
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

    }

    public void update(Food food) {

    }

}
