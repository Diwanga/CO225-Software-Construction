public class BidHistoryGui extends javax.swing.JFrame {

    /*
        Creates new form BidHistoryGui
    */

    // Variables declaration                     
    private javax.swing.JTable bidHistoryTable;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBar;
    
    public BidHistoryGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        bidHistoryTable = new javax.swing.JTable();

        titleBar.setBackground(new java.awt.Color(9, 25, 71));

        title.setFont(new java.awt.Font("Times New Roman", 1, 18));
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("BID HISTORY");

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        // Table to view details of the price changes of stocks
        bidHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLIENT NAME", "PRICE", "DATE", "TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(bidHistoryTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
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

    
    public javax.swing.JTable getBidHistoryTable() {
		return bidHistoryTable;
    }
    
}
