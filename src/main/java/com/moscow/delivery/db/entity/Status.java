package com.moscow.delivery.db.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "statuses")
@Getter
@Setter
@NoArgsConstructor
public class Status {

    @Id
    @SequenceGenerator(name = "status_sequence",
    sequenceName = "status_sequence",
    allocationSize = 1)
    @GeneratedValue(generator = "status_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrdStatus status;
    
    @ManyToOne()
    @JoinColumn(name = "tarif_id")
    private Tariff tariff;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}

