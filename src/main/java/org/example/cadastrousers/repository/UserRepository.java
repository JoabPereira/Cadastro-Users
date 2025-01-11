package org.example.cadastrousers.repository;

import org.example.cadastrousers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
