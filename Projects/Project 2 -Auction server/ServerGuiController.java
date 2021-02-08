import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
	Controller class to determine the actions happen when buttons are pressed in ServerGui
*/

public class ServerGuiController extends Thread {
	
	public static ServerGui serverGui;
	
	public ServerGuiController() {	
		
		serverGui = new ServerGui();
		serverGui.setVisible(true);
		serverGui.pack(); 
		serverGui.setLocationRelativeTo(null); 
		serverGui.setResizable(false);
	
		// Invoke when 'CHANGE PRICE' button is pressed to change price of a certain stock
		serverGui.getChangePriceButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePriceBtnAction();
			}
		});

		// Invoke when 'SHOW STOCK' button is pressed to view all stock details
		serverGui.getShowStockButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				listStockBtnAction();
			}
		});

		// Invoke when 'SHOW' button is pressed to view bid history
		serverGui.getShowButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String symbol = serverGui.getTextSymbolBid().getText();
				showBidHisBtnAction(symbol);
			}
		});
		
	}
	
    private void changePriceBtnAction(){
       	ChangePriceCon con = new ChangePriceCon();
    }
    
    private void listStockBtnAction(){
		ListStockController con = new ListStockController();
    }
	
    private void showBidHisBtnAction(String symbolTxt){
  		BidHistoryCon con = new BidHistoryCon(symbolTxt); 
  	}
  
	// Refresh ServerGui table for each 500ms
    private void loop(){
        while(true){
			
			try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ServerGuiController.class.getName()).log(Level.SEVERE, null, ex);
			}
			
            serverGui.getFBprice().setText(""+StockData.getStockItem("FB").getPrice());
            serverGui.getVRTUprice().setText(""+StockData.getStockItem("VRTU").getPrice());
            serverGui.getMSFTprice().setText(""+StockData.getStockItem("MSFT").getPrice());
            serverGui.getGOOGLprice().setText(""+StockData.getStockItem("GOOGL").getPrice());
            serverGui.getYHOOprice().setText(""+StockData.getStockItem("YHOO").getPrice());
            serverGui.getXLNXprice().setText(""+StockData.getStockItem("XLNX").getPrice());
            serverGui.getTSLAprice().setText(""+StockData.getStockItem("TSLA").getPrice());
            serverGui.getTXNprice().setText(""+StockData.getStockItem("TXN").getPrice());
            
        }
    }
	
	// Method to display all the offers recorded
    public static void addDetailsToTable(Offer offerToAdd){
    	
        DefaultTableModel dtm = (DefaultTableModel)serverGui.getTableBids().getModel();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String offerDate = dateFormat.format(offerToAdd.getDate());
        String offerTime = timeFormat.format(offerToAdd.getDate());
        Object newRow[] = {offerToAdd.getClientName(), offerToAdd.getSymbol(), offerToAdd.getPrice(), offerDate, offerTime};
		dtm.addRow(newRow);
		
    }

	@Override
	public void run() {
		loop();
	}
	    
}