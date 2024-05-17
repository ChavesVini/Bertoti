package com.fruits;

import com.fruits.TelaCRUD;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<TelaCRUD, Long> {
}