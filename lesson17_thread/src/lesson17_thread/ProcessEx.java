package lesson17_thread;

import java.io.IOException;

public class ProcessEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p1 = Runtime.getRuntime().exec("notepad");//메모장
		Process p2 = Runtime.getRuntime().exec("mspaint");//그림판
		
		p1.waitFor();//p1의 수행이 끝날때까지 기다림
		p2.destroy();//p1의 프로세스가 종료되면 실행
		
		// 
	}

}
