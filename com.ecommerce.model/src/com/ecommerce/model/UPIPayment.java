package com.ecommerce.model;

public class UPIPayment implements Payment1 {

	    public void pay(double amount) {

	        System.out.println(
	                "Payment of ₹" + amount +
	                " completed using UPI.");
	    }
	}