package au.com.suncorp.apphealth.OmnibusEvents.controllers;

import au.com.suncorp.apphealth.OmnibusEvents.repositories.EventRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    private EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping("/events")
    public String getEvents(Model model){

        model.addAttribute("events", eventRepository.findAll());

        return "events";
    }

}
