package paperStatePattern;

public class TommrowNewsPaper implements State {
	
	TommrowNewsPaper(){
		this.Quote();
	}

	@Override
	public void Quote() {
		 
		System.out.println("Tomorrow's Newspaper Day after Tomorrow's Wastepaper");
		
	}

}
