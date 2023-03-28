package com.hasib.springpractice.service;

import com.hasib.springpractice.dto.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();

    EventDto findByEventId(long eventId);

    void updateEvent(EventDto event);

    void deleteEvent(long eventId);
}
