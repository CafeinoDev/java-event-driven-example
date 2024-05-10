package example.event_driven.business;

import example.event_driven.core.EventBroker;

public abstract class Service {

    EventBroker broker;

    public void setBroker(EventBroker broker) {
        this.broker = broker;
    }
}
