package com.educandoweb.project1SP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project1SP.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
