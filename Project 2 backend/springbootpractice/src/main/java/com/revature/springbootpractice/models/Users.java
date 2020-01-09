package com.revature.springbootpractice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name ="user_profiles")
public class Users {


    @Id
    @Column(name = "profileid")
    int profile_id;

    @Column(name = "firstname")
    String first_name;

    @Column(name="lastname")
    String last_name;

    @Column(name="dateofbirth")
    Date date_of_birth;

    @Column(name="aboutme")
    String about_me;

    @Column(name="emailaddress")
    String email;

    @Column(name="pwd")
    String password;

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(int profile_id, String first_name, String last_name, Date date_of_birth, String about_me, String email, String password) {
        this.profile_id = profile_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.about_me = about_me;
        this.email = email;
        this.password = password;
    }

    public Users() {
    }
}
