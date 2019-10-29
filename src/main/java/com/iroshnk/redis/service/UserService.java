package com.iroshnk.redis.service;

import com.iroshnk.redis.api.request.UserCreateRequest;
import com.iroshnk.redis.model.User;

import java.util.List;

public interface UserService {
    User createUser(UserCreateRequest request);

    List getAllUsers();
}
