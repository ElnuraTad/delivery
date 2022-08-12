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

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "create_date")
    private LocalDate createDate;
}
