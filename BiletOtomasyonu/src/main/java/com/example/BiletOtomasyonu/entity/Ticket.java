package com.example.BiletOtomasyonu.entity;

import com.example.BiletOtomasyonu.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "Tickets")
@Getter
@Setter
public class Ticket {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "TICKET_STATUS")
    private TicketStatus ticketStatus;

    @ManyToOne
    @JoinColumn(name="ROUTE_ID")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "BUS_ID")
    private Bus bus;



}
