package com.qg.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qg.entites.CompanyProducts;

@Repository
public interface ProductDaoServices extends JpaRepository<CompanyProducts, Integer>{
	CompanyProducts getProductDetailsByCompanyName(String companyName);
}
