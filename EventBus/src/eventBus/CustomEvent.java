package eventBus;
public class CustomEvent {
	private String action;
	
	public CustomEvent() {
		super();
		action = "defaultAction";
	}

	public CustomEvent(String action) {
		super();
		this.action = action;
	}

	public String getAction() {
		return action;
	}
	
	

}
