package domain;

import lombok.ToString;

@ToString
public abstract class FoodExtraDecorator implements Food {

    protected final Food food;

    public FoodExtraDecorator(Food food) {
        this.food = food;
    }
}
