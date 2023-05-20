package com.test.application.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.application.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
