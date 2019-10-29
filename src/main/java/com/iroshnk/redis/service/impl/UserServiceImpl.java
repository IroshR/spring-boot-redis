package com.iroshnk.redis.service.impl;

import com.iroshnk.redis.api.request.UserCreateRequest;
import com.iroshnk.redis.model.User;
import com.iroshnk.redis.repository.UserRepository;
import com.iroshnk.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserCreateRequest request) {
        User user = new User(request.getId(),request.getName(), request.getGender());
        user = userRepository.save(user);

        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = (List<User>) userRepository.findAll();

        return users;
    }
}
