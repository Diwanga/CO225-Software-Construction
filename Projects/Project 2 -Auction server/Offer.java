import java.util.Date;

/*
    Model class to set data of stocks
*/

public class Offer {
    private String clientName;
    private String symbol;
    private Date date;
    private double price;

    // Constructor
    public Offer(String clientName, String symbol, Date date, double price) {
        this.clientName = clientName;
        this.symbol = symbol;
        this.date = date;
        this.price = price;
    }

    // Getters and setters
    public String getClientName() {
        return clientName;
    }

    public String getSymbol() {
        return symbol;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
        
}
