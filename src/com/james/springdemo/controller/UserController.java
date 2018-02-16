package com.james.springdemo.controller;

import com.james.springdemo.entity.User;
import com.james.springdemo.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    private static final Log logger= LogFactory.getLog(UserController.class);

    @RequestMapping("/signin")
    public String login(Model model){
        model.addAttribute("user",new User());
        return "Login";
    }

    @RequestMapping("/login")
    public String verify(Model model, @ModelAttribute User user, HttpSession session){


      boolean flag=userService.verifyUser(user);

        if(flag){
            User user1=userService.getUser(user.getUserId());
            session.setAttribute("user",user1);
            return "Welcome";
        }
        return "Fail";
    }


}

