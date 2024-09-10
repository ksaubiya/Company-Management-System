package com.company.Domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="department")
@JsonIgnoreProperties(value = {"createdByUser", "createdAt", "updatedByUser", "updatedAt"})
public class Department extends AbstractAuditingEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "active")
    private boolean active=true;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private Set<Employee> employees= new HashSet<>();
}
