package com.javaudemy.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaudemy.webservice.entities.OrderItem;
import com.javaudemy.webservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
