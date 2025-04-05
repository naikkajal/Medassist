package com.backend.medassist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    @Id
    @Column(name="userId")
    private String userId;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="dob")
    private String dob;

    @Column(name="email")
    private String email;

    @Column(name="mobile")
    private String mobile;

    @Column(name="bloodGroup")
    private String bloodGroup;

    @Column(name="createdTimestamp")
    private Timestamp createdTimestamp;
}

