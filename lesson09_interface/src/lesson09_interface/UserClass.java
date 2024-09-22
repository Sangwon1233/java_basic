package lesson09_interface;

@UserAnno(value = "hey") //어노테이션에 기본 필드 이름은 벨류
public class UserClass { 
	@UserAnno("hi")
	void m() {
		
	}
	@UserAnno(value="World",number=10)
	@SuppressWarnings(value = "unused")
	void m2() {
		
	}
	
	@UserAnno(value = {"hey","hi","world"},number=5) //이게 인덱스 2개짜리 배열
	int i;
	
}
