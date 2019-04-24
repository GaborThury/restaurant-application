package domain;

import lombok.ToString;
import observer.Observable;
import observer.Observer;

@ToString
public class Client implements Observer<Client> {
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
        System.out.println("Client: Food eaten, client: " + this.toString());
    }

    public void update(Client value) {

    }
}
