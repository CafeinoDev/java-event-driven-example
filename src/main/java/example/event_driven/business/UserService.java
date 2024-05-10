package example.event_driven.business;

import example.event_driven.common.events.UserEvent;
import example.event_driven.entities.User;

import java.util.Date;

public class UserService extends Service {

    public void update(User user) {

        // Validations

        // Update User

        // Dispatch the event
        UserEvent event = new UserEvent(user, UserEvent.UserEventType.UPDATED, new Date());
        this.broker.dispatch(event);

    }

    public void create(User user) {

        // Validations

        // Store User

        // Dispatch the event
        UserEvent event = new UserEvent(user, UserEvent.UserEventType.CREATED, new Date());
        this.broker.dispatch(event);
    }
}
