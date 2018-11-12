package eventBus;
import com.google.common.eventbus.EventBus;
import org.junit.Test;
import org.junit.Assert;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventBus bus1 = new EventBus();
		EventListener el = new EventListener();
		bus1.register(el);
		
		bus1.post("String Event");
		Assert.assertEquals(1, EventListener.getEventsHandled());
		
		CustomEvent customEvent = new CustomEvent("Custom Event");
	    bus1.post(customEvent);
	    Assert.assertEquals(2, EventListener.getEventsHandled());
	    
	    CustomEvent2 customEvent2 = new CustomEvent2("Custom Event2");
	    bus1.post(customEvent2);
	    Assert.assertEquals(1, EventListener.getDeadEventsHandled());
	    
	    
	}

}
