package commerceOrderManagementSystem;

import java.util.Scanner;

public class EcommerceApplication {
	
	// E-Commerce-Order-Management-System
	// git add .
	//git commit -m "Implemented E-Commerce Order Management System"
	//git push



	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        EcommerceService service =
	                new EcommerceService();

	        Cart cart = new Cart();

	        // Sample Users

	        service.registerUser(
	            new User(
	                1,
	                "Maruthi",
	                "maruthi@gmail.com",
	                "12345"
	            )
	        );

	        // Sample Products

	        service.addProduct(
	            new Product(
	                101,
	                "Laptop",
	                55000,
	                10
	            )
	        );

	        service.addProduct(
	            new Product(
	                102,
	                "Mobile",
	                25000,
	                20
	            )
	        );

	        service.addProduct(
	            new Product(
	                103,
	                "Headphones",
	                2000,
	                30
	            )
	        );

	        service.addProduct(
	            new Product(
	                104,
	                "Keyboard",
	                1500,
	                15
	            )
	        );

	        User loggedInUser = null;

	        int choice;

	        do {

	            System.out.println(
	                "\n===== E-COMMERCE ORDER MANAGEMENT ====="
	            );

	            System.out.println("1. Register User");
	            System.out.println("2. Login");
	            System.out.println("3. Display Products");
	            System.out.println("4. Search Product");
	            System.out.println("5. Add Product to Cart");
	            System.out.println("6. Remove Product from Cart");
	            System.out.println("7. View Cart");
	            System.out.println("8. Place Order");
	            System.out.println("9. Cancel Order");
	            System.out.println("10. Order History");
	            System.out.println("11. Exit");

	            System.out.print(
	                "Enter your choice: "
	            );

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:

	                    System.out.print(
	                        "Enter User ID: "
	                    );

	                    int userId = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print(
	                        "Enter Name: "
	                    );

	                    String name = sc.nextLine();

	                    System.out.print(
	                        "Enter Email: "
	                    );

	                    String email = sc.nextLine();

	                    System.out.print(
	                        "Enter Password: "
	                    );

	                    String password = sc.nextLine();

	                    service.registerUser(
	                        new User(
	                            userId,
	                            name,
	                            email,
	                            password
	                        )
	                    );

	                    break;

	                case 2:

	                    sc.nextLine();

	                    System.out.print(
	                        "Enter Email: "
	                    );

	                    String loginEmail =
	                            sc.nextLine();

	                    System.out.print(
	                        "Enter Password: "
	                    );

	                    String loginPassword =
	                            sc.nextLine();

	                    loggedInUser =
	                            service.login(
	                                loginEmail,
	                                loginPassword
	                            );

	                    break;

	                case 3:

	                    service.displayProducts();

	                    break;

	                case 4:

	                    sc.nextLine();

	                    System.out.print(
	                        "Enter product name to search: "
	                    );

	                    String search =
	                            sc.nextLine();

	                    service.searchProduct(search);

	                    break;

	                case 5:

	                    System.out.print(
	                        "Enter Product ID: "
	                    );

	                    int productId =
	                            sc.nextInt();

	                    boolean productFound = false;

	                    for (Product product :
	                            serviceProducts(service)) {

	                        if (product.ProductId()
	                                == productId) {

	                            productFound = true;

	                            break;
	                        }
	                    }

	                    if (!productFound) {

	                        System.out.println(
	                            "Product not found."
	                        );
	                    }

	                    break;

	                case 6:

	                    System.out.print(
	                        "Enter Product ID to remove: "
	                    );

	                    int removeId =
	                            sc.nextInt();

	                    cart.removeProduct(removeId);

	                    break;

	                case 7:

	                    cart.displayCart();

	                    break;

	                case 8:

	                    if (loggedInUser == null) {

	                        System.out.println(
	                            "Please login first."
	                        );

	                        break;
	                    }

	                    sc.nextLine();

	                    System.out.print(
	                        "Enter Payment Method " +
	                        "(UPI/Card/Cash): "
	                    );

	                    String paymentMethod =
	                            sc.nextLine();

	                    service.placeOrder(
	                        cart,
	                        paymentMethod
	                    );

	                    break;

	                case 9:

	                    System.out.print(
	                        "Enter Order ID: "
	                    );

	                    int orderId =
	                            sc.nextInt();

	                    service.cancelOrder(orderId);

	                    break;

	                case 10:

	                    service.displayOrderHistory();

	                    break;

	                case 11:

	                    System.out.println(
	                        "Thank you for using " +
	                        "E-Commerce Application."
	                    );

	                    break;

	                default:

	                    System.out.println(
	                        "Invalid choice."
	                    );
	            }

	        } while (choice != 11);

	        sc.close();
	    }

	    /*
	     * Helper method to access products.
	     */
	    private static java.util.List<Product>
	            serviceProducts(EcommerceService service) {

	        try {

	            java.lang.reflect.Field field =
	                    EcommerceService.class
	                    .getDeclaredField("products");

	            field.setAccessible(true);

	            return (java.util.List<Product>)
	                    field.get(service);

	        } catch (Exception e) {

	            return new java.util.ArrayList<>();
	        }
	    }
	}