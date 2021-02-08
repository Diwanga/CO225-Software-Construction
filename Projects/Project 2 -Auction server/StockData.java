import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/*
	Class to read data given in csv file and add those into HashMap
*/
public class StockData {
	
	String file = "stocks.csv";
	BufferedReader buffReader;
	static HashMap<String, StockItem> stockDataBase;

	public StockData() {
		
		// create instance of Random class 
		Random rand = new Random();
		
		try {
			
			buffReader = new BufferedReader(new FileReader(file));		  
			String st;
			stockDataBase = new HashMap<>();
			
			while ((st = buffReader.readLine()) != null) {
				
				String[] arr = st.split(",");
				
				double newPrice = Math.round(rand.nextDouble()*10*100.0)/100.0;			// Generate random values for prices of the stocks
				stockDataBase.put(arr[0],  new StockItem(arr[0], arr[1], newPrice ));	// Adding values to HashMap (Symbol, Security Name & Price of each stock is mapped with Symbol)
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
			
	}
	
	// Update stock database (HashMap) with changes to the prices of stocks
	public static void updateStockPrice(String symbol, double price){
		StockItem item = stockDataBase.get(symbol);
		item.setPrice(price);
		stockDataBase.put(symbol, item);
	}	 
	
	// Checking whether the entered symbol exists or not
	public static boolean checkSymbol(String symbol){
		return stockDataBase.containsKey(symbol);
	}
	
	// Getting Symbol, Security Name, Price for a given symbol
	public static StockItem getStockItem(String reqSymb) {
		return stockDataBase.get(reqSymb);
	}

	// Getting all data into HashMap
	public static Collection<StockItem> getAllStocks(){
		return stockDataBase.values();
	}
	
}