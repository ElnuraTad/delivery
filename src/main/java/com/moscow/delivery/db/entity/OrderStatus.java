package com.moscow.delivery.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "order_statuses")
@Getter
@Setter
@NoArgsConstructor
public class OrderStatus {

    @Id
    @SequenceGenerator(name = "orderStatus_sequence",
    sequenceName = "orderStatus_sequence",
    allocationSize = 1)
    @GeneratedValue(generator = "orderStatus_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private Status status;

    private LocalDate localdate;

    private boolean isActive;


}
