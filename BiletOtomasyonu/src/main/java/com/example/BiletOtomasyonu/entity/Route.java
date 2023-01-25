package com.example.BiletOtomasyonu.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Routes")
@Getter
@Setter
public class Route {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "FROM_ROUTE")
    private String fromRoute;

    @Column(name = "TO_ROUTE")
    private String toRoute;
}
