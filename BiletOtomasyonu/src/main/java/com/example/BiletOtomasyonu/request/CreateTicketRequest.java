package com.example.BiletOtomasyonu.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateTicketRequest {

    private Date date;

    private Double price;

    private String number;

    private Integer ticketStatus;

    private Long routeId;

    private Long busId;
}
