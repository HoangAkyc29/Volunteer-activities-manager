package com.example.demo1_pbl4.service.impl;

import com.example.demo1_pbl4.model.Event;
import com.example.demo1_pbl4.repository.EventRepository;
import com.example.demo1_pbl4.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;


    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId).get();
    }

    @Override
    public Event insertEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public void updateEvent(Event event) {
    eventRepository.save(event);
    }

    @Override
    public boolean deleteEvent(Long eventId) {
         eventRepository.deleteById(eventId);
         return true;
    }
    @Override
    public List<Event> findEventByLocationAndKeyword(String location,String keyword)
    {
       return eventRepository.findEventByLocationAndKeyword(location,keyword);
    }

    @Override
    public List<Event> findEventByLocation(String location)
    {
        return eventRepository.findEventByLocation(location);
    }

    @Override
    public List<Event> findEventByEventName(String eventName)
    {
        return eventRepository.findEventByEventName(eventName);
    }
    @Override
    public List<Event> findEventByHostname(String hostname)
    {
        return eventRepository.findEventByHostname(hostname);
    }
}
