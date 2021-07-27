package com.example.leoniplatform.repository;

import com.example.leoniplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer>{
        public User findUserById(int id);
        public User findByEmailId(String emailId);
        public User findByEmailIdAndPassword(String emailId,String password);
}
