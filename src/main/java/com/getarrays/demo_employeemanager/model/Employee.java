package com.getarrays.demo_employeemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    // TODO regarder GenerationType
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    // TODO Enum avec les jobs possibles
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee() {}

    /**
     * Constructeur
     * @param employeeCode : code de l'employé
     * @param imageUrl : lien vers l'image/photo de l'employé
     * @param phone : numéro de téléphone de l'employé
     * @param jobTitle : titre/poste de l'employé
     * @param email : adresse mail de l'employé
     * @param name : nom de l'employé
     */
    public Employee(String employeeCode, String imageUrl, String phone, String jobTitle, String email, String name) {
        this.employeeCode = employeeCode;
        this.imageUrl = imageUrl;
        this.phone = phone;
        this.jobTitle = jobTitle;
        this.email = email;
        this.name = name;
    }

    /**
     * Getter de l'identifiant technique de l'employé
     * @return Id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter de l'identifiant technique de l'employé
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter du nom de l'employé
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter du nom de l'employé
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter de l'adresse mail de l'employé
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter de l'attribut email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter de l'attribut du poste de l'employé
     * @return jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Setter de l'attribut du poste de l'employé
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Getter de l'attribut du numéro de téléphone de l'employé
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter de l'attribut du numéro de téléphone de l'employé
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter du lien vers l'image/photo de l'employé
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter du lien vers l'image/photo de l'employé
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter du code de l'employé
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * Setter du code de l'employé
     * @param employeeCode
     */
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString(){
        return "Employee(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ')';
    }
}
