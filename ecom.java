interface Checkout {
    void processPayment(double amount);
}

class OnlineCart implements Checkout {
    public void processPayment(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid payment amount");
        System.out.println("Payment of $" + amount + " processed.");
    }
}