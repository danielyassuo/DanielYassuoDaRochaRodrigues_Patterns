package Strategy;

public class Program {
    public static void main(String[] args) {
        Cart cart = new Cart(200, new NoDiscount());

        System.out.println("Total (sem desconto) : " + cart.total());
        cart.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("Total (10%) : " + cart.total());

        cart.setDiscountStrategy(new FIxedDiscount(20));
        System.out.println("Total (-20) : " + cart.total());
    }
}
