
public class Launcher {

	public static void main(String[] args) {
		
		//create new instance of a market
		Trading market = new Trading();
		//get all inputs from user
		market.getInput();
		//execute buy and sell orders
		market.make_trades();
		
		
		
	
	}
}
