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

    private double delta(double foodEffect, double clientHappiness) {
        return Math.abs(clientHappiness - foodEffect);
    }

}
