package lesson13_collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		//2. 혹은 Comparator(인터페이스)를 별도로 지정 
		Set<Integer> set =new TreeSet<>((i1,i2) -> i2-i1); //람다식으로 내림차순으로 바꿈
		set.add(100);
		set.add(99);
		set.add(7);
		set.add(13);
		set.add(15);
		
		System.out.println(set);
		
		Set<Object> set2 =new TreeSet<>();
		set2.add("홍길동");
		set2.add("고길동");
		set2.add("새똥이");
		set2.add("길동이");
		System.out.println(set2);
		
		Set<Member> members = new TreeSet<>(new Comparator<Member>() {//comparator의 비교대상이 Member

			@Override
			public int compare(Member o1, Member o2) {//비교대상
				// TODO Auto-generated method stub
				return o1.age-o2.age;//오름차순(전자에서 후자를 뺸 것)
			}
			
		});
		members.add(new Member("홍길동", 40));//나이 값이 달라서 서로 다른 객체
		members.add(new Member("홍길동", 30));
		members.add(new Member("홍길동", 20));
		members.add(new Member("홍길동", 35));
		
		System.out.println(members);
		
		//TreeSet에 저장된 자료를 만족할 조건
		
		
		//1.Comparable 인터페이스를 구현한 객체
		members = new TreeSet<>((o1,o2)-> o1.name.compareTo(o2.name)); //덮어쓰고싶으면 컨페어을 추가
		members.add(new Member("홍길동", 40));
		members.add(new Member("고길동", 40));
		members.add(new Member("김길동", 40));
		members.add(new Member("새길동", 40));
		
		System.out.println(members);
		
		
	}

}
