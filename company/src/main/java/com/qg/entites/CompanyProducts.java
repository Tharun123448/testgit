package com.qg.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 

@Entity
public class CompanyProducts {
	
	@Id
	@Column(name = "COMPANY_PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer c_productId;
	
	@Column(name="COMPANY_ID")
	private String companyId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPNAY_ID")
	private CompanyDetails companyDetails;
	
	
	public CompanyProducts() {
	}
	
	public CompanyProducts(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}
	
	public CompanyProducts(String productName) {
		super();
		//this.companyId = companyId;
		this.productName = productName;
		//this.companyDetails = companyDetails;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}
	public Integer getC_productId() {
		return c_productId;
	}
	public void setC_productId(Integer c_productId) {
		this.c_productId = c_productId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	// To string
	@Override
	public String toString() {
		return "CompanyProducts [c_productId=" + c_productId + ", companyId=" + companyId + ", productName="
				+ productName + ", companyDetails=" + companyDetails + "]";
	}
	
	
	

}
