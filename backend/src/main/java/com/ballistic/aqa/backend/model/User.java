package com.ballistic.aqa.backend.model;

import com.ballistic.aqa.backend.model.constant.Gender;

import java.sql.Timestamp;


/**
 * Created by Lycus 01 on 8/21/2017.
 */

// user detail that need for the (parent, student, teacher)
public abstract class User extends DatedModel {

    private String email;
    private String password;
    private String fname;
    private String lname;
    private Timestamp dob;
    private String phone;
    private String mobile;
    private Boolean status;
    private Gender gender;
    private String address;

    //

    public User() {
        super();
    }

    public User(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate,
                String email, String password, String fname, String lname, Timestamp dob,
                String phone, String mobile, Boolean status, Gender gender) {
        super(createdAt, updatedAt, lastLoginDate);
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;
        this.status = status;
        this.gender = gender;
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getStatus() { return status; }

    public void setStatus(Boolean status) { this.status = status; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!email.equals(user.email)) return false;
        if (!password.equals(user.password)) return false;
        if (!fname.equals(user.fname)) return false;
        if (!lname.equals(user.lname)) return false;
        if (!dob.equals(user.dob)) return false;
        if (!phone.equals(user.phone)) return false;
        if (!mobile.equals(user.mobile)) return false;
        if (!status.equals(user.status)) return false;
        return gender == user.gender;

    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + fname.hashCode();
        result = 31 * result + lname.hashCode();
        result = 31 * result + dob.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + mobile.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" + "email='" + email + '\'' + ", password='" + password + '\'' +
                ", fname='" + fname + '\'' + ", lname='" + lname + '\'' +
                ", dob=" + dob + ", phone='" + phone + '\'' + ", mobile='" + mobile + '\'' +
                ", status=" + status + ", gender=" + gender + '}';
    }
}
