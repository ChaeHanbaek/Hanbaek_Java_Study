package ex0331;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		
		//.add()로 정수 삽입
		v.add(5); 
		v.add(4);
		v.add(-1);
		
		//.add()로 특정 인덱스에 값 넣기
		v.add(2,100);
		
		System.out.println("벡터내의 요소 객체 수 : "+v.size());
		System.out.println("벡터의 현재 용량 : "+v.capacity());
		
		//vector의 모든 요소 출력
		for(int i = 0;i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//vector의 모든 정수 더하기
		int sum = 0;
		for(int i = 0; i< v.size();i++) {
			int n = v.elementAt(i); //get과 elemetnAt은 리턴되는 값은 같다. elementAt이 try,catch로 혹시 모를 경우의 예외처리가 되어있다.
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : "+sum);
	}

}
