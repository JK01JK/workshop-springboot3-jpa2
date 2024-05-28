package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	//tipo da minha entidade é User e o Id dela é Long
	
	
}
