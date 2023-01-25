package com.example.BiletOtomasyonu.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TicketFilterRequest {

    private Integer ticketStatusId;

    private Date date;

    private Long routeId;

}
