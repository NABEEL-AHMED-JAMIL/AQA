package com.ballistic.aqa.backend.model;

import com.ballistic.aqa.backend.model.constant.Gender;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * Created by Lycus 01 on 8/21/2017.
 */

// user detail that need for the (parent, student, teacher)

@MappedSuperclass
public abstract class User extends DatedModel {

    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "firstname", nullable = false)
    private String firstname;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(name = "dob")
    private Timestamp dob;
    @Column(name = "phone")
    private String phone;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "active")
    private Boolean active;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "address")
    private String address;
    // this will be calculated after adding the dob
    @Column(name = "age")
    private Integer age;
    //


    public User() { super(); }

    public User(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate,
                String email, String password, String firstname, String lastname,
                Timestamp dob, String phone, String mobile, Boolean active,
                Gender gender, String address, Integer age) {
        super(createdAt, updatedAt, lastLoginDate);
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;
        this.active = active;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getFirstname() { return firstname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    public Timestamp getDob() { return dob; }

    public void setDob(Timestamp dob) { this.dob = dob; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getMobile() { return mobile; }

    public void setMobile(String mobile) { this.mobile = mobile; }

    public Boolean getActive() { return active; }

    public void setActive(Boolean active) { this.active = active; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }

    @Override
    public String toString() {
        return "User{" + "email='" + email + '\'' + ", password='" + password + '\'' + ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' + ", dob=" + dob + ", phone='" + phone + '\'' + ", mobile='" + mobile + '\'' +
                ", active=" + active + ", gender=" + gender + ", address='" + address + '\'' + ", age=" + age + '}';
    }
}
