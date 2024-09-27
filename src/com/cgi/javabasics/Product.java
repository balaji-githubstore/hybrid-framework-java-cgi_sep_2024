package com.cgi.javabasics;

public class Product {
	
	public int id; //non-static variable or instance variable
	public String name;
	public double price;
	public int quantity;
	
	public static String applicationName; //static variable or class variable
	public static String applicationLocation;
	
	
	public static void printApplicationDetails()
	{
		System.out.println(Product.applicationName);
		System.out.println(Product.applicationLocation);
		System.out.println("-------------------------------");
	}
	
	public void printProductDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(Product.applicationName);
		System.out.println(Product.applicationLocation);
		System.out.println("-------------------------------");
	}
	
	public static Product getProductInstance()
	{
		Product obj=new Product();
		return obj;
	}
	
	public static void printId(Product p)
	{
		System.out.println(p.id);
	}
	
}







