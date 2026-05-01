@FunctionalInterface
interface DiscountCalculator {
    // ===== TODO 1 =====
    double calculate(double price);
}

public class DiscountDemo {
    public static void main(String[] args) {

        // ===== TODO 2 =====
        DiscountCalculator tenPercent = price -> price * 0.90;

        // ===== TODO 3 =====
        DiscountCalculator twentyFivePercent = price -> price * 0.75;

        double price = 100;

        // ===== TODO 4 =====
        System.out.println("Final price after 10% discount: " + tenPercent.calculate(price));

        // ===== TODO 5 =====
        System.out.println("Final price after 25% discount: " + twentyFivePercent.calculate(price));
    }
}
