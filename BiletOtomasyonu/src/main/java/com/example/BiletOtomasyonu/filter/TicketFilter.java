package com.example.BiletOtomasyonu.filter;

import com.example.BiletOtomasyonu.entity.Ticket;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class TicketFilter {
    private Date ticketDate;
    private String status;

    List<Ticket> tickets = new ArrayList<>();
    List<Ticket> DateList = (List<Ticket>) tickets.stream()
            .filter(ticket -> ticket.getDate()== this.ticketDate)
            .collect(Collectors.toList());
    //List<Ticket> StatusList = (List<Ticket>) tickets.stream()
            //.filter(ticket -> ticket.s== this.status)
            //.collect(Collectors.toList());
}
