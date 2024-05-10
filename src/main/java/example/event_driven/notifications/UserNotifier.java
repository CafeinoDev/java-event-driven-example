package example.event_driven.notifications;

import example.event_driven.common.EventHandler;
import example.event_driven.common.events.UserEvent;

public class UserNotifier implements EventHandler<UserEvent> {


    @Override
    public void handle(UserEvent event) {

        String format = "Received event: %s, %tc, %s\n";
        System.out.format(format, event.getType(), event.getEventDate(), event.getUser().getEmail());

    }
}
