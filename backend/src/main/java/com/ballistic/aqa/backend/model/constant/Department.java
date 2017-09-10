package com.ballistic.aqa.backend.model.constant;

/**
 * Created by Lycus 01 on 8/22/2017.
 */
public enum Department {

    // used for the both teacher and the other stafe also the student
    ELECTRONICS_ENGINEERING("Electronics and Telecommunication Enginerring"),
    INFORMATION_TECHNOLOGY("Information Technology"),
    CIVIL_ENGINEERING("Civil Engineering"),
    ELECTRICAL_ENGINEERING("Electrical Engineering and Power");

    private String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return this.deptName;
    }
}
