package mypackage;

public class Main_7 {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(60000);
        p1.displayAmount();
        p1.makePayment();

        Payment p2 = new UPIPayment(50000);
        p2.displayAmount();
        p2.makePayment();

        Payment p3 = new CashPayment(70000);
        p3.displayAmount();
        p3.makePayment();
    }
}