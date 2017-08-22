package com.ballistic.aqa.backend.model;

import java.sql.Timestamp;

/**
 * Created by Lycus 01 on 8/21/2017.
 */
public class DatedModel {

    // this create and update are not used in the parent section
    private Timestamp createdAt;

    private Timestamp updatedAt;
    // this will update after the login-out the user
    private Timestamp lastLoginDate;


    public DatedModel() { }

    public DatedModel(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastLoginDate = lastLoginDate;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }



}
