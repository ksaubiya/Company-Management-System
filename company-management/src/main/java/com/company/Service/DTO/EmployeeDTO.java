package com.company.Service.DTO;

import com.company.Domain.Department;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {

        private Long id;

        @NotNull
        @NotBlank
        private String firstName;

        @NotNull
        @NotBlank
        private String lastName;

        @NotNull
        @NotBlank
        @Email(message = "email address is not valid !!")
        private String email;

        @NotNull
        @NotBlank
        @Size(min = 10, max = 13)
        private String mobile;

        private String address;

        private Date dob;

        private String qualification;

        private Integer experience;

        @NotNull
        @NotBlank
        private Date doj;

        private Boolean active;

        @NotNull
        @NotBlank
        private String salary;

        private String profile;

        private Department department;

}
