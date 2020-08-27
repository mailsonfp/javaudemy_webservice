package com.javaudemy.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaudemy.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
