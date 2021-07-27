package com.example.leoniplatform.controller;

import com.example.leoniplatform.model.Profile;
import com.example.leoniplatform.model.User;
import com.example.leoniplatform.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProfileController {
    @Autowired
    private ProfileService service;
    @PostMapping("/addprofile")
    @CrossOrigin(origins = "http://localhost:4200")
    public Profile registerUser(@RequestBody Profile profile) throws Exception {
        String temProfileName = profile.getProfileName();
        if (temProfileName != null && !"".equals(temProfileName)) {
            Profile profileObj = service.findProfileByProfileName(temProfileName);
            if (profileObj != null) {
                throw new Exception("profile with"+" " + temProfileName +" "+ "already exists");
            }
        }
        Profile profileObj = null;
        profileObj = service.saveProfile(profile);
        return profileObj;
    }

    @GetMapping("/allprofiles")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Profile> findAllProfiles() throws Exception {
        List<Profile> profiles = service.findAllProfiles();
        return profiles;
    }
    @GetMapping("/profile/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Profile findProfileById(@PathVariable(value = "id") int id) {
       Profile profile = service.findProfileById(id);
        return profile;
    }
    @DeleteMapping("/deleteprofile/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String deleteProfile(@PathVariable(value = "id") int id) {
        service.deleteProfile(id);
        return "deleted";
    }


    @PutMapping("/editprofile/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Profile updateProfile(@PathVariable int id, @RequestBody Profile profileDetails) throws Exception {
        Profile profile = service.findProfileById(id);
        if (profile == null) {
            throw new Exception("profile with" + id + "doesn't exist");
        }

        profile.setProfileName(profileDetails.getProfileName());
        profile.setProfileManagement(profileDetails.getProfileManagement());
        profile.setUserManagement(profileDetails.getUserManagement());
        profile.setOrderManagement(profileDetails.getOrderManagement());

        Profile updatedProfile = service.saveProfile(profile);
        return updatedProfile;
    }
}