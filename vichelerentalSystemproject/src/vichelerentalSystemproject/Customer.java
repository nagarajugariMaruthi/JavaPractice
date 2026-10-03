package vichelerentalSystemproject;

public class Customer {

    private int customerId;
    private String customerName;
    private String phone;
    private String licenseNumber;

    public Customer(int customerId, String customerName,
                    String phone, String licenseNumber) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void displayCustomer() {

        System.out.println("------------------------");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + customerName);
        System.out.println("Phone       : " + phone);
        System.out.println("License No  : " + licenseNumber);
        System.out.println("------------------------");
    }
}