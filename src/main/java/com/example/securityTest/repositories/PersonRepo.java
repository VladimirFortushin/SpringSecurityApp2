package com.example.securityTest.repositories;

import com.example.securityTest.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}
