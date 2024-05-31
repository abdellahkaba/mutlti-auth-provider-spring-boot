package com.isi.multiauthapi.repository;

import com.isi.multiauthapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}