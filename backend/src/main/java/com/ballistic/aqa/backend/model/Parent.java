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
    private Employee employee;


    public Parent() {
        super();
    }

    public Parent(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate, String email, String password,
                  String fname, String lname, Timestamp dob, String phone, String mobile, Boolean status,
                  Gender gender, Long id, Set<Student> students, Employee employee) {
        super(createdAt, updatedAt, lastLoginDate, email, password, fname, lname, dob, phone, mobile, status, gender);
        this.id = id;
        this.students = students;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Parent{" + "id=" + id + ", employee=" + employee + '}';
    }
}
