import javax.swing.table.DefaultTableModel;

/*
    Controller to set values to the table named 'Stock Item' 
*/

public class ListStockController {
    
    private StockListGui stocksgui;

    // Constructor
    public ListStockController() {
    	stocksgui = new StockListGui();
    	stocksgui.setVisible(true);
    	stocksgui.setResizable(false);
    	stocksgui.pack();
    	stocksgui.setLocationRelativeTo(null);
        initTable();
    }
    
    private void initTable(){
        
        DefaultTableModel dtm = (DefaultTableModel)stocksgui.getStockListTable().getModel();
        
        // Take all stock data to the 'List Stock' table
        for (StockItem stock : StockData.getAllStocks()) {
            Object[] newRow = {stock.getSymbol(), stock.getSecurityName(), stock.getPrice()};
            dtm.addRow(newRow);
        }
        
    }
    
}
