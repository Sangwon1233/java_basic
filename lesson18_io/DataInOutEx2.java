package lesson18_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class DataInOutEx2 {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("원주율2.txt"));//원주율 파일 만들거다 //보조 스트림
		dos.writeInt(1);
		
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("원주율2.txt"));
		double d =dis.readInt();
		System.out.println(d);
		
		dis.close();
	}

}
