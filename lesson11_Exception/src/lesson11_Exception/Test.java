package lesson11_Exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test {
		public static void main(String[] args){
			
			
			FileOutputStream fos = null;
			System.out.println(Arrays.toString("가".getBytes()));//3바이트 크기가 나옴
			try {
			fos = new FileOutputStream("1.txt");
			byte[]bs= {'A','B','C','D','E',234-256, 176-256, 128-256}; 
			fos.write(bs);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					fos.close();//부하가 끝 애들은 close 사용이 끝났다를 사용해야한다
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
