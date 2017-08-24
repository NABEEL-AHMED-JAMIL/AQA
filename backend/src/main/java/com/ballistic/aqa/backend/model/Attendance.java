package com.ballistic.aqa.backend.model;

import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Lycus 01 on 8/22/2017.
 */
// issue
public abstract class Attendance {

    private Long id;
    private Timestamp attendate;
    // if the status true/false this will handle the
    // leave operation
    private Boolean status;
    private String remark;
}
