package com.example.BiletOtomasyonu.repository;

import com.example.BiletOtomasyonu.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TicketRepository  extends JpaRepository<Ticket, Long>, JpaSpecificationExecutor<Ticket> {

}
