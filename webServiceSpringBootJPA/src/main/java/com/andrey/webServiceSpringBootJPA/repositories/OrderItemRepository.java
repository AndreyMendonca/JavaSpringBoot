package com.andrey.webServiceSpringBootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrey.webServiceSpringBootJPA.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
