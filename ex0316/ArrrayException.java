package ex0316;

public class ArrrayException {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] intArray = new int[5];
		intArray[0]=0;
		try {
			for (int i = 0; i<5; i++) {
				intArray[i+1]=i+1+intArray[i];
				System.out.println("intArray["+i+"] ="+intArray[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어 났습니다.");
		}
	}

}
