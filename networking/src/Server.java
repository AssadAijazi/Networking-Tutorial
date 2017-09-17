import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 5555;
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server Starting...");
			Socket connect = server.accept();
			System.out.println("Client connected");
			server.close();
			connect.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
