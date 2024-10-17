package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
