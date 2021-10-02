package paperStatePattern;

public class YesterDayNewsPaper implements State {
	
	YesterDayNewsPaper(){
		this.Quote();
	}

	@Override
	public void Quote() {
		System.out.println("Yesterday's Newspaper Today's Wastepaper");
		
	}

}
