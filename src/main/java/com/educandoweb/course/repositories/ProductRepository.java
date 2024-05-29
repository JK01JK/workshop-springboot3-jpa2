package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	//tipo da minha entidade é User e o Id dela é Long
	
	
}
