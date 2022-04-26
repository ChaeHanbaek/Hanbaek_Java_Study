package ex0310;
import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //in으로 scanner 클래스 만듬

		System.out.print("수를 입력하시오: ");
		int number = in.nextInt();
		
		if (number %3==0) 
			System.out.println("3의 배수입니다.");
		else 
			System.out.println("3의 배수가 아닙니다.");
			
	in.close(); // 닫을때도 불러온 이름으로 닫아야함
	}
}
