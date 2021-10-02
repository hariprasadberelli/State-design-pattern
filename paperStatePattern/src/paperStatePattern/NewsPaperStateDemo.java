package paperStatePattern;

public class NewsPaperStateDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Displaying news papers states\n");
		
		PaperStateContext psc = new PaperStateContext();
		
		psc.startQuote();
 
		psc.setState(new TodayNewspaper());
		
		psc.changeQuote();
		
	}

}
