package ex0311;
import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int intArray[]=new int[5];
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length+"개의 정수를 입력하세요 >> ");
		for(int i=0; i<intArray.length;i++) {
			intArray[i]=scanner.nextInt();
		}
		for(int i=0;i<intArray.length;i++) {
			sum+=intArray[i];
		}
		System.out.print("평군은 "+(double)sum/intArray.length);
		scanner.close();
	}

}
