package com.ballistic.aqa.backend.model;

import java.sql.Timestamp;

/**
 * Created by Lycus 01 on 8/23/2017.
 */
public class Salary {

    private Long id;
    private Employee employee;
    // only get (Month,Year)
    private String salMonth;
    private Timestamp saleDate;
    private Double salAmount;
    // check pay or not
    private Boolean status;
    // description if any issue
    private String comment;
}
