import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

/*
    Controller for buttons 'Search' & 'Change Price' in 'ChangePriceGui'
*/

public class ChangePriceCon {

    private ChangePriceGui screen;
    String symbol;
    
    public ChangePriceCon() {
        screen = new ChangePriceGui();
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setSize(817,438);
        screen.pack();
        screen.setLocationRelativeTo(null);

        // Invoke when 'SEARCH' button is pressed
        screen.getSearchbutton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchAction();
            }
        });

        // Invoke when 'CHANGE' button is pressed to change price of a certain stock
        screen.getChangebutton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeAction();
            }
        });
    }
    
    private void searchAction() {

		// Input given by the server user
		symbol = screen.getSearchtext().getText();
		
		// If searched symbol does not exist, display error message
		if(!StockData.checkSymbol(symbol)) {

			screen.getSecName().setText("Invalid Stock Item");
			screen.getSecName().setForeground(new Color(237, 52, 52));
		
		} else {	// If searched symbol exists, display security name and current price
			
			screen.getSecName().setText(StockData.getStockItem(symbol).getSecurityName());
			screen.getCurrPriceText().setText("" + StockData.getStockItem(symbol).getPrice() + "");
			screen.getNewPriceText().setEnabled(true);
			screen.getChangebutton().setEnabled(true);
			
		}
		
	}
    
    private void changeAction(){
        try{
			// Get new price modified by client
			double newPrice=Double.parseDouble(screen.getNewPriceText().getText());
			// Set price to HashMap
			StockData.updateStockPrice(symbol, newPrice); 
			Offer offerByClient = new Offer("By Server", symbol, new Date(), newPrice); //add new offer object as an offerByClient
			OfferDB.addOffer(offerByClient);		//add the new offer given by a client to offer list
			screen.dispose();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Price entered is invalid");	// If error value given as input
        }
    }
    
}
