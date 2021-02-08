import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
	Set table values for BidHistory GUI
*/

public class BidHistoryCon {

	String symbolText ;
	public static BidHistoryGui bidlist;

	public BidHistoryCon(String symbol) {
		
		symbolText = symbol;
		bidlist = new BidHistoryGui();
		bidlist.setVisible(true);
		initTable();
	
	}
	
	private void initTable(){

		DefaultTableModel dtm = (DefaultTableModel)bidlist.getBidHistoryTable().getModel();

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");		// Format that date is represented
		DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");		// Format that time is represented
		
		for (Offer offer : OfferDB.getOfferList()) {
			
			String date = dateFormat.format(offer.getDate());			// Get date from added bids
			String time = timeFormat.format(offer.getDate());			// Get time from added bids
			
			// Select required records for the bid history table from all the bids
			if(symbolText.equals(offer.getSymbol())) {
				Object[] newRow = {offer.getClientName(), offer.getPrice(),date,time};
				dtm.addRow(newRow);
			}
		}
	}
}