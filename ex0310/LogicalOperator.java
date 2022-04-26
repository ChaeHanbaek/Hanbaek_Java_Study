package ex0310;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
	//비교연산
		System.out.println('a'>'b'); //'a'의 순서가 'b'보다 먼저이므로 거짓
		System.out.println(3>=2); // 3은 2 이상이므로 참
		System.out.println(-1<0); // -1은 0보다 작으므로 참
		System.out.println(3.45<=2); // 3.45는 2이상이므로 거짓
		System.out.println(3==2); // 3과 2는 같지 않으므로 거짓
		System.out.println(3!=2); // 3과 2는 같지 않으므로 참
		System.out.println(!(3!=2)); // 3과 2는 같지 않으므로 참인데 !()로 반전
		
		//비교 연산과 논리 연산 복합
		System.out.println((3>2)&&(3>4)); // && and 둘다 참이어야 참값
//		System.out.println((3!=2)||(-1>0)); // || or 둘 중 하나만 참이어도 참값
		//경고코드 이유 or: 앞부분이 참이어서 이미 참값 조건 충족해서 뒤의값을 안써서 노란 에러 뜨는거
		System.out.println((-1>0)||(3!=2)); // 따라서 이경우는 에러메시지가 안뜬다.
		System.out.println((3!=2)^(-1>0)); // ^ xor 두 값이 서로 달라야 참값
	}

}
