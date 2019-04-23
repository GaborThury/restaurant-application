package factory;

import domain.Food;
import domain.FoodExtraDecorator;
import domain.Order;

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
        System.out.println("Food prepared: " + food.toString());
        return food;
    }

    private static Food createMainFood(final String foodName) {
        return new Food() {
            public double calculateHappiness(double happiness) {
                if ("hotdog".equalsIgnoreCase(foodName)) {
                    return happiness + 2;
                } else if ("chips".equalsIgnoreCase(foodName)) {
                    return happiness * 1.05;
                }
                return 0;
            }
        };
    }

    private static Food addExtras(Food food, final List<String> extras) {
        return new FoodExtraDecorator(food) {
            public double calculateHappiness(double happiness) {
                double happinessChange = happiness;
                for (String extra : extras) {
                    if ("ketchup".equalsIgnoreCase(extra)) {
                        happinessChange = happinessChange * 2;
                    } else if ("mustard".equalsIgnoreCase(extra)) {
                        happinessChange += 1;
                    } else {
                        return happinessChange;
                    }
                }
                return 0;
            }
        };
    }
}

