package com.moscow.delivery.db.entity;

public enum OrdStatus {

    IN_PROCESSING,
    APPOINTMENT_1(),
    COURIER_ON_THE_WAY,
    AT_THE_COURIER_1(),
    IN_STOCK_1(),
    ON_THE_ROAD,
    IN_STOCK_2(),
    APPOINTMENT_2(),
    AT_THE_COURIER_2(),
    DELIVERED;

}
