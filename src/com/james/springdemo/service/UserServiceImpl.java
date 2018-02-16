package com.james.springdemo.service;

import com.james.springdemo.dao.UserDao;
import com.james.springdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public boolean verifyUser(User user) {
        boolean verifyFlag=false;

        User user1=userDao.queryUser(user.getUserId());
        if (user.getUserPassword().equals(user1.getUserPassword())){
            verifyFlag=true;
        }

        return verifyFlag;
    }

    @Override
    public User getUser(int userId) {
        return userDao.queryUser(userId);
    }
}
