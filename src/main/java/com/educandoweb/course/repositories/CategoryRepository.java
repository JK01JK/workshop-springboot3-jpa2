package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	//tipo da minha entidade é User e o Id dela é Long
	
	
}
