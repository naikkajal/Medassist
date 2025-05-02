package com.backend.medassist.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequest {
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String mobile;
    private String bloodGroup;
}
