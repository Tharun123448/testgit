package com.qg.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qg.entites.CompanyDetails;

@Repository
public interface CompanyDaoServices extends JpaRepository<CompanyDetails, Integer>{
	
	CompanyDetails findCompanyDetails(String companyName);
	
}
