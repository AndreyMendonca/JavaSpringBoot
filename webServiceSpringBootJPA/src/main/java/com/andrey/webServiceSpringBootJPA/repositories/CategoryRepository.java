package com.andrey.webServiceSpringBootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrey.webServiceSpringBootJPA.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
