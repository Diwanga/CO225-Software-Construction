import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/*
    Create a GUI to display all details of the stocks
*/

public class StockListGui extends javax.swing.JFrame {

    // Variables declaration
    private javax.swing.JTable stockListTable;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBar;
    
    public StockListGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        stockListTable = new javax.swing.JTable();

    
        titleBar.setBackground(new java.awt.Color(9, 25, 71));

        title.setFont(new java.awt.Font("Times New Roman", 1, 24));
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("STOCK LIST");

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        stockListTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        stockListTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stockListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SYMBOL", "SECURITY NAME", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(stockListTable);
        if (stockListTable.getColumnModel().getColumnCount() > 0) {
            stockListTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            stockListTable.getColumnModel().getColumn(1).setPreferredWidth(180);
            stockListTable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
    

    public javax.swing.JTable getStockListTable() {
		return stockListTable;
	}       
    
}