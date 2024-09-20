package lesson14_generic;

public class GenericEx5 {
	public static void main(String[] args) {
		Gen3 g3 = new Gen3();
		Generic5<? super Gen2> g2 = new Generic5<>(new Object());//여기서 맨뒤 ()는 아무거나 올수있음 얘가 뭘 받는지 앞에 제네릭에서 결정
//		Gen2 t1 = g2.getT();
//		Gen3 t1 = g2.getT();
		Gen1 t2 = (Gen3)g2.getT();
		Object t1 = g2.getT();
		System.out.println(t2.getName());
		
		Generic5<? extends Gen2>g4 =new Generic5<>(g3);//gen2거나 그보다 더 높은거만 가능
		Gen2 t3 = g4.getT();
		Gen3 t4 = (Gen3)g4.getT();
		
		Generic5<?> g6 = new Generic5<>(g3);//여기서 ?는 어떤것이든 올수잇다 이뜻은 odject
		Object t5 = g6.getT();
		Gen3 t6 = (Gen3)g6.getT();
		
		Generic5<?> g7 = new Generic5<>(1);
		System.out.println(g7.getT());
		
		
		
	}

}

class Gen1{
	String getName() {
		return getClass().getSimpleName();
		
	}
}
class Gen2 extends Gen1{}
class Gen3 extends Gen2{}
class Generic5<T>{
	T t;
	public Generic5(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public void serT(T t) {
		this.t = t;
	}
}