package au.com.suncorp.apphealth.OmnibusEvents.bootstrap;

import au.com.suncorp.apphealth.OmnibusEvents.model.Event;
import au.com.suncorp.apphealth.OmnibusEvents.model.Update;
import au.com.suncorp.apphealth.OmnibusEvents.repositories.EventRepository;
import au.com.suncorp.apphealth.OmnibusEvents.repositories.UpdateRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{

    private EventRepository eventRepository;
    private UpdateRepository updateRepository;

    public DevBootStrap(EventRepository eventRepository, UpdateRepository updateRepository){
        this.eventRepository = eventRepository;
        this.updateRepository = updateRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        initData();
    }

    private void initData(){
        Event event = new Event();
        event.setIdentifier("Identifier");
        event.setSerial(1);
        event.setIdentifier("node");
        event.setAlert_group("alert_group");
        event.setAlert_key("alert_key");
        event.setAgent("agent");
        event.setSeverity(1);
        event.setType("1");
        event.setTally(2);
        eventRepository.save(event);

        Update update = new Update();
        update.setUpdated(new Timestamp(System.currentTimeMillis()));
        updateRepository.save(update);

    }
}
