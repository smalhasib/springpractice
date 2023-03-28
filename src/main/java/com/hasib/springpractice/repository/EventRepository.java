package com.hasib.springpractice.repository;

import com.hasib.springpractice.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
