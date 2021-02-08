import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;


public class Connection implements Runnable{
    private Socket connectionSocket;
    
    public Connection(Socket connectionSocket) {
        this.connectionSocket = connectionSocket;
    }

    @Override
    public void run() {
        try {
            handle();
        } catch (IOException ex) {
        }
    }

    public void startThread(){
        Thread thread = new Thread(this);
        thread.start();
    }
    
    
    private void handle() throws IOException{ 
	
	try {
            new ClientCon(connectionSocket);
            connectionSocket.close();
                       
        } catch (IOException iOException) {
            this.connectionSocket.close();
        }
    }

	
    
    
}
