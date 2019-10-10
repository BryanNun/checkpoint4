package com.wildcircus.checkpoint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation{
    public Reservation(){
    }

    public Reservation(String firstname, String lastname, String email, int nbWilder,
    int nbChildren, int nbAdult, String city){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.nbWilder = nbWilder;
        this.nbChildren = nbChildren;
        this.nbAdult = nbAdult;
        this.city = city;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private int nbWilder;
    private int nbChildren;
    private int nbAdult;
    private String city;


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return String return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return int return the nbWilder
     */
    public int getNbWilder() {
        return nbWilder;
    }

    /**
     * @param nbWilder the nbWilder to set
     */
    public void setNbWilder(int nbWilder) {
        this.nbWilder = nbWilder;
    }

    /**
     * @return int return the nbChildren
     */
    public int getNbChildren() {
        return nbChildren;
    }

    /**
     * @param nbChildren the nbChildren to set
     */
    public void setNbChildren(int nbChildren) {
        this.nbChildren = nbChildren;
    }

    /**
     * @return int return the nbAdult
     */
    public int getNbAdult() {
        return nbAdult;
    }

    /**
     * @param nbAdult the nbAdult to set
     */
    public void setNbAdult(int nbAdult) {
        this.nbAdult = nbAdult;
    }


    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

}