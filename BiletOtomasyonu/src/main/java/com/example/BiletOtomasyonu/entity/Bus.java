package com.example.BiletOtomasyonu.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bus")
@Getter
@Setter
public class Bus {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BUS_NUMBER")
    private String busNumber;

    @Column(name = "CAPACITY")
    private String capacity;

}
