import javax.swing.AbstractButton;
import javax.swing.JButton;

/*
    Creates new form ServerGui
*/

public class ServerGui extends javax.swing.JFrame {

    // Variables declaration
    private javax.swing.JLabel FBprice;
    private javax.swing.JLabel FBsecName;
    private javax.swing.JLabel FBsymbol;
    private javax.swing.JLabel GOOGLprice;
    private javax.swing.JLabel GOOGLsecName;
    private javax.swing.JLabel GOOGLsymbol;
    private javax.swing.JLabel MSFTprice;
    private javax.swing.JLabel MSFTsecName;
    private javax.swing.JLabel MSFTsymbol;
    private javax.swing.JLabel TSLAprice;
    private javax.swing.JLabel TSLAsecName;
    private javax.swing.JLabel TSLAsymbol;
    private javax.swing.JLabel TXNprice;
    private javax.swing.JLabel TXNsecName;
    private javax.swing.JLabel TXNsymbol;
    private javax.swing.JLabel VRTUprice;
    private javax.swing.JLabel VRTUsecName;
    private javax.swing.JLabel VRTUsymbol;
    private javax.swing.JLabel XLNXprice;
    private javax.swing.JLabel XLNXsecName;
    private javax.swing.JLabel XLNXsymbol;
    private javax.swing.JLabel YHOOprice;
    private javax.swing.JLabel YHOOsecName;
    private javax.swing.JLabel YHOOsymbol;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton changePriceButton;
    private javax.swing.JPanel eighthRow;
    private javax.swing.JPanel fifthRow;
    private javax.swing.JPanel firstRow;
    private javax.swing.JPanel fourthRow;
    private javax.swing.JPanel headerRow;
    private javax.swing.JLabel price;
    private javax.swing.JPanel secondRow;
    private javax.swing.JLabel securityName;
    private javax.swing.JPanel seventhRow;
    private javax.swing.JButton showButton;
    private javax.swing.JButton showStockButton;
    private javax.swing.JPanel sixthRow;
    private javax.swing.JPanel stockTable;
    private javax.swing.JLabel symbol;
    private javax.swing.JLabel symbolBidHistory;
    private javax.swing.JPanel tableBidHistory;
    private javax.swing.JTable tableBids;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField textSymbolBid;
    private javax.swing.JPanel thirdRow;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleBid;    
    
    public ServerGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        stockTable = new javax.swing.JPanel();
        headerRow = new javax.swing.JPanel();
        symbol = new javax.swing.JLabel();
        securityName = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        firstRow = new javax.swing.JPanel();
        FBsymbol = new javax.swing.JLabel();
        FBsecName = new javax.swing.JLabel();
        FBprice = new javax.swing.JLabel();
        secondRow = new javax.swing.JPanel();
        VRTUsymbol = new javax.swing.JLabel();
        VRTUsecName = new javax.swing.JLabel();
        VRTUprice = new javax.swing.JLabel();
        thirdRow = new javax.swing.JPanel();
        MSFTsymbol = new javax.swing.JLabel();
        MSFTsecName = new javax.swing.JLabel();
        MSFTprice = new javax.swing.JLabel();
        fourthRow = new javax.swing.JPanel();
        GOOGLsymbol = new javax.swing.JLabel();
        GOOGLsecName = new javax.swing.JLabel();
        GOOGLprice = new javax.swing.JLabel();
        fifthRow = new javax.swing.JPanel();
        YHOOsymbol = new javax.swing.JLabel();
        YHOOsecName = new javax.swing.JLabel();
        YHOOprice = new javax.swing.JLabel();
        sixthRow = new javax.swing.JPanel();
        XLNXsymbol = new javax.swing.JLabel();
        XLNXsecName = new javax.swing.JLabel();
        XLNXprice = new javax.swing.JLabel();
        seventhRow = new javax.swing.JPanel();
        TSLAsymbol = new javax.swing.JLabel();
        TSLAsecName = new javax.swing.JLabel();
        TSLAprice = new javax.swing.JLabel();
        eighthRow = new javax.swing.JPanel();
        TXNsymbol = new javax.swing.JLabel();
        TXNsecName = new javax.swing.JLabel();
        TXNprice = new javax.swing.JLabel();
        tableBidHistory = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        tableBids = new javax.swing.JTable();
        buttons = new javax.swing.JPanel();
        changePriceButton = new javax.swing.JButton();
        showStockButton = new javax.swing.JButton();
        titleBid = new javax.swing.JLabel();
        symbolBidHistory = new javax.swing.JLabel();
        showButton = new javax.swing.JButton();
        textSymbolBid = new javax.swing.JTextField();
        titleBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stockTable.setBackground(new java.awt.Color(33, 55, 97));
        stockTable.setLayout(new java.awt.GridLayout(9, 1, 1, 1));

