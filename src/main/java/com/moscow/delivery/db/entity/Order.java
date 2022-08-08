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

    @Column(name = "order_send_name")
    private String sendName;
    @Column(name = "order_phone_number")
    private String phoneNumber;
    @Column(name = "order_address")
    private String address;

    @Column(name = "order_getPhoneNumber")
    private String getPhoneNumber;
    @Column(name = "order_getName")
    private String getName;
    @Column(name = "order_getAddress")
    private String getAddress;

    @Enumerated(EnumType.STRING)
    private Region region;

    //private City city;

    @Column(name = "order_boxWeight")
    private String boxWeight;
    @Column(name = "order_boxPrice")
    private String box_price;
    @Column(name = "order_boxInfo")
    private String boxInfo;
    @Column(name = "order_totalSumPrice")
    private String totalSumPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "tarif_id")
    private Tariff tariff;

}
