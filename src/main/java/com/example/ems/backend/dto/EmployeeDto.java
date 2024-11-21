package com.example.ems.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class EmployeeDto {

        private Long id;
        private String firstName;
        private String email;
        private String lastName;

}