        headerRow.setBackground(new java.awt.Color(153, 153, 255));

        symbol.setBackground(new java.awt.Color(255, 255, 255));
        symbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        symbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symbol.setText("Symbol");
        symbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        securityName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        securityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        securityName.setText("Security Name");
        securityName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price.setText("Price");
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout headerRowLayout = new javax.swing.GroupLayout(headerRow);
        headerRow.setLayout(headerRowLayout);
        headerRowLayout.setHorizontalGroup(
            headerRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerRowLayout.createSequentialGroup()
                .addComponent(symbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(securityName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        headerRowLayout.setVerticalGroup(
            headerRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(symbol, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(securityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(headerRow);

        FBsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FBsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FBsymbol.setText("FB");
        FBsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FBsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FBsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FBsecName.setText("Facebook");
        FBsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FBprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FBprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FBprice.setText("100");
        FBprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout firstRowLayout = new javax.swing.GroupLayout(firstRow);
        firstRow.setLayout(firstRowLayout);
        firstRowLayout.setHorizontalGroup(
            firstRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstRowLayout.createSequentialGroup()
                .addComponent(FBsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FBsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FBprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );
        firstRowLayout.setVerticalGroup(
            firstRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FBsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(FBsecName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FBprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(firstRow);

        VRTUsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        VRTUsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VRTUsymbol.setText("VRTU");
        VRTUsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        VRTUsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        VRTUsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VRTUsecName.setText("Virtusa Corporation - common stock");
        VRTUsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        VRTUprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        VRTUprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VRTUprice.setText("100");
        VRTUprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout secondRowLayout = new javax.swing.GroupLayout(secondRow);
        secondRow.setLayout(secondRowLayout);
        secondRowLayout.setHorizontalGroup(
            secondRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondRowLayout.createSequentialGroup()
                .addComponent(VRTUsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(VRTUsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(VRTUprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );
        secondRowLayout.setVerticalGroup(
            secondRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VRTUsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VRTUsecName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(VRTUprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(secondRow);

        MSFTsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MSFTsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MSFTsymbol.setText("MSFT");
        MSFTsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MSFTsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MSFTsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MSFTsecName.setText("Microsoft Corporation - Common Stock");
        MSFTsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MSFTprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MSFTprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MSFTprice.setText("100");
        MSFTprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout thirdRowLayout = new javax.swing.GroupLayout(thirdRow);
        thirdRow.setLayout(thirdRowLayout);
        thirdRowLayout.setHorizontalGroup(
            thirdRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdRowLayout.createSequentialGroup()
                .addComponent(MSFTsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MSFTsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MSFTprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );
        thirdRowLayout.setVerticalGroup(
            thirdRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MSFTsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MSFTsecName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(MSFTprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(thirdRow);

        GOOGLsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GOOGLsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GOOGLsymbol.setText("GOOGL");
        GOOGLsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GOOGLsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GOOGLsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GOOGLsecName.setText("Google Inc. - Class A Common Stock");
        GOOGLsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GOOGLprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GOOGLprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GOOGLprice.setText("100");
        GOOGLprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout fourthRowLayout = new javax.swing.GroupLayout(fourthRow);
        fourthRow.setLayout(fourthRowLayout);
        fourthRowLayout.setHorizontalGroup(
            fourthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fourthRowLayout.createSequentialGroup()
                .addComponent(GOOGLsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(GOOGLsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(GOOGLprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        fourthRowLayout.setVerticalGroup(
            fourthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GOOGLsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GOOGLsecName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(GOOGLprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(fourthRow);

        YHOOsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        YHOOsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YHOOsymbol.setText("YHOO");
        YHOOsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YHOOsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        YHOOsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YHOOsecName.setText("Yahoo! Inc. - Common Stock");
        YHOOsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YHOOprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        YHOOprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YHOOprice.setText("100");
        YHOOprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout fifthRowLayout = new javax.swing.GroupLayout(fifthRow);
        fifthRow.setLayout(fifthRowLayout);
        fifthRowLayout.setHorizontalGroup(
            fifthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fifthRowLayout.createSequentialGroup()
                .addComponent(YHOOsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(YHOOsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(YHOOprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        fifthRowLayout.setVerticalGroup(
            fifthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(YHOOsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(YHOOsecName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(YHOOprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(fifthRow);

        XLNXsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        XLNXsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XLNXsymbol.setText("XLNX");
        XLNXsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        XLNXsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        XLNXsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XLNXsecName.setText("Xilinx");
        XLNXsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        XLNXprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        XLNXprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XLNXprice.setText("100");
        XLNXprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout sixthRowLayout = new javax.swing.GroupLayout(sixthRow);
        sixthRow.setLayout(sixthRowLayout);
        sixthRowLayout.setHorizontalGroup(
            sixthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sixthRowLayout.createSequentialGroup()
                .addComponent(XLNXsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(XLNXsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(XLNXprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sixthRowLayout.setVerticalGroup(
            sixthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XLNXsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(XLNXsecName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(XLNXprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(sixthRow);

        TSLAsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TSLAsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TSLAsymbol.setText("TSLA");
        TSLAsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TSLAsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TSLAsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TSLAsecName.setText("Tesla Motors");
        TSLAsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TSLAprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TSLAprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TSLAprice.setText("100");
        TSLAprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout seventhRowLayout = new javax.swing.GroupLayout(seventhRow);
        seventhRow.setLayout(seventhRowLayout);
        seventhRowLayout.setHorizontalGroup(
            seventhRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seventhRowLayout.createSequentialGroup()
                .addComponent(TSLAsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TSLAsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TSLAprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        seventhRowLayout.setVerticalGroup(
            seventhRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TSLAsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TSLAsecName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(TSLAprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(seventhRow);

        TXNsymbol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TXNsymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXNsymbol.setText("TXN");
        TXNsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TXNsecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TXNsecName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXNsecName.setText("Texas Instruments Incorporated - Common Stock");
        TXNsecName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TXNprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TXNprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXNprice.setText("100");
        TXNprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout eighthRowLayout = new javax.swing.GroupLayout(eighthRow);
        eighthRow.setLayout(eighthRowLayout);
        eighthRowLayout.setHorizontalGroup(
            eighthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eighthRowLayout.createSequentialGroup()
                .addComponent(TXNsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TXNsecName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TXNprice, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );
        eighthRowLayout.setVerticalGroup(
            eighthRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXNsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TXNsecName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(TXNprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stockTable.add(eighthRow);

        tableBidHistory.setBackground(new java.awt.Color(235, 64, 52));

        tableScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableScrollPane.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        tableBids.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tableBids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client Name", "Symbol", "Price", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(tableBids);

        javax.swing.GroupLayout tableBidHistoryLayout = new javax.swing.GroupLayout(tableBidHistory);
        tableBidHistory.setLayout(tableBidHistoryLayout);
        tableBidHistoryLayout.setHorizontalGroup(
            tableBidHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane)
        );
        tableBidHistoryLayout.setVerticalGroup(
            tableBidHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane)
        );

        buttons.setBackground(new java.awt.Color(93, 107, 92));

        changePriceButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        changePriceButton.setText("CHANGE PRICE");

        showStockButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        showStockButton.setText("SHOW STOCK");

        titleBid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleBid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleBid.setText("BID HISTORY");

        symbolBidHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        symbolBidHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symbolBidHistory.setText("SYMBOL        :");

        showButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        showButton.setText("SHOW");

        textSymbolBid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(changePriceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showStockButton)
                .addGap(97, 97, 97))
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(symbolBidHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(textSymbolBid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(titleBid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(showButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showStockButton)
                    .addComponent(changePriceButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleBid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symbolBidHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSymbolBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleBar.setBackground(new java.awt.Color(7, 40, 64));
        titleBar.setToolTipText("");

        title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("STOCK EXCHANGE - AUCTION SERVER");

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(stockTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(tableBidHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stockTable, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tableBidHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }

    
    public javax.swing.JButton getShowButton() {
		return showButton;
    }
    
    public javax.swing.JButton getChangePriceButton() {
		return changePriceButton;
    }
    
    public javax.swing.JButton getShowStockButton() {
		return showStockButton;
    }
    
	public javax.swing.JLabel getFBprice() {
		return FBprice;
	}

	public javax.swing.JLabel getGOOGLprice() {
		return GOOGLprice;
	}

	public javax.swing.JLabel getMSFTprice() {
		return MSFTprice;
	}

	public javax.swing.JLabel getTSLAprice() {
		return TSLAprice;
	}

	public javax.swing.JLabel getTXNprice() {
		return TXNprice;
	}

	public javax.swing.JLabel getVRTUprice() {
		return VRTUprice;
	}

	public javax.swing.JLabel getXLNXprice() {
		return XLNXprice;
	}

	public javax.swing.JLabel getYHOOprice() {
		return YHOOprice;
	}


    public javax.swing.JTable getTableBids() {
		return tableBids;
    }
    
    public javax.swing.JTextField getTextSymbolBid() {
        return textSymbolBid;
    }
    
}