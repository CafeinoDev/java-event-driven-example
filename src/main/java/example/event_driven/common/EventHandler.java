package example.event_driven.common;

public interface EventHandler <E extends Event>{

    void handle(E event);

}
