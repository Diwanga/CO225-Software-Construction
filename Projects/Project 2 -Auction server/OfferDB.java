import java.util.ArrayList;

/*
    Maintain details of the offers made by clients
*/

public class OfferDB {
    private static ArrayList<Offer> offerList;
    
    public OfferDB() {
        offerList = new ArrayList<Offer>(); 
    }
    
    // Add offer details to databases and show in a table
    public static void addOffer(Offer offer){
        offerList.add(offer);
        ServerGuiController.addDetailsToTable(offer);
    }

    // Get the database of offers made
    public static ArrayList<Offer> getOfferList() {
        return offerList;
    }
    
    public static boolean checkName(String name, ArrayList<Offer> a) {
    	boolean check = false;
		for(Offer i : a){
			if(name.equals(i.getClientName())){
				check = true;
			}
		}
		return check;
    }
}
