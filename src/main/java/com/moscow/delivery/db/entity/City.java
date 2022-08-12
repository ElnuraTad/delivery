package com.moscow.delivery.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "cities" )
public class City {

    @Id
    @SequenceGenerator(name = "city_sequence",
            sequenceName = "city_sequence",
            allocationSize = 1)
    @GeneratedValue(generator = "city_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name  = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private  Role role;

    @ManyToOne
    @JoinColumn(name = "branche_id")
    private Branche branche;


}
