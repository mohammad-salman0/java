interface Checkout {
    void processPayment(double amount);
}

class OnlineCart implements Checkout {
    public void processPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        System.out.println("Payment of ₹" + amount + " processed.");
    }
}

public class Program7_EcommerceCheckout {
    public static void main(String[] args) {
        try {
            OnlineCart cart = new OnlineCart();
            cart.processPayment(1500);
            cart.processPayment(-100);  // triggers exception
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid payment: " + e.getMessage());
        }
    }
}
