package domain;

import lombok.ToString;

@ToString
public class MustardDecorator extends FoodExtraDecorator {

    public MustardDecorator(Food food) {
        super(food);
    }

    public double calculateHappiness(double happiness) {
        return 1;
    }
}
