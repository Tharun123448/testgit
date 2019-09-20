package com.qg.daos;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.qg.entites.CompanyDetails;
import com.qg.entites.CompanyProducts;

@Repository
public interface CommonDaoServices {
	Map<CompanyDetails, List<CompanyProducts>> getAllProductsOfACompany(String Name);
	Map<List<CompanyDetails>, List<CompanyProducts>> getAllProductsOfAllCompanies();
}
