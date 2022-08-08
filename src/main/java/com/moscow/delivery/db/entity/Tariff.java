package com.moscow.delivery.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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
}
