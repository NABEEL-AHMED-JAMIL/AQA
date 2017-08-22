package com.ballistic.aqa.backend.model;

import com.ballistic.aqa.backend.model.constant.Gender;

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

    public Parent(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate, String email, String password,
                  String fname, String lname, Timestamp dob, String phone, String mobile, Boolean status,
                  Gender gender, Long id, Set<Student> students, Teacher teacher) {
        super(createdAt, updatedAt, lastLoginDate, email, password, fname, lname, dob, phone, mobile, status, gender);
        this.id = id;
        this.students = students;
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
        return "Parent{" + "id=" + id + ", teacher=" + teacher + '}';
    }
}
