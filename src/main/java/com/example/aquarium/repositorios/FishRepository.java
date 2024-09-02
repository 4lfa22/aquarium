package com.example.aquarium.repositorios;

import com.example.aquarium.modelo.Fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FishRepository extends JpaRepository <Fish, Long> {
}
