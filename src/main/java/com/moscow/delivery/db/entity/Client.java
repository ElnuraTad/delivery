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

    @Column(name = "client_firstName")
    private String firstName;
    @Column(name = "client_lastname")
    private String lastName;
    @Column(name = "client_email")
    private String email;
    @Column(name = "client_phoneNumber")
    private int phoneNumber;
    @Column(name = "client_password")
    private String password;
    @Column(name = "client_address")
    private String address;



    //private Role_client;


}
