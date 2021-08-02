package com.educandoweb.project1SP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project1SP.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}