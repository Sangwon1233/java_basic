package lesson17_thread;

public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
//		c.incre();
//		System.out.println(c.i);
		T t1 = new T(c);
		T t2 = new T(c);//같은 객체들
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.i);
	}

}
class Counter{
	int i;
	void incre() {
		synchronized (this) { //멀티스레드를 사용하는데 필요한 선언
			for(int i = 0 ; i<100000;i++){
				this.i++;
			
			}
	
		}
		
	}
}

class T extends Thread{
	Counter c;
	T(Counter c){
		this.c =c;
	}
	public void run() {
		c.incre();
	}
}
