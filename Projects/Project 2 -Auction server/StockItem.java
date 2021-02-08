/*
	Model class to set symbol, securityName and price in HashMap
*/

public class StockItem {
	
	String symbol;
	String securityName;
	Double price; 
	
	// Constructor to set values
	public StockItem(String symbol, String securityName, double price) {
		this.symbol = symbol;
		this.securityName = securityName;
		this.price = price;			
	}
	
	// Getters and setters	
	public Double getPrice() {
		return price;
	}

	public String getSecurityName() {
		return securityName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}