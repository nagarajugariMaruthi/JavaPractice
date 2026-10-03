package online_shopping_System_project;
import java.util.ArrayList;
import java.util.Scanner;
	class product {
	    private int id;
	    private String name;
	    private double price;
	    
	    public product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public double getprice() {
	        return price;
	    }
	    
	    public void display() {
	        System.out.println(id + " " + name + "  ₹" + price);
	    }
	}

	class Cart {
	    ArrayList<product> items = new ArrayList<>();
	    
	    public void addProduct(product p) {
	        items.add(p);
	        System.out.println(p.getName() + " added to cart.");
	    }
	    
	    public void viewCart() {
	        double total = 0; 
	        
	        if(items.isEmpty()) {
	            System.out.println("Cart is empty.");
	            return;
	        }
	        
	        System.out.println("\nItems is Cart:");
	        for(product p : items) {
	            p.display();
	            total += p.getprice();
	        }
	        
	        System.out.println("Total Amount = ₹" + total);
	    }
	}


	public class onlineShoppingSystem {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	    ArrayList<product> products = new ArrayList<>();
	    products.add(new product(1, "Laptop", 50000));
	    products.add(new product(2, "Mobile", 20000));
	    products.add(new product(3, "headphones", 1500));
	    products.add(new product(4, "Smart Watch", 3000));
	    
	    Cart cart = new Cart();
	    
	    while(true) {
	        System.out.println("\n==== ONLINE SHOPPING SYSTEM =====");
	        System.out.println("1.view products");
	        System.out.println("2.add product to cart");
	        System.out.println("3.view  cart");
	        System.out.println("4.Exit");
	        System.out.println("Enter your choice");
	        
	        int choice = sc.nextInt();
	        
	        switch(choice) {
	            case 1:
	                System.out.println("\nAvailable products: ");
	                for(product p : products) {
	                    p.display();
	                }
	                break;
	                
	                case 2:
	                    System.out.println("Enter product ID: ");
	                    int id = sc.nextInt();
	                    
	                    boolean found = false;
	                    
	                    for(product p : products) {
	                        if(p.getId() == id) {
	                            cart.addProduct(p);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if(!found) {
	                        System.out.println("Product not found.");
	                    }
	                    break;
	                    
	                    case 3:
	                        
	                        cart.viewCart();
	                        break;
	                        case 4:
	             System.out.println("thank you for shopping!");
	                    sc.close();
	                System.exit(0);
	                
	                default:
	                System.out.println("Invalid choice.");
	        }
	    }
	}
	}

