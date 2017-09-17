package au.com.suncorp.apphealth.OmnibusEvents.repositories;

import au.com.suncorp.apphealth.OmnibusEvents.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long>{
}
