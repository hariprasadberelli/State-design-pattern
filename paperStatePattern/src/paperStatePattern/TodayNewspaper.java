package paperStatePattern;

public class TodayNewspaper implements State {
	
	TodayNewspaper(){
		this.Quote();
	}

	@Override
	public void Quote() {
		 
		System.out.println("Today's Newspaper Tomorrow's Wastepaper");
		
	}

}
