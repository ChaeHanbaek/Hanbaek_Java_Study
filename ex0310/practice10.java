package ex0310;
/* 숫자를 입력받아 3~5는 "봄", 6~8은 "여름, 9~11은 "가을", 12,1,2의 경우 "겨울"을, 
 * 그외 숫자를 입력한 경우 "잘못 입력하였습니다"을 출력하는 프로그램을 작성하시오.
 * 달을 입력하세요.(1~12) : 9
 * 가을
 */
import java.util.Scanner;
public class practice10 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
	Scanner scanner = new Scanner(System.in);
	System.out.print("달을 입력하세요.(1~12) : ");
	int month = scanner.nextInt();
	String season="잘못 입력하였습니다.";
	//컴파일러가 선언하고 초기화 안된 쓰레기값이 존재하면 감지해서 에러가 남
	switch (month) {
	case 3: case 4: case 5:
		season="봄";
		break;
	case 6: case 7: case 8:
		season="여름";
		break;
	case 9: case 10: case 11:
		season="가을";
		break;
	case 12: case 1: case 2:
		season="겨울";
		break;
	default:
		break;
	}
	System.out.println(season);
	scanner.close();
}
}

