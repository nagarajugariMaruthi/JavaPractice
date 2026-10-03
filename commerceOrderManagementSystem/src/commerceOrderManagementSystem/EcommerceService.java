package commerceOrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EcommerceService {

    private List<User> users = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    private int orderCounter = 1001;

    // User Registration

    public void registerUser(User user) {

        users.add(user);

        System.out.println(
            "User registered successfully."
        );
    }

    // User Login

    public User login(String email, String password) {

        for (User user : users) {

            if (user.userEmailId().equals(email)
                    && user.userPassword().equals(password)) {

                System.out.println(
                    "Login successful. Welcome "
                    + user.Username()
                );

                return user;
            }
        }

        System.out.println(
            "Invalid email or password."
        );

        return null;
    }

    // Add Product

    public void addProduct(Product product) {

        products.add(product);

        System.out.println(
            "Product added successfully."
        );
    }

    // Display Products

    public void displayProducts() {

        if (products.isEmpty()) {

            System.out.println(
                "No products available."
            );

            return;
        }

        System.out.println(
            "\n----- AVAILABLE PRODUCTS -----"
        );

        for (Product product : products) {

            System.out.println(product);
        }
    }

    // Search Product

    public void searchProduct(String name) {

        boolean found = false;

        for (Product product : products) {

            if (product.ProductName()
                    .toLowerCase()
                    .contains(name.toLowerCase())) {

                System.out.println(product);

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                "Product not found."
            );
        }
    }

    // Place Order

    public Order placeOrder(
            Cart cart,
            String paymentMethod) {

        if (cart.getProducts().isEmpty()) {

            System.out.println(
                "Cannot place order. Cart is empty."
            );

            return null;
        }

        double total = cart.Caluculatetototal();

        Payment payment = new Payment();

        boolean paymentSuccessful =
                payment.makePayment(
                    total,
                    paymentMethod
                );

        if (!paymentSuccessful) {

            return null;
        }

        Order order =
                new Order(orderCounter++, total);

        orders.add(order);

        cart.clearCart();

        System.out.println(
            "Order placed successfully."
        );

        return order;
    }

    // Order History

    public void displayOrderHistory() {

        if (orders.isEmpty()) {

            System.out.println(
                "No orders found."
            );

            return;
        }

        System.out.println(
            "\n----- ORDER HISTORY -----"
        );

        for (Order order : orders) {

            System.out.println(order);
        }
    }

    // Cancel Order

    public void cancelOrder(int orderId) {

        for (Order order : orders) {

            if (order.getoderId() == orderId) {

                order.CancelOrder();

                return;
            }
        }

        System.out.println(
            "Order not found."
        );
    }
}