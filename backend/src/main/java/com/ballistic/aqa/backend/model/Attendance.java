package com.ballistic.aqa.backend.model;

import java.sql.Timestamp;

/**
 * Created by Lycus 01 on 8/22/2017.
 */
// issue
public class Attendance {

    private Long id;
    private Timestamp date;
    private Student student;
    private Boolean status;
    private String remark;
}
