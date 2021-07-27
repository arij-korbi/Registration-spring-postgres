package com.example.leoniplatform.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String profileName;
private String userManagement;
    private String orderManagement;
    private String profileManagement;


    public Profile() {

    }


    public Profile(int id, String profileName, String userManagement, String orderManagement, String profileManagement) {
        this.id = id;
        this.profileName = profileName;
        this.userManagement = userManagement;
        this.orderManagement = orderManagement;
        this.profileManagement = profileManagement;
    }

    public String getUserManagement() {
        return userManagement;
    }

    public void setUserManagement(String userManagement) {
        this.userManagement = userManagement;
    }

    public String getOrderManagement() {
        return orderManagement;
    }

    public void setOrderManagement(String orderManagement) {
        this.orderManagement = orderManagement;
    }

    public String getProfileManagement() {
        return profileManagement;
    }

    public void setProfileManagement(String profileManagement) {
        this.profileManagement = profileManagement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

}
