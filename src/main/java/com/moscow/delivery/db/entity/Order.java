package com.moscow.delivery.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @SequenceGenerator(name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1)
    @GeneratedValue(generator = "order_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "sender_name")
    private String sendName;
    @Column(name = "sender_phone_number")
    private String phoneNumber;
    @Column(name = "sender_address")
    private String address;

    @Column(name = "getter_phone_number")
    private String getPhoneNumber;
    @Column(name = "getter_name")
    private String getName;
    @Column(name = "getter_address")
    private String getAddress;

    @Enumerated(EnumType.STRING)
    private Region region;

    //private City city;

    @Column(name = "box_weight")
    private String boxWeight;
    @Column(name = "box_price")
    private String boxPrice;
    @Column(name = "box_info")
    private String boxInfo;
    @Column(name = "total_sum_oforder")
    private String totalSumOfOrder;

    @ManyToOne()
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "tarif_id")
    private Tariff tariff;

}
