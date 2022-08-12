package com.moscow.delivery.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "branche_orders")
public class BrancheOrder {
    
    @Id
    @SequenceGenerator(name = "branche_orders_sequence",
            sequenceName = "branche_orders_sequence",
            allocationSize = 1)
    @GeneratedValue(generator = "branche_orders_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "branche_id")
    private Branche branche;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    
    @Column(name = "index")
    private  Long index;
}
