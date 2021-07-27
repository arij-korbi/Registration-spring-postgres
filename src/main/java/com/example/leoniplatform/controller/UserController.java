package com.example.leoniplatform.controller;

import com.example.leoniplatform.model.User;
import com.example.leoniplatform.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

public class RegistrationController {
    @Autowired
    private RegistrationService service;
    @PostMapping("/adduser")
    @CrossOrigin(origins = "http://localhost:4200")
    public User registerUser(@RequestBody User user) throws Exception{
        String temEmailId=user.getEmailId();
        if(temEmailId != null && !"".equals(temEmailId)) {
            User userobj=service.fetchUserByEmailId(temEmailId);
            if (userobj!=null){
                throw new Exception("user with"+temEmailId+"already exists");
            }
        }
        User userObj=null;
        userObj=service.saveUser(user);
        return userObj;
    }
    @PostMapping ("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public User loginUser(@RequestBody  User user)throws Exception{
        String temEmailId=user.getEmailId();
        String temPass=user.getPassword();
        User userObj=null;
        if(temEmailId != null && temPass != null){
            userObj= service.fetchUserByEmailIdAndPasword(temEmailId,temPass);
            if (userObj==null){
                throw new Exception("password incorrect");

            }

        }     return userObj;

    }
    @GetMapping("/allusers")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> findAllUsers() throws Exception{
        List<User> users=service.findAllUsers();
         return users;
    }
    @DeleteMapping("/deleteuser/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String deleteUser(@PathVariable(value = "id") int id) {
        service.deleteUser(id);
        return "deleted";
    }

}
