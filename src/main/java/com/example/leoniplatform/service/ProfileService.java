package com.example.leoniplatform.service;

import com.example.leoniplatform.model.Profile;
import com.example.leoniplatform.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository repo;
    public Profile saveProfile(Profile profile) { return repo.save(profile); }
    public Profile findProfileByProfileName(String profileName) { return repo.findByProfileName(profileName); }
    public List<Profile> findAllProfiles(){
        return repo.findAll();
    }
    public void deleteProfile(int id){
        repo.deleteById(id);
    }
    public Profile findProfileById (int id){ return repo.findProfileById(id); }
}
