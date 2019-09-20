package com.qg.entites;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CompanyDetails {
	
	
	@Id
	@Column(name = "COMPANY_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer companyId;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "COMPANY_HQ")
	private String companyHQ;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companyDetails")
	private Set<CompanyProducts> companyProducts;
	
	
	public CompanyDetails() {
	}
	
	public CompanyDetails(String companyName, String companyHQ) {
		super();
		
		this.companyName = companyName;
		this.companyHQ = companyHQ;
	}

	public CompanyDetails(String companyName, String companyHQ,
			Set<CompanyProducts> companyProducts) {
		super();
		this.companyName = companyName;
		this.companyHQ = companyHQ;
		this.companyProducts = companyProducts;
	}

	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyHQ() {
		return companyHQ;
	}
	public void setCompanyHQ(String companyHQ) {
		this.companyHQ = companyHQ;
	}
	public Set<CompanyProducts> getCompanyProducts() {
		return companyProducts;
	}
	public void setCompanyProducts(Set<CompanyProducts> companyProducts) {
		this.companyProducts = companyProducts;
	}
	
	@Override
	public String toString() {
		return "CompanyDetails [companyId=" + companyId + ", companyName=" + companyName + ", companyHQ=" + companyHQ
				+ ", companyProducts=" + companyProducts + "]";
	}
	

	
}
