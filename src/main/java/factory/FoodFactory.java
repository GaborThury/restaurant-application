package factory;

import domain.Food;
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
        Food mainFood = createMainFood(order.getFood());
        System.out.println("Food prepared: " + mainFood.toString());
        return mainFood;
    }

    private static Food createMainFood(final String foodName) {
        return new Food() {
            public double calculateHappiness(double d) {
                if ("hotdog".equalsIgnoreCase(foodName)) {
                    return d + 2;
                } else if ("chips".equalsIgnoreCase(foodName)) {
                    return d * 1.05;
                }
                return 0;
            }
        };
    }

    private static Food addExtras(Food food, List<String> extras) {

        return null;
    }

}
