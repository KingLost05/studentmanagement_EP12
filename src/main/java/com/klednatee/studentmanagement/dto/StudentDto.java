package com.klednatee.studentmanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;

    @NotEmpty(message = "*กรุณากรอกชื่อ")
    private String firstName;

    @NotEmpty(message = "*กรุณากรอกนามสกุล")
    private String lastName;

    @NotEmpty(message = "*กรุณากรอกอีเมล")
    @Email
    private String email;
}
