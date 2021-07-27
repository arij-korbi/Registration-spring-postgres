package com.example.leoniplatform.repository;

import com.example.leoniplatform.model.File;
import com.example.leoniplatform.model.Profile;
import com.example.leoniplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Integer> {
    public Profile findByProfileName(String profileName);
    public Profile findProfileById(int id);

}
