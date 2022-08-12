package com.moscow.delivery.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "branches")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Branche {

    @Id
    @SequenceGenerator(name = "branche_sequence",
            sequenceName = "branche_sequence",
            allocationSize = 1)
    @GeneratedValue(generator = "branche_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private Long phoneNumber;

    @Enumerated(EnumType.STRING)
    private Region region;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

}
