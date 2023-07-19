package com.andrey.webServiceSpringBootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrey.webServiceSpringBootJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
