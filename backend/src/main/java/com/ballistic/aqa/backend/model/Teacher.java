package com.ballistic.aqa.backend.model;

import com.ballistic.aqa.backend.model.constant.Gender;

import java.sql.Timestamp;


/**
 * Created by Lycus 01 on 8/21/2017.
 */
public class Teacher extends User {

    private Long id;

    public Teacher() {
        super();
    }

    public Teacher(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate,
                   String email, String password, String fname, String lname,
                   Timestamp dob, String phone, String mobile, Boolean status,
                   Gender gender, Long id) {
        super(createdAt, updatedAt, lastLoginDate, email, password, fname, lname, dob, phone, mobile, status, gender);
        this.id = id;
    }
}
