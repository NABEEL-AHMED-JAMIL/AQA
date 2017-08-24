package com.ballistic.aqa.backend.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Lycus 01 on 8/24/2017.
 */
// Role Attribute are ok know no need to add for field in it.
@Entity
@Table(name = "role")
public class Role extends DatedModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name="role", nullable = false, unique = true)
    private String role;


    public Role() { super(); }

    public Role(Timestamp createdAt, Timestamp updatedAt, Timestamp lastLoginDate, int id, String role) {
        super(createdAt, updatedAt, lastLoginDate);
        this.id = id;
        this.role = role;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Role{" + "id=" + id + ", role='" + role + '\'' + '}';
    }
}