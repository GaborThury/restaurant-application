package factory;

import domain.*;

import java.util.List;

public class FoodFactory {

    private static final String HOTDOG = "hotdog";
    private static final String CHIPS = "chips";
    private static final String MUSTARD = "mustard";
    private static final String KETCHUP = "ketchup";

    public FoodFactory() {
    }

    public static Food createFood(Order order) {
        System.out.println("FoodFactory: Preparing food, order: " + order.toString());
        Food food = createMainFood(order.getFood());
        food = addExtras(food, order.getExtras());
        System.out.println("FoodFactory: Food prepared: " + food.toString());
        return food;
    }

    private static Food createMainFood(final String foodName) {
        return new Food() {
            public double calculateHappiness(double happiness) {
                if (HOTDOG.equalsIgnoreCase(foodName)) {
                    return 2;
                } else if (CHIPS.equalsIgnoreCase(foodName)) {
                    return (happiness * 1.05) - happiness;
                }
                return 0;
            }
        };
    }

    private static Food addExtras(Food food, final List<String> extras) {
        for (String extra : extras) {
            if (KETCHUP.equalsIgnoreCase(extra)) {
                food = new KetchupDecorator(food);
            } else if (MUSTARD.equalsIgnoreCase(extra)) {
                food = new MustardDecorator(food);
            }
        }
        return food;
    }
}

