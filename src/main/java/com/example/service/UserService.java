package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.model.User;
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    
    public User getUserInfo(long id){
        User user = userDao.findUserInfo(id);
        return user;
    }
    
    
}
