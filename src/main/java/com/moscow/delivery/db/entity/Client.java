package com.moscow.delivery.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "clients ")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Client {

    @Id
    @SequenceGenerator(name = "client_sequence",
    sequenceName = "client_sequence",
    allocationSize = 1)
    @GeneratedValue(generator = "client_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "password")
    private String password;
    @Column(name = "address")
    private String address;
    @Column(name = "located_country")
    private String locatedCountry;
    @Column(name = "inn")
    private Long INN;

    @Enumerated(EnumType.STRING)
    private Role role;




    //private Role_client;


}
