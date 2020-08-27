package com.javaudemy.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaudemy.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
