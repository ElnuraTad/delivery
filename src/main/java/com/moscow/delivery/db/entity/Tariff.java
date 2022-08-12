package com.moscow.delivery.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tariffes")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tariff {

    @Id
    @SequenceGenerator(name = "tarif_sequens",
    sequenceName = "tarif_sequens",
    allocationSize = 1)
    @GeneratedValue(generator = "tarif_sequens", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "time_to_delivery")
    private LocalDateTime timeTodelivery;

    @Enumerated(EnumType.STRING)
    private Region region;

    @Column(name = "price")
    private Long price;

    @Column(name = "available_credit_card")
    private String availibilityCreditVard;
    @Column(name = "description")
    private String description;
}
