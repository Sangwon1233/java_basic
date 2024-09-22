package lesson07_oop;

import java.util.Arrays;

public class MyStack {
	private int[] items = new int[3];//12칸이 좋음
	private int cnt;
	
	
	int pop() {	
		
		return items[--cnt];//10,30,40 일때 20은 2번쨰 인덱스는 1번쨰라 감소후 감소해서 --cnt임
		}
	void push(int item) {
		if(items.length == cnt) {
			items=Arrays.copyOf(items,items.length*2);
			//begin번째 인덱스를 뺀다 그리고 1증가
			//cnt값이 begin값을 넘으면 에러가 나오게
		}
		items[cnt++] = item;
		
	}
	int size() {
		//System.err.println(Arrays.toString(items));
		return cnt;
	}
}
