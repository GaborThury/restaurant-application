package domain;

import lombok.ToString;

@ToString
public class KetchupDecorator extends FoodExtraDecorator {

    public KetchupDecorator(Food food) {
        super(food);
    }

    public double calculateHappiness(double happiness) {
        return food.calculateHappiness(happiness) * 2;
    }

}
