package com.backend.medassist.model;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Users {
    @Id
//    @Column(name="userId")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "user_id", updatable = false, nullable = false)
    private String user_id;

//    @Column(name="firstName")
    private String first_name;

//    @Column(name="lastName")
    private String last_name;

//    @Column(name="dob")
    private String dob;

//    @Column(name="email")
    private String email;

//    @Column(name="mobile")
    private String mobile;

//    @Column(name="bloodGroup")
    private String blood_group;

////    @Column(name="createdTimestamp")
//      @CreationTimestamp
////      @Column(updatable = false)
//      private Timestamp created_timestamp;
@Override
public String toString() {
    return "Users{" +
            "user_id='" + user_id + '\'' +
            ", first_name='" + first_name + '\'' +
            ", last_name='" + last_name + '\'' +
            ", dob='" + dob + '\'' +
            ", email='" + email + '\'' +
            ", mobile='" + mobile + '\'' +
            ", blood_group='" + blood_group + '\'' +
            '}';
}
}

