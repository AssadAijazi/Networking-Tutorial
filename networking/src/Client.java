import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		String address = "192.168.1.102";
		int port = 5555;
		Socket connection = new Socket();
		try {
			connection.connect(new InetSocketAddress(address, port));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
