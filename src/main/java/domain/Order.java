package domain;

import lombok.Getter;
import lombok.ToString;
import observer.Observable;

import java.util.List;

@Getter
@ToString
public class Order extends Observable<Client> {
    private final String food;
    private final List<String> extras;

    public Order(String food, List<String> extras) {
        this.food = food;
        this.extras = extras;
    }

    @Override
    public void notifyObservers(Food food) {
        System.out.println("Order: Notifying observers of " + this.toString());
        super.notifyObservers(food);
        System.out.println("Order: Notification done.");
    }

}
