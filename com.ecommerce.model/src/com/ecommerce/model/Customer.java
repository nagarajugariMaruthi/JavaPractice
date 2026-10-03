package com.ecommerce.model;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	
	
	public Customer(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public int getid() {
		return id;
		
	}
	public String getname() {
		return name;
		
	}
	
	public String getemail() {
		return email;
	}
	
	  @Override
	  public String toString() {
		  return "Customer{id=" + id +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }
	}