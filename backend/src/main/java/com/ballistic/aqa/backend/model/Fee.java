package com.ballistic.aqa.backend.model;

import java.sql.Timestamp;

/**
 * Created by Lycus 01 on 8/23/2017.
 */
public class Fee {

    private Long id;
    private Student student;
    private Subject subject;
    private Boolean paid;
    private Double feesAmount;
    private Timestamp feeDate;
    private String feesDescription;
}
