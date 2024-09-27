package com.cgi.javabasics2;

import com.cgi.javabasics.Product;

public class ProductRunner {
	
	public static void main(String[] args) {
		
		Product.printApplicationDetails();
		
		Product.applicationLocation="India";
		Product.applicationName="Amazon India";
		
		Product obj1=new Product();
		Product obj2=new Product();
		Product obj3=new Product();
		
		obj1.id=1;
		obj1.name="Laptop";
		obj1.price=100000;
		obj1.quantity=1;
		
		obj2.id=2;
		obj2.name="Watch";
		obj2.price=3000.34;
		obj2.quantity=4;
		
		Product.printApplicationDetails();
		
		obj2.printProductDetails();
		obj1.printProductDetails();
		obj3.printProductDetails();
		
		Product p=Product.getProductInstance();
		
		Product.printId(obj2);
	}

}
