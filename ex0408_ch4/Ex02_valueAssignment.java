package ex0408_ch4;

public class Ex02_valueAssignment {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//배열에 원소값 대입하기1
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);
		
		//배열에 원소값 대입하기2
		int[] array2;
		array2 = new int[3];
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		System.out.println(array2[0]+" "+array2[1]+" "+array2[2]);
		
		int[] array3 = {3,4,5};
		
		System.out.println(array3[0]+" "+array3[1]+" "+array3[2]);
		
		int[] array4;
		array4 = new int[] {3,4,5};
		
		System.out.println(array4[0]+" "+array4[1]+" "+array4[2]);
		
		//배열의 원소값 대입하기3
		int[] array5 = {3,4,5};
		System.out.println(array5[0]+" "+array5[1]+" "+array5[2]);
		
		/*
		 * int[] array6;
		 * array6 = {3,4,5}; //불가능 배열상수는 초기값에서만 사용 가능
		 */	
		
		
	}

}
