import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/*
	Server class to make 
*/
public class Server {
	
	public static ArrayList<String> session = new ArrayList<String>();
	public static final int BASE_PORT = 2000;

	public static void main(String[] args) {
		
		StockData stockData = new StockData();				// Create an object to handle all the stocks
		OfferDB offersData = new OfferDB();					// Create an object to handle offers made for the stocks
		ServerGuiController serverController = new ServerGuiController();
		Thread guiThread = new Thread(serverController);	// Parallelize processes of the controller
		guiThread.start();
		
        Server server = new Server();
		try {
            server.loopServer();							// Making connections continuously with the server
        } catch (IOException ex) {
		}
		
	}
	
	
    public void loopServer() throws IOException {

		ServerSocket serverSocket = new ServerSocket(BASE_PORT); 	// Define a socket to connect to server via a port
		while(true) { 
			Socket socket = serverSocket.accept();					// If error must close the socket
			Connection newConnection = new Connection(socket);
			newConnection.startThread();
		}

	}
    
    public static void addSessionUser(String name) {
    	session.add(name);
    }
    public static boolean isSessionExist(String name) {
    	
    	boolean check = false;
		for(String user : session){
			if(name.equals(user)){
				check = true;
			}
		}
		return check;
    }
    public static void deletuser(String name) {
    	Iterator<String> itr = session.iterator();
    	while (itr.hasNext()) { 
    		String user = itr.next();
    		if (name.equals(user) ){ itr.remove(); }
    		
    	}

    	
    }
	
}