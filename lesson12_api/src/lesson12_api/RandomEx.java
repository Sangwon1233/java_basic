package lesson12_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		//Random random = new Random(0);//시드값 시드설정하면 시드값에 의해 계속 랜덤 패턴이 같음
		Random random = new Random(System.currentTimeMillis());//시간을 기반으로한 시드값은 같을수 없음
		for(int i=0;i<20;i++) {
//		System.out.println(random.nextInt(6)+1); 
		System.out.println(random.nextInt());
		
		}
	}

}
