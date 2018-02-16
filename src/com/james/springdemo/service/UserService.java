package com.james.springdemo.service;

import com.james.springdemo.entity.User;

public interface UserService {

   boolean verifyUser(User user);
   User getUser(int userId);
}
