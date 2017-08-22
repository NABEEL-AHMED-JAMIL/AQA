package com.ballistic.aqa.backend.model;

import java.util.List;

/**
 * Created by Lycus 01 on 8/22/2017.
 */
public class Subject {

    private Long id;
    private String subName;
    private String subCode;
    private Long subDuration;
    private Double subCost;
    private Double marks;
    // this is show to the user
    // what you child now ridding these day
    private List<String> steps;
}

