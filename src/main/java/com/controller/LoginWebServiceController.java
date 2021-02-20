package com.controller;

import com.Model.User;
import com.service.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginWebServiceController {

    @Autowired
    LoginServiceImp loginService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<User> getAllUser(){
        return  loginService.findAllUser(); }

    @RequestMapping(value ="/list{id}",method = RequestMethod.GET)
    public User findByUserId(@PathVariable("id") Long id){
        return loginService.findUserById(id);
    }

}
