package com.example.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

/**
 * 
 * @ClassName: UserController 
 * @Description: 用户控制层
 * @author: guoconglin
 * @date: 2017年5月10日 下午2:37:27
 */

@RestController
public class UserController {
    
    private static Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(Long id) {
        User userList = userService.getUserInfo(115);
        if(userList!=null){
           
                System.out.println("user.getUserName():"+userList.getUserName());
                logger.info("user.getMobile():"+userList.getMobile());
        }
        return userList;
    }

}
