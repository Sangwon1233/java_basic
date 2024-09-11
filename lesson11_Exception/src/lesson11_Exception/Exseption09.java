package lesson11_Exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Exseption09 {
		public static void main(String[] args){
			
			try (FileOutputStream fos = new FileOutputStream("1.txt")){
			byte[]bs= {'A','B','C','D','E',234-256, 176-256, 128-256};
			fos.write(bs);
			
			}
			catch(IOException e) {
				e.printStackTrace();
			
		}
	}
}
