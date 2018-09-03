package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.AppUser;

public interface UserRepository  extends MongoRepository<AppUser, Integer>{

}
