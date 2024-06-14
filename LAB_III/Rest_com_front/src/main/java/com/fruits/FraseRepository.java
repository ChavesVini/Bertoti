package com.fruits;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Controller, Long> {
}