package com.example.leoniplatform.service;

import com.example.leoniplatform.model.User;
import com.example.leoniplatform.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository repo;
    public User saveUser(User user)
    {
        return repo.save(user);
    }
    public User fetchUserByEmailId(String email)
    {

        return repo.findByEmailId(email);
    }

    public User fetchUserByEmailIdAndPasword(String emailId,String password)
    {
        return repo.findByEmailIdAndPassword(emailId,password);
    }
    public List<User> findAllUsers(){
       return repo.findAll();
    }
     public void deleteUser(int id){
         repo.deleteById(id);
}
}
