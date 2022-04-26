package ex0311;
import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		int intArray[]=new int[5]; //참조변수 선언, 배열 생성, 주소값 넘겨주기
		int max=0;
		System.out.print("양수 다섯 개를 입력하시오. : ");
		for (int i =0;i<5;i++) {
			intArray[i]=scanner.nextInt(); // 입력받은 정수를 배열에 저장
			if(intArray[i]>max) { //intArray[i]가 현재 가장 큰수보다 크면 max를 그값으로 변경
				max=intArray[i];
			}
		}
		System.out.print("입력된 가장 큰 수는 "+max+"입니다.");
		scanner.close();
	}

}
