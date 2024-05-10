package example.event_driven.common;

import java.util.Date;

public abstract class AbstractEvent implements Event {

    private Date eventDate;

    public AbstractEvent(Date eventDate) { this.eventDate = eventDate; }

    public Date getEventDate() { return eventDate; }

}
