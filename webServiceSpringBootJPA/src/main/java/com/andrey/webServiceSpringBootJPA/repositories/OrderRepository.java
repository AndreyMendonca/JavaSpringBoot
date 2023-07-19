package com.andrey.webServiceSpringBootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrey.webServiceSpringBootJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
