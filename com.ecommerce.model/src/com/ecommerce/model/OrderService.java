package com.ecommerce.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import com.ecommerce.model.ProductNotFoundException;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Order;
import com.ecommerce.model.Product;



public class OrderService {
	
	private List<Product> Products = new ArrayList<>();
	private List<Order> Orders = new ArrayList<>();
	
	// add products 
	 public void addProduct(Product product) {
	        Products.add(product);
	    }
	 
	 // Find the Product using optinal 
	 
	 public Optional<Product> findProductById(int productId) {

	        return Products.stream()
	                .filter(product -> product.getId() == productId)
	                .findFirst();
	    }

	 // place order
	 
	 public void placeOrder(int OrderId, Customer Customer, int ProductId, int quantity) {
		 
		 Optional<Product> OptionalProduct = findProductById(ProductId);
		 Product product = OptionalProduct
	                .orElseThrow(() ->
	                        new ProductNotFoundException(
	                                "Product not found: " + ProductId));
		 if(product.getQuantity() > quantity)  {
			 
			 throw new IllegalArgumentException(
	                    "Insufficient product stock");
	        }

		 product.setQuantity(
	                product.getQuantity() - quantity);

	        Order order =
	                new Order(OrderId, Customer, product, quantity, null);

	        Orders.add(order);

	        System.out.println("Order placed successfully!");
	    }

	    // Display all orders
	    public void displayAllOrders() {

	        Orders.forEach(System.out::println);
	    }

	    // Display all orders
	    public void displayAllOrders1() {

	        Orders.forEach(System.out::println);
	    }

	    // Find orders by customer
	    public List<Order> findOrdersByCustomer(int customerId) {

	        return Orders.stream()
	                .filter(order ->
	                        order.getCustomer().getid() == customerId)
	                .collect(Collectors.toList());
	    }
	    // Find highest-value order
	    public Optional<Order> findHighestOrder() {

	        return Orders.stream()
	                .max(Comparator.comparing(Order::getTotalAmount));
	    }

	    // Calculate total sales
	    public double calculateTotalSales() {

	        return Orders.stream()
	                .mapToDouble(Order::getTotalAmount)
	                .sum();
	    }

	    // Products above given price
	    public List<Product> productsAbovePrice(double price) {

	        return Products.stream()
	                .filter(product -> product.getPrice() > price)
	                .collect(Collectors.toList());
	    }
	}
