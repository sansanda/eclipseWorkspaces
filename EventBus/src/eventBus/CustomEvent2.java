package eventBus;
public class CustomEvent2 {
	private String action;
	
	public CustomEvent2() {
		super();
		action = "defaultAction";
	}

	public CustomEvent2(String action) {
		super();
		this.action = action;
	}

	public String getAction() {
		return action;
	}
	
	

}

