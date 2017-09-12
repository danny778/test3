import java.io.IOException;
import java.net.Socket;

public class Main {

	public static final String SERVER_IP = "162.218.48.12";
	public static final int SERVER_PORT = 80;

	public static boolean hostAvailabilityCheck() {
		try (Socket s = new Socket(SERVER_IP, SERVER_PORT)) {
			s.setTcpNoDelay(true);
			return true;
		} catch (IOException ex) {
			/* ignore */
		}
		return false;
	}

	public static void main(String[] args) {
		if (hostAvailabilityCheck()) {
			System.out.println("Online!");
		} else {
			System.out.println("Offline!");
		}

	}
}
