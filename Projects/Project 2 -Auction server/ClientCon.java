


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/*
    Controller for buttons 'START BID', 'NEXT', 'CONFIRM', 'QUIT' in 'ClientGui'
*/

public class ClientCon {
	private ClientGui gui;
	private boolean setuser;
	private static String name = "" ;
	private static String symbol = "";
	private static double currentPrice ;
	private static String price = "0";
	
	
	
	public ClientCon(Socket connection) {
		gui = new ClientGui();
    	gui.setVisible(true);
    	gui.setResizable(false);
    	gui.pack();
    	gui.setLocationRelativeTo(null);
        
		// Invoke when 'START BID' button is pressed
        gui.getStartBidButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action(e, connection);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		// Invoke when 'CONFIRM' button is pressed
        gui.getConfirmButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action(e, connection);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		// Invoke when 'QUIT' button is pressed
        gui.getQuitButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action(e, connection);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		// Invoke when 'NEXT' button is pressed
        gui.getNextButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action(e, connection);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
	}
	
	
	
	public void action(ActionEvent e, Socket conn) throws IOException {
		//If QUIT is pressed, exit from the server
		if(e.getSource() == gui.getQuitButton()) {
			gui.dispose();
			if(setuser) {
			Server.deletuser(gui.getNameText().getText());}
			conn.close();
		}
		
		//If 'START BID' is pressed ask the client to enter the client name
		if(e.getSource() == gui.getStartBidButton()) {
			if(gui.getNameText().getText().isEmpty() && gui.getSymText().getText().isEmpty() && gui.getPriceText().getText().isEmpty()) {
				gui.getMainText().setText("<html>Enter Your Name......Press NEXT twice to continue</html>");
				gui.getNameText().setEnabled(true); 
				
			}
			else {
				gui.getStartBidButton().setEnabled(false);
			}
			
		}
		//If 'NEXT' is pressed
		if(e.getSource() == gui.getNextButton()) {
			
			
		
			
			if(Server.isSessionExist(gui.getNameText().getText()) && !setuser) {
				gui.getMainText().setText("Client name already exists in bidding round....Try other name!");
			}
			
			else if(!setuser&& !Server.isSessionExist(gui.getNameText().getText())) {
				
				Server.addSessionUser(gui.getNameText().getText());								
				setuser = true;
				
			}
					
			//If the name is already entered ,ask the client to enter the symbol
			else if(!gui.getNameText().getText().isEmpty() && gui.getSymText().getText().isEmpty()) {
					gui.getMainText().setText("<html>Enter the SYMBOL......Press NEXT to continue</html>");
					gui.getSymText().setEnabled(true);
					gui.getStartBidButton().setEnabled(false);
				}
				//If both name and symbol is entered ,ask the client to enter the price
				else if(!gui.getNameText().getText().isEmpty() && !gui.getSymText().getText().isEmpty()) {
					
					//Get name and symbol entered by the client
					name = gui.getNameText().getText();
					symbol = gui.getSymText().getText();
					function2();
				}	
					
		}
		
		//If 'CONFIRM' is pressed
		if(e.getSource() == gui.getConfirmButton()) {
			//If client pressed 'CONFIRM' without entering a price to bid, display an error message 
			if(gui.getPriceText().getText().isEmpty()) {
				gui.getMainText().setText("<html> Error ! <br>Please enter your price to bid ! </html>");
				
			}
			else {
				
				
				//Get name and symbol entered by the client
				name = gui.getNameText().getText();
				symbol = gui.getSymText().getText();
				StockItem item = StockData.getStockItem(symbol);
				//Get the current price of the stock item
				currentPrice = item.getPrice();
				price="0";
				
				//Get the price entered by the client
				price = gui.getPriceText().getText();
				
				
				try {
					function1();
				
					
				} catch (NumberFormatException e2) {
					gui.getMainText().setText("<html>Error ! <br> Hello "+name+" <br>You entered an invalid value for price.<br>Try again !</html>");
				}
				
				
			}
			
			
		}
		

	
	
	}	


	private synchronized void function1() {
		double newPrice = Double.parseDouble(price);
		
		//Check if price entered by the client is greater than the current price of the security
		if( newPrice <= currentPrice) {
			gui.getMainText().setText("<html>Error ! <br> Hello "+name+"  <br>The price you entered must be greater than the current price of the security. <br> The current price of " +symbol+ " is "+currentPrice+" <br>Please enter your price to bid again ! </html>");
			
		}
		else{
			Offer offer =new Offer(name, symbol,new Date(), newPrice);
        	OfferDB.addOffer(offer);
        	StockData.updateStockPrice(symbol, newPrice);
			gui.getMainText().setText("<html> Congradulations "+name+" ! Your price is accepted.<br>CURRENT PRICE value for "+symbol+" is "+StockData.getStockItem(symbol).getPrice()+"<br>You may bid for another or press QUIT to exit</html>");
			gui.getPriceText().setEditable(true);
			gui.getPriceText().setText("");
			
		}
	}
	private synchronized void function2() {
		//If the symbol does not exist display an error message
		if(!StockData.checkSymbol(symbol)) {
			gui.getMainText().setText("<html> -1 , SYMBOL is invalid. Try again ! </html>");
		}
		else {
			gui.getNameText().setEditable(false);
			gui.getSymText().setEditable(false);
			StockItem item = StockData.getStockItem(symbol);
			double currentPrice = item.getPrice();
			
			//Displays the current price of the stock item
			gui.getMainText().setText("<html>Yes "+name+", The CURRENT PRICE of the security is  " + currentPrice + "<br> Please enter your price to bid...<br> Press CONFIRM to continue</html>");
			gui.getPriceText().setEnabled(true);
			gui.getConfirmButton().setEnabled(true);
			gui.getNextButton().setEnabled(false);
		}
	}

}