package com.iroshnk.redis.repository;

import com.iroshnk.redis.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
