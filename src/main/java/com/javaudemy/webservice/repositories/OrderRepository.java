package com.javaudemy.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaudemy.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
