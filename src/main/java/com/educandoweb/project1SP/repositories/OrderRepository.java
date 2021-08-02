package com.educandoweb.project1SP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project1SP.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}