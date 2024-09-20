package lesson14_generic;

public class GenericEx {
	public static void main(String[] args) {
	Box<Integer,String,Object> box =new Box<>();//리스트 처럼 
	box.setItem(10);
	
	int result = (Integer)box.getItem();
	System.out.println(result);
	}

}
class Box<T,R,V>{ //제네릭 타입,선언한 만큼 위에 호출해야함
	private T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
	
}
