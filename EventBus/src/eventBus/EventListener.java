package eventBus;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

public class EventListener {

	private static int eventsHandled = 0;
	private static int deadEventsHandled = 0;
	
	public EventListener() {
		// TODO Auto-generated constructor stub
	}
	 
    @Subscribe
    public void stringEvent(String event) {
    	eventsHandled++;
    	System.out.println(event);
    }

    @Subscribe
    public void someCustomEvent(CustomEvent customEvent) {
        eventsHandled++;
        System.out.println(customEvent.getAction());
    }
    
    @Subscribe
    public void handleDeadEvent(DeadEvent deadEvent) {
        deadEventsHandled++;
        System.out.println(deadEvent.toString());
    }
    
	public static int getEventsHandled() {
		return eventsHandled;
	}

	public static int getDeadEventsHandled() {
		return deadEventsHandled;
	}

	
}
