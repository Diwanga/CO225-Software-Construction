import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ChangePriceGui extends javax.swing.JFrame {
	
	// Variables declaration
    private javax.swing.JButton changeButton;
    private javax.swing.JLabel currPrice;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel newPrice;
    private javax.swing.JTextField newPriceText;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel secName;
    private javax.swing.JLabel showCurrPrice;
    private javax.swing.JLabel symbol;
    private javax.swing.JTextField symbolText;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBar;

    /**
     * Creates new form ChangePriceGui
     */
    public ChangePriceGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        symbol = new javax.swing.JLabel();
        symbolText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        currPrice = new javax.swing.JLabel();
        showCurrPrice = new javax.swing.JLabel();
        newPrice = new javax.swing.JLabel();
        newPriceText = new javax.swing.JTextField();
        changeButton = new javax.swing.JButton();
        secName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleBar.setBackground(new java.awt.Color(99, 101, 107));

        title.setFont(new java.awt.Font("Times New Roman", 1, 24));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CHANGE PRICE");

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(30, 53, 110));

        symbol.setFont(new java.awt.Font("Times New Roman", 1, 18));
        symbol.setForeground(new java.awt.Color(255, 255, 255));
        symbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symbol.setText("SYMBOL    :");

        symbolText.setFont(new java.awt.Font("Times New Roman", 0, 18));
        symbolText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        searchButton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        searchButton.setText("SEARCH");

        currPrice.setFont(new java.awt.Font("Times New Roman", 1, 14));
        currPrice.setForeground(new java.awt.Color(255, 255, 255));
        currPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currPrice.setText("CURRENT PRICE  (Rs)   :");

        showCurrPrice.setFont(new java.awt.Font("Times New Roman", 1, 14));
        showCurrPrice.setForeground(new java.awt.Color(255, 255, 255));
        showCurrPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        newPrice.setFont(new java.awt.Font("Times New Roman", 1, 14));
        newPrice.setForeground(new java.awt.Color(255, 255, 255));
        newPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newPrice.setText("NEW PRICE (Rs)      :");

        newPriceText.setFont(new java.awt.Font("Times New Roman", 1, 14));
        newPriceText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPriceText.setEnabled(false);

        changeButton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        changeButton.setText("CHANGE");
        changeButton.setEnabled(false);
		

        secName.setFont(new java.awt.Font("Times New Roman", 1, 18));
        secName.setForeground(new java.awt.Color(255, 255, 0));
        secName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(symbol, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(symbolText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(searchButton))
                    .addComponent(secName, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(currPrice)
                .addGap(60, 60, 60)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(newPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(showCurrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symbolText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(secName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showCurrPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPrice)
                    .addComponent(newPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();

    }


    // 
	public JTextField getSearchtext() {
        return symbolText;
    }
	
	// Display current price
	 public JLabel getCurrPriceText() {
        return showCurrPrice;
    }
	
	// Enter new price
	public JTextField getNewPriceText() {
        return newPriceText;
    }  

    public JButton getSearchbutton() {
        return searchButton;
    }

    public JButton getChangebutton() {
        return changeButton;
    }

    public JLabel getSecName() {
        return secName;
    }
                    
}