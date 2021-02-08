
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
    Create a GUI to enter client details by the client
*/


public class ClientGui extends JFrame {
	
	 // Variables declaration                     
	   private javax.swing.JButton confirmButton;
	   private javax.swing.JPanel mainPanel;
	   private javax.swing.JLabel mainTextLabel;
	   private javax.swing.JLabel name;
	   private javax.swing.JTextField nameText;
	   private javax.swing.JButton nextButton;
	   private javax.swing.JLabel price;
	   private javax.swing.JTextField priceText;
	   private javax.swing.JButton quitButton;
	   private javax.swing.JButton startBidButton;
	   private javax.swing.JTextField symText;
	   private javax.swing.JLabel symbol;
	   private javax.swing.JLabel title;
	   private javax.swing.JPanel titleBar;
	    


   public ClientGui() {
       initComponents();
   }

  
   @SuppressWarnings("unchecked")
                         
   private void initComponents() {

       titleBar = new javax.swing.JPanel();
       title = new javax.swing.JLabel();
       mainPanel = new javax.swing.JPanel();
       mainTextLabel = new javax.swing.JLabel();
       name = new javax.swing.JLabel();
       symbol = new javax.swing.JLabel();
       price = new javax.swing.JLabel();
       nameText = new javax.swing.JTextField();
       symText = new javax.swing.JTextField();
       priceText = new javax.swing.JTextField();
       startBidButton = new javax.swing.JButton();
       confirmButton = new javax.swing.JButton();
       quitButton = new javax.swing.JButton();
       nextButton = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

       titleBar.setBackground(new java.awt.Color(153, 153, 153));

       title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
       title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       title.setText("CLIENT");

       javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
       titleBar.setLayout(titleBarLayout);
       titleBarLayout.setHorizontalGroup(
           titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(titleBarLayout.createSequentialGroup()
               .addGap(176, 176, 176)
               .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );
       titleBarLayout.setVerticalGroup(
           titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(titleBarLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(21, Short.MAX_VALUE))
       );

       mainPanel.setBackground(new java.awt.Color(38, 67, 112));

       mainTextLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       mainTextLabel.setForeground(new java.awt.Color(173, 181, 29));
       mainTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       mainTextLabel.setText("<html>Welcome to the Auction Server ! <br>Press START BID to start the procedure <br> Press QUIT to exit from the server anytime");

       name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       name.setForeground(new java.awt.Color(255, 255, 255));
       name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       name.setText("NAME");

       symbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       symbol.setForeground(new java.awt.Color(255, 255, 255));
       symbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       symbol.setText("SYMBOL");

       price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       price.setForeground(new java.awt.Color(255, 255, 255));
       price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       price.setText("PRICE");

       nameText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
       nameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	   nameText.setEnabled(false);       

       symText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
       symText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
       symText.setEnabled(false);

       priceText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
       priceText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
       priceText.setEnabled(false);

       startBidButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       startBidButton.setText("START BID");

       confirmButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       confirmButton.setText("CONFIRM");
       confirmButton.setEnabled(false);

       quitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       quitButton.setText("QUIT");

       nextButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       nextButton.setText("NEXT");

       javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
       mainPanel.setLayout(mainPanelLayout);
       mainPanelLayout.setHorizontalGroup(
           mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(mainPanelLayout.createSequentialGroup()
               .addContainerGap()
               .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(mainTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addGroup(mainPanelLayout.createSequentialGroup()
                       .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                               .addGroup(mainPanelLayout.createSequentialGroup()
                                   .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addGap(18, 18, 18)
                                   .addComponent(priceText))
                               .addGroup(mainPanelLayout.createSequentialGroup()
                                   .addComponent(symbol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addGap(18, 18, 18)
                                   .addComponent(symText))
                               .addGroup(mainPanelLayout.createSequentialGroup()
                                   .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addGap(18, 18, 18)
                                   .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                           .addGroup(mainPanelLayout.createSequentialGroup()
                               .addGap(245, 245, 245)
                               .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                       .addGap(83, 83, 83)
                       .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(startBidButton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                           .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                       .addGap(0, 23, Short.MAX_VALUE)))
               .addContainerGap())
       );
       mainPanelLayout.setVerticalGroup(
           mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(mainPanelLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(mainTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(32, 32, 32)
               .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(startBidButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(46, 46, 46)
               .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addComponent(symbol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(symText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGap(35, 35, 35)
               .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(18, 18, 18)
               .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(26, Short.MAX_VALUE))
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
       setLocationRelativeTo(null);
   }

	
	public JLabel getMainText(){
		return mainTextLabel;
	}
	
	public JTextField getNameText(){
		return nameText;
	}
	
	public JTextField getSymText(){
		return symText;
	}
	
	public JTextField getPriceText(){
		return priceText;
	}
	
	public JButton getStartBidButton(){
		return startBidButton;
	}
	
	public JButton getConfirmButton(){
		return confirmButton;
	}
	
	public JButton getQuitButton(){
		return quitButton;
	}
	
	public JButton getNextButton() {
		return nextButton;
	}
                     
}