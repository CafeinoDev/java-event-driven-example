package example.event_driven.common.events;

import example.event_driven.common.AbstractEvent;
import example.event_driven.entities.User;

import java.util.Date;

public class UserEvent extends AbstractEvent {

    private final User user;
    private final UserEventType type;

    public UserEvent(User user, UserEventType type, Date eventDate) {
        super(eventDate);
        this.user = user;
        this.type = type;
    }

    public User getUser() { return user; }

    public UserEventType getType() { return type; }

    public enum UserEventType {
        CREATED, UPDATED, DELETED
    }
}
