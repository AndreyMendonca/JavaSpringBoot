package com.andrey.webServiceSpringBootJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrey.webServiceSpringBootJPA.entities.Category;
import com.andrey.webServiceSpringBootJPA.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long Id) {
		Optional<Category> obj = repository.findById(Id);
		return obj.get();
	}
	
}
