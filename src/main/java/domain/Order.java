package domain;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Order {
    private final String food;
    private final List<String> extras;

    public Order(String food, List<String> extras) {
        this.food = food;
        this.extras = extras;
    }

}
