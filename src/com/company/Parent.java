package com.company;

import java.sql.Timestamp;
import java.util.Set;


/**
 * Created by Lycus 01 on 8/21/2017.
 */
public class Parent extends User {

    private Long id;
    private Set<Student> students;
    private Teacher teacher;


    public Parent() {
        super();
    }

    public Parent(String email, String password, String fname, String lname, Timestamp dob, String phone, String mobile, Long id, Teacher teacher) {
        super(email, password, fname, lname, dob, phone, mobile);
        this.id = id;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", teacher=" + teacher +
                '}';
    }
}
