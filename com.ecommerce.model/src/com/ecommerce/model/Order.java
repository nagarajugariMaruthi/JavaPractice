package com.ecommerce.model;

import java.time.LocalDate;

public class Order {

	private int Orderid;
	private Customer Customer;
	private Product Product;
	private  int quantity;
	private LocalDate OrderDate;
	


  public Order(int Orderid, Customer Customer, Product Product, int quantity, LocalDate OrderDate) {
	  
	  this.Orderid = Orderid;
	  this.Customer = Customer;
	  this.Product = Product;
	  this.quantity = quantity;
	  this.OrderDate = OrderDate;
	  
  }
  
  public int getOrederid() {
	  return Orderid;
	  
  }
  
  public Customer getCustomer() {
	  return Customer;
	  
  }
  
 public Product  getProduct() {
	 
	 return Product;
	 
 }
 
 public int getquantity() {
	 return quantity;
	 
 }
 
 public LocalDate getordeDate() {
	 return OrderDate;
 }
 
 public double getTotalAmount() {
     return Product.getPrice() * quantity;
 }

 
 @Override
  public String toString() {
	 
	 return "Order{" +
             "orderId=" + Orderid +
             ", customer=" + Customer.getname() +
             ", product=" + Product.getPrice() +
             ", quantity=" + quantity +
             ", totalAmount=" + getTotalAmount() +
             ", orderDate=" + OrderDate +
             '}';
 }
}