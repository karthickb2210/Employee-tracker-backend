package com.spring.Spring.emloyee.repository;

import com.spring.Spring.emloyee.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface UserRepository extends MongoRepository<User,Long> {


}
