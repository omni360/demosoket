package demosokect;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver2 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(3030);
			while(true){
				Socket client = server.accept();
				System.out.println("连接成功");
				OutputStream out = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("你好,服务器!");
				InputStream in = client.getInputStream();
				in = client.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				String str = dis.readUTF();
				System.out.println(str);	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
