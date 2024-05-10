package example.event_driven;

import example.event_driven.business.UserService;
import example.event_driven.common.events.UserEvent;
import example.event_driven.core.EventBroker;
import example.event_driven.entities.User;
import example.event_driven.notifications.UserNotifier;

public class Application {

    public static void main(String[] args) {
        // Create an EventBroker instance to manage events
        EventBroker dispatcher = new EventBroker();
        // Register the UserEvent class with the UserNotifier to handle user events
        dispatcher.register(UserEvent.class, new UserNotifier());

        // Create a new instance of UserService
        UserService service = new UserService();
        // Set the EventBroker for the UserService to the one we created
        service.setBroker(dispatcher);

        // Create a new User instance
        User user  = new User("Andy", "Alvarado", "andy@email.com");

        // Create the user
        service.create(user);

        // Update the user
        user.setEmail("new_email@email.com");
        service.update(user);
    }

}
