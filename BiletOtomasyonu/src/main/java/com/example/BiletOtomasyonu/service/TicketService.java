package com.example.BiletOtomasyonu.service;

import com.example.BiletOtomasyonu.entity.Ticket;
import com.example.BiletOtomasyonu.enums.TicketStatus;
import com.example.BiletOtomasyonu.repository.BusRepository;
import com.example.BiletOtomasyonu.repository.RouteRepository;
import com.example.BiletOtomasyonu.repository.TicketRepository;
import com.example.BiletOtomasyonu.request.CreateTicketRequest;
import com.example.BiletOtomasyonu.request.TicketFilterRequest;
import com.example.BiletOtomasyonu.specification.TicketFilterSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    BusRepository busRepository;

    @Autowired
    RouteRepository routeRepository;

    @Autowired
    TicketFilterSpecification ticketFilterSpecification;

    public List<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId).get();
    }

    public Ticket save(CreateTicketRequest createTicketRequest){
        Ticket ticket = new Ticket();
        ticket.setTicketStatus(TicketStatus.getByValue(createTicketRequest.getTicketStatus()));
        ticket.setDate(createTicketRequest.getDate());
        ticket.setPrice(createTicketRequest.getPrice());
        ticket.setNumber(createTicketRequest.getNumber());
        ticket.setBus(busRepository.findById(createTicketRequest.getBusId()).get());
        ticket.setRoute(routeRepository.findById(createTicketRequest.getRouteId()).get());
        return ticketRepository.save(ticket);
    }

    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> filter(TicketFilterRequest ticketFilterRequest) {
        return ticketRepository.findAll(ticketFilterSpecification.filter(ticketFilterRequest));
    }

    public void deleteTicketById(Long ticketId) {
        ticketRepository.deleteById(ticketId);
    }
}
