package com.antra.kungfu.repository;

import com.antra.kungfu.model.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
    User findByUsername(String name);
}
