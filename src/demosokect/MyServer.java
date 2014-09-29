package demosokect;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class MyServer {

	public static void main(String[] args){
	try {
		ServerSocket server = new ServerSocket(8800);
		Socket clinet = server.accept();
		System.out.println("连接成功!!!");
	} catch (Exception e) {
		e.printStackTrace();
	}	


		


	}

}
