package com.educandoweb.project1SP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project1SP.entities.OrderItem;
import com.educandoweb.project1SP.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}