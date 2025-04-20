import java.util.*;

class Restaurant {
    
    String restaurantName;

    Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    int getEstimatedDeliveryTime() {
        return 40;
    }

    void showRestaurantInfo() {
        System.out.println(this.restaurantName + "estimated delivery time: " + getEstimatedDeliveryTime() + " minutes.");
    }

    double calculateTax() {
        return 0.10 * 100;
    }

    double calculateFoodCost() {
        return 100 + calculateTax();
    }

    void calculateTotalBill() {
        System.out.println("The bill is " + calculateFoodCost());
    }
}

class FastFoodRestaurant extends Restaurant {
    
    FastFoodRestaurant(String restaurantName) {
        super(restaurantName);
    }

    int getEstimatedDeliveryTime() {
        return 20;
    }

    double calculateTax() {
        return 0.15 * 75;
    }

    double calculateFoodCost() {
        return 75 + calculateTax();
    }
}

class FineDiningRestaurant extends Restaurant {

    FineDiningRestaurant(String restaurantName) {
        super(restaurantName);
    }

    int getEstimatedDeliveryTime() {
        return 60;
    }

    double calculateFoodCost() {
        int taxRateMultiplier = 200 / 100;
        return 200 + taxRateMultiplier * calculateTax();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Restaurant normalRestaurant = new Restaurant("Normal ");
        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant("Fast Food ");
        FineDiningRestaurant fineDiningRestaurant = new FineDiningRestaurant("Luxury Food ");

        normalRestaurant.showRestaurantInfo();
        normalRestaurant.calculateTotalBill();

        fastFoodRestaurant.showRestaurantInfo();
        fastFoodRestaurant.calculateTotalBill();

        fineDiningRestaurant.showRestaurantInfo();
        fineDiningRestaurant.calculateTotalBill();
    }
}

