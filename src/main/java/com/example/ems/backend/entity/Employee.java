package com.example.ems.backend.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private String firstName;
    private String email;
    private String lastName;

}
