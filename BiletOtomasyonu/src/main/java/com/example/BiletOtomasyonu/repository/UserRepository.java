package com.example.BiletOtomasyonu.repository;

import com.example.BiletOtomasyonu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
