package mypackage;

abstract class Payment {

    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();

    void displayAmount() {
        System.out.println("Payment Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Payment made using UPI");
    }
}

class CashPayment extends Payment {

    CashPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Payment made using Cash");
    }
}

