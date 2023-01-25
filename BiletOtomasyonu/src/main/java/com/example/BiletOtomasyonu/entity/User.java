package com.example.BiletOtomasyonu.entity;


import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Users")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME" , nullable = false)
    private String name;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles= new HashSet<>();

    public void AddRole(Role role){
        this.roles.add(role);
    }


}
