package com.company;

import java.sql.Timestamp;


/**
 * Created by Lycus 01 on 8/21/2017.
 */
public class Student extends User {

    private Long id;
    private Parent parent;

    public Student() {
        super();
    }

    public Student(String email, String password, String fname, String lname,
                   Timestamp dob, String phone, String mobile, Long id, Parent parent) {
        super(email, password, fname, lname, dob, phone, mobile);
        this.id = id;
        this.parent = parent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        return parent != null ? parent.equals(student.parent) : student.parent == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", parent=" + parent +
                '}';
    }
}
