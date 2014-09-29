package demosokect;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) {
		try {
			//while(true){
			Socket client = new Socket("localhost",3030);
			InputStream in = client.getInputStream();
			in = client.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String str = dis.readUTF();
			System.out.println(str);
			//System.out.println("你好,客户端@@!!");
			OutputStream out = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("你好,客户端1111!");
			//}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
