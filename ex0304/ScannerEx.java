package ex0304;
import java.util.Scanner; //Scanner 도구를 자바 유틸에서 가져옴

public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부(true or false)를 빈칸으로 분리하여 입력하세요.");
		//스캐너 클래스는 사용자 입력받기 전에 선언하면 됨, 위아랫줄 바뀌어도 상관없음
		Scanner scanner= new Scanner(System.in); // 스캐너 클래스를 생성 선언
		
		String name = scanner.next(); // 문자열은 별도의 변환이 필요없음
		System.out.print("이름은 "+name+", ");
		
		String city =scanner.next();
		System.out.print("도시는 "+city+", ");
		
		int age = scanner.nextInt(); // 정수는 nextInt()로 변환해야함
		System.out.print("나이는 "+age+", ");
		
		double weight = scanner.nextDouble(); // 실수는 nextDouble()로 변환
		System.out.print("체중은 "+weight+"kg, ");
		
		boolean single = scanner.nextBoolean(); // true or false는 nextBoolean()으로 변환
		System.out.println("독신 여부는 "+single+"입니다.");
		
		scanner.close(); // Scanner 닫기, 종료선언 안해도 실행은 가능 왜냐하면 가비지 컬렉터가 알아서 처리해줌
	}
}
