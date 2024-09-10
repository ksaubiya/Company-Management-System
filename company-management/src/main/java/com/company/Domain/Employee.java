package com.company.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="employee")
@JsonIgnoreProperties(value = {"createdByUser", "createdAt", "updatedByUser", "updatedAt"})
public class Employee extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="mobile")
    private String mobile;

    @Column(name="address")
    private String address;

    @Column(name="date_of_birth")
    private Date dob;

    @Column(name="qualification")
    private String qualification;

    @Column(name="experience")
    private Integer experience;

    @Column(name = "date_of_joining")
    private Date doj;

    @Column(name="active")
    private Boolean active;

    @Column(name="salary")
    private String salary;

    @Column(name="profile")
    private String profile;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

}
