package com.company;

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

    private Boolean status;

    public DatedModel() { }

    public DatedModel(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate, Boolean status) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastLoginDate = lastLoginDate;
        this.status = status;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatedModel that = (DatedModel) o;

        if (!createdAt.equals(that.createdAt)) return false;
        if (!updatedAt.equals(that.updatedAt)) return false;
        if (!lastLoginDate.equals(that.lastLoginDate)) return false;
        return status.equals(that.status);

    }

    @Override
    public int hashCode() {
        int result = createdAt.hashCode();
        result = 31 * result + updatedAt.hashCode();
        result = 31 * result + lastLoginDate.hashCode();
        result = 31 * result + status.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DatedModel{" + "createdAt=" + createdAt + ", updatedAt=" + updatedAt +
                ", lastLoginDate=" + lastLoginDate + ", status=" + status + '}';
    }
}
