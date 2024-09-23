package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		//EDF: End Of File
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt"); //외부에 입력 받아오기
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사.txt");//외부에 입력 내보내기 
		int i = 0;
		int cnt =0;//카운터하기
		while((i=fis.read())!= -1){
			cnt++;
			System.out.println((char)i + ":" + i);//문자로 바꿈 아스키코드로 보여줘
			fos.write(i);
				
		}
		System.out.println(cnt + "bytes");
		
		fis.close();
		fos.close();//
	}

}
