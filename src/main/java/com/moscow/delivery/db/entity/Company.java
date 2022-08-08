package com.moscow.delivery.db.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
public class Company {

    @Id
    @SequenceGenerator(name = "company_sequence",
    sequenceName = "company_sequence",
    allocationSize = 1)
    @GeneratedValue(generator = "company_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "company_name")
    private String name;
    @Column(name = "company_email")
    private String email;
    @Column(name = "cmpany_address")
    private String address;
    @Column(name = "company_phoneNumber")
    private Long phone_number;

    private LocalDate date;
}
