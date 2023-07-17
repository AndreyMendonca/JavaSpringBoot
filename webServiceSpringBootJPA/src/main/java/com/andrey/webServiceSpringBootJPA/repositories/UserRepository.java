package com.andrey.webServiceSpringBootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrey.webServiceSpringBootJPA.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
