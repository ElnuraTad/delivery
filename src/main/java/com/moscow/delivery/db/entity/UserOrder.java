package com.moscow.delivery.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "User_Orders")
@Getter
@Setter
@NoArgsConstructor
public class UserOrder {

    @Id
    @SequenceGenerator(name = "UserOrder_sequence",
    sequenceName = "UserOrder_sequence",
    allocationSize = 1)
    @GeneratedValue(generator = "UserOrder_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id")
    private  User user;


    @Enumerated(EnumType.STRING)
    private OrderQueue queue;

}
