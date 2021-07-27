package com.example.leoniplatform.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="MyFiles")
public class File {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;

    private String name;


    private String type;
    @Lob
    private byte[] data;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "files")
    private Set<Order> orders = new HashSet<>();

    public Set<Order> getPractices() {
        return orders;
    }

    public void setPractices(Set<Order> orders) {
        this.orders = orders;
    }

    public File() { }
    public File(String name, String type) {

        this.name = name;
        this.type = type;

    }

    public File(String name, String type, byte[] data) {

        this.name = name;
        this.type = type;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}