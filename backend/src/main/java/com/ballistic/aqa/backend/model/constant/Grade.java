package com.ballistic.aqa.backend.model.constant;

/**
 * Created by Lycus 01 on 8/22/2017.
 */
public class Grade {

    private Long id;
    // this will be the upper case store and read
    private String grade;

    public Grade() {}

    public Grade(Long id, String grade) {
        this.id = id;
        this.grade = grade;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getGrade() { return grade; }

    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return "Grade{" + "id=" + id + ", grade='" + grade + '\'' + '}';
    }
}
