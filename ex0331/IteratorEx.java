package ex0331;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		//Iterator 사용
		Iterator <Integer> it = v.iterator();
		
		while (it.hasNext()){ //it.hasnext() it이라는 Iterator 객체에 호출 안한 값이 있는 한 true
			int n = it.next(); //다음 값을 호출한다.
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " +sum);
		
	}

}
