package com.example.ipwijaevents.repository;

import com.example.ipwijaevents.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long>{

}