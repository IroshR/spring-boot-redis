package com.iroshnk.redis.controller;

import com.iroshnk.redis.api.request.UserCreateRequest;
import com.iroshnk.redis.model.User;
import com.iroshnk.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserCreateRequest request) {
        User user = userServiceImpl.createUser(request);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        List<User> users = userServiceImpl.getAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
