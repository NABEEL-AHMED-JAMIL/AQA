package com.company;

import java.sql.Timestamp;


/**
 * Created by Lycus 01 on 8/21/2017.
 */
public class Teacher extends User {

    private Long id;

    public Teacher() {
        super();
    }

    public Teacher(String email, String password, String fname, String lname, Timestamp dob, String phone, String mobile) {
        super(email, password, fname, lname, dob, phone, mobile);
    }
}
