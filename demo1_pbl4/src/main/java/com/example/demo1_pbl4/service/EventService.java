package com.example.demo1_pbl4.service;

import com.example.demo1_pbl4.model.Event;
import com.example.demo1_pbl4.model.User;

import java.util.List;

public interface EventService {
    List<Event> getAllUsers();
    Event getEventById(Long eventId);
    Event insertEvent(Event event);
    void updateEvent(Event event);
    boolean deleteEvent(Long eventId);
}
