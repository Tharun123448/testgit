package com.qg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qg.daos.CompanyDaoServices;
import com.qg.daos.ProductDaoServices;
import com.qg.entites.CompanyDetails;
import com.qg.entites.CompanyProducts;

@SpringBootApplication
public class CompanyApplication implements CommandLineRunner{
	
	@Autowired
	private CompanyDaoServices companyDaoServices;
	
	@Autowired
	private ProductDaoServices productDaoServices;

	public static void main(String[] args) {
		SpringApplication.run(CompanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 CompanyDetails cd1 = new CompanyDetails("Quest", "Bangalore");
		 CompanyDetails cd2 = new CompanyDetails("Apple", "Calfornia");
		 CompanyDetails cd3 = new CompanyDetails("BMW", "Berlin");
		 CompanyDetails cd4 = new CompanyDetails("Google", "MountView");
		 CompanyDetails cd5 = new CompanyDetails("JIO", "Mumbai");
		 CompanyDetails cd6 = new CompanyDetails("Flipkart", "Bangalore");
		 
		 this.companyDaoServices.save(cd1);
		 this.companyDaoServices.save(cd2);
		 this.companyDaoServices.save(cd3);
		 this.companyDaoServices.save(cd4);
		 this.companyDaoServices.save(cd5);
		 this.companyDaoServices.save(cd6);
		 
		 CompanyProducts cp1 = new CompanyProducts("Iphone");
		 CompanyProducts cp2 = new CompanyProducts("Mac");
		 CompanyProducts cp3 = new CompanyProducts("Ipod");
		 CompanyProducts cp4 = new CompanyProducts("I tab");
		 CompanyProducts cp5 = new CompanyProducts("Airbus");
		 CompanyProducts cp6 = new CompanyProducts("Rolls Royce");
		 CompanyProducts cp7 = new CompanyProducts("Apple");
		 CompanyProducts cp8 = new CompanyProducts("GE");
		 CompanyProducts cp9 = new CompanyProducts("Jio Cable");
		 CompanyProducts cp10 = new CompanyProducts("Jio Internet");
		 CompanyProducts cp11 = new CompanyProducts("Google Search Browser");
		 CompanyProducts cp12 = new CompanyProducts("Google assistence");
		 CompanyProducts cp13 = new CompanyProducts("Nexus");
		 CompanyProducts cp14 = new CompanyProducts("Android");
		 CompanyProducts cp15 = new CompanyProducts("Flikart Ecommerce");
		 CompanyProducts cp16 = new CompanyProducts("Flipkart Internet Provider");
		 CompanyProducts cp17 = new CompanyProducts("Car");
		 CompanyProducts cp18 = new CompanyProducts("Automobiles");
		 
		 cp1.setCompanyDetails(cd2);
		 cp2.setCompanyDetails(cd2);
		 cp3.setCompanyDetails(cd2);
		 cp4.setCompanyDetails(cd2);
		 cp5.setCompanyDetails(cd1);
		 cp6.setCompanyDetails(cd1);
		 cp7.setCompanyDetails(cd1);
		 cp8.setCompanyDetails(cd1);
		 cp9.setCompanyDetails(cd5);
		 cp10.setCompanyDetails(cd5);
		 cp11.setCompanyDetails(cd4);
		 cp12.setCompanyDetails(cd4);
		 cp13.setCompanyDetails(cd4);
		 cp14.setCompanyDetails(cd4);
		 cp15.setCompanyDetails(cd6);
		 cp16.setCompanyDetails(cd6);
		 cp17.setCompanyDetails(cd3);
		 cp18.setCompanyDetails(cd3);
		 
		 
		 
		 this.productDaoServices.save(cp1);
		 this.productDaoServices.save(cp2);
		 this.productDaoServices.save(cp3);
		 this.productDaoServices.save(cp4);
		 this.productDaoServices.save(cp5);
		 this.productDaoServices.save(cp6);
		 this.productDaoServices.save(cp7);
		 this.productDaoServices.save(cp8);
		 this.productDaoServices.save(cp9);
		 this.productDaoServices.save(cp10);
		 this.productDaoServices.save(cp11);
		 this.productDaoServices.save(cp12);
		 this.productDaoServices.save(cp13);
		 this.productDaoServices.save(cp14);
		 this.productDaoServices.save(cp15);
		 this.productDaoServices.save(cp16);
		 this.productDaoServices.save(cp17);
		 this.productDaoServices.save(cp18);
		 	 
	}

}
