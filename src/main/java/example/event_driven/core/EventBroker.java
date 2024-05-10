package example.event_driven.core;

import example.event_driven.common.Event;
import example.event_driven.common.EventHandler;

import java.util.HashMap;
import java.util.Map;

public class EventBroker {
    private Map<Class<? extends Event>, EventHandler<? extends Event>> handlers;

    public EventBroker() {
        handlers = new HashMap<>();
    }

    public <E extends Event> void register(Class<E> eventType, EventHandler<E> handler) {
        handlers.put(eventType, handler);
    }

    public <E extends Event> void dispatch(E event) {
        EventHandler<E> handler = (EventHandler<E>)handlers.get(event.getClass());

        if(handler != null) {
            handler.handle(event);
        }
    }
}
