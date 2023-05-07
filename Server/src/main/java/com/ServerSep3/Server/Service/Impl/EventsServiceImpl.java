package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Repository.EventRepository;
import com.ServerSep3.Server.Service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventsServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<EventModel> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public EventModel findById(int id) {
        return eventRepository.findById(id);
    }

    @Override
    public EventModel saveEvent(EventModel eventModel) {
        return eventRepository.save(eventModel);
    }

    @Override
    public EventModel updateEvent(EventModel eventModel) {
        deleteUser(Long.valueOf(eventModel.getId()));
        return eventRepository.save(eventModel);
    }

    @Override
    public void deleteUser(Long id) {
        eventRepository.deleteById(id);
    }
}
