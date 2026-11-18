package Strategy;

public class FIxedDiscount implements DiscountStrategy {
    private final double amount;

    public FIxedDiscount(double amount) {
        this.amount = amount;
    }


    @Override
    public double apply(double subtotal) {
        return Math.max(0, subtotal - amount);
    }
}
