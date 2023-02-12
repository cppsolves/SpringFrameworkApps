package com.example.UniversityEventManagment.repository;

import com.example.UniversityEventManagment.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Ieventrepository extends JpaRepository<Event,Integer> {
}
