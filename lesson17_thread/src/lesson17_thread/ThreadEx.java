package lesson17_thread;

public class ThreadEx extends Thread {
	public static void main(String[] args) {
		
		Thread t1 = new ThreadExtend();
		Thread t2 = new Thread(new RunableImpl());
		
		t2.setPriority(6);//스레드의 우선순위
		
		t1.start();
		t2.start();
		
		
//		new ThreadExtend().start();
//		new Thread(new RunableImpl(),"러너블스레드").start(); //start는 멀티 스레드를 시작하는것 런이라는 메소드를 호출함
		System.out.println("main 종료"+Thread.currentThread().getName());
		
	}
}
class ThreadExtend extends Thread{

	@Override
	public void run() {
		System.out.println("Thread 상속");
		for(int i =0; i <500; i++) {
			System.out.println("Thread 상속"+i + currentThread().getName());//스레드에 이름짓기
		}
	
	}
	
}
class RunableImpl implements Runnable{
	public void run() {
		System.out.println("Runable 구현");
		for(int i= 0; i<500; i++) {
			System.out.println("Runable 구현"+ i +Thread.currentThread().getName());
		}
	}
}

//wait(): 현재 스레드를 대기 상태로 만듭니다. 다른 스레드가 notify() 또는 notifyAll()을 호출할 때까지 대기합니다.
//notify(): 대기 중인 스레드 중 하나를 깨웁니다.
//notifyAll(): 대기 중인 모든 스레드를 깨웁니다.