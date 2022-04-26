package ex0311;
import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		while(true){
			System.out.print(">>");
			String text = scanner.nextLine(); //String 클래스가 text에 상속됨
			if(text.equals("exit")) { //상속받은 equals메소드를 text에 사용
				break;
			} //if문은 break영향 안받음, break에 영향받는 다음 {}블럭에 영향줌
		}
		System.out.println("종료합니다.");
		scanner.close();
		
	}
}
