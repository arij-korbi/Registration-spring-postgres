package com.example.leoniplatform.model;


import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "practices")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String plant;
    private String orgUnit;
    private String issuedBy;
    private Date date;
    private String approvedBy;
    private String categoryOfImprovement;
    private String benefits;
    private String area;
    private String documentation;
    private long number;
    private String email;
    private String discriptionB;
    private String discriptionA;
    private String status;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "practice_files",
            joinColumns = { @JoinColumn(name = "practice_id") },
            inverseJoinColumns = { @JoinColumn(name = "file_id") })
    private Set<File> files = new HashSet<>();

    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }

    public Order(){}
    public Order(String title, String plant){
        this.title = title;
        this.plant = plant;
    }

    public Order(int id, String title, String plant, String orgUnit, String issuedBy, Date date, String approvedBy, String categoryOfImprovement, String benefits, String area, String documentation, long number, String email, String discriptionB, String discriptionA, String status) {
        this.id = id;
        this.title = title;
        this.plant = plant;
        this.orgUnit = orgUnit;
        this.issuedBy = issuedBy;
        this.date = date;
        this.approvedBy = approvedBy;
        this.categoryOfImprovement = categoryOfImprovement;
        this.benefits = benefits;
        this.area = area;
        this.documentation = documentation;
        this.number = number;
        this.email = email;
        this.discriptionB = discriptionB;
        this.discriptionA = discriptionA;
        this.status=status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getCategoryOfImprovement() {
        return categoryOfImprovement;
    }

    public void setCategoryOfImprovement(String categoryOfImprovement) {
        this.categoryOfImprovement = categoryOfImprovement;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiscriptionB() {
        return discriptionB;
    }

    public void setDiscriptionB(String discriptionB) {
        this.discriptionB = discriptionB;
    }

    public String getDiscriptionA() {
        return discriptionA;
    }

    public void setDiscriptionA(String discriptionA) {
        this.discriptionA = discriptionA;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
