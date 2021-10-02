package paperStatePattern;

public class PaperStateContext {
	
	private State state ;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void startQuote() {
		
		state = new YesterDayNewsPaper();
		
	}
	
public void changeQuote() {
		
		state = new TommrowNewsPaper();
		
	}
	
	
}
