package com.example.BiletOtomasyonu.controller;

import com.example.BiletOtomasyonu.entity.Ticket;
import com.example.BiletOtomasyonu.request.CreateTicketRequest;
import com.example.BiletOtomasyonu.request.TicketFilterRequest;
import com.example.BiletOtomasyonu.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/all")
    public ResponseEntity<List<Ticket>> getAllTicket() {
        List<Ticket> allTicket = ticketService.getAllTicket();
        return new ResponseEntity<List<Ticket>>(allTicket, HttpStatus.OK);
    }

    @GetMapping("/{ticketId}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable(name = "ticketId") Long ticketId) {
        Ticket ticket = ticketService.getTicketById(ticketId);
        return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Ticket> save(@RequestBody CreateTicketRequest createTicketRequest){
        Ticket savedTicket = ticketService.save(createTicketRequest);
        return new ResponseEntity<Ticket>(savedTicket, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Ticket> updateTicket(@RequestBody Ticket ticket) {
        Ticket updatedTicket = ticketService.updateTicket(ticket);
        return new ResponseEntity<Ticket>(updatedTicket, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTicketById(@PathVariable(name = "id") Long ticketId) {
        ticketService.deleteTicketById(ticketId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PostMapping("/filter")
    public ResponseEntity<List<Ticket>> filter(@RequestBody TicketFilterRequest ticketFilterRequest) {
        List<Ticket> tickets = ticketService.filter(ticketFilterRequest);
        return new ResponseEntity<List<Ticket>>(tickets, HttpStatus.OK);
    }
}
