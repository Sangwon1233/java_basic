package lesson13_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
	
		Set<Object> set = new HashSet<>();
		set.add("가");
		set.add("가"); //add false
		Member member = new Member("홍길동", 40);
		set.add(new Member("홍길동", 40));	
		set.add(member);
		System.out.println(set);
		System.out.println("홍길동".hashCode());
		System.out.println(new String("홍길동").hashCode()); //이름에 가진 헤쉬코드를 가지고 비교를한다 
		
		
	}

}
class Member implements Comparable<Member>{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age); //
//		// TODO Auto-generated method stub
//		return name.hashCode() + age;
		}


	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Member)) {
			return false;
		}
		Member member = (Member)obj;
		return name.equals(member.name) && age == member.age;
	}
	


	
	@Override
	public int compareTo(Member o) { //컴퍼어 투라 파라미터를 한개를 받았음
		return -name.compareTo(o.name);//앞에서 뒤를 뺸거 내림차순
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
}

