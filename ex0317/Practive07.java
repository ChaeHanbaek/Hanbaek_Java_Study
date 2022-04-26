package ex0317;
/* 4X4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 삽입하라. 동일한 정수 상관없다.
 * 나머지 6개의 숫자는 모두 0, 만들어진 2차원 배열을 화면에 출력하시오.
 * 5 0 8 6
 * 0 7 9 5 
 * 2 4 0 8
 * 0 0 0 8
 * 힌트" 1에서 10까지 범위의 정수를 랜덤하게 생성할 때 다음 코드를 활용하시오.
 * int x = (int)(Math.random()*10+1);
 */
public class Practive07 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int matrix[][]=new int[4][4];
		int random[]= new int[16];
		
		//1~10까지 임의의수 16개 뽑기
		for(int i=0;i<16;i++) {
			int x = (int)(Math.random()*10+1);
			random[i]=x;
		}
		
		//1~16사이 6개값 중복없이 찾기
		int zero[]=new int[6];
		boolean jb;
		int z_count=0;
		while(z_count<6) {
			jb = false;
			//int x = (int)(Math.random()*15);//0~0.9999값을 가지는걸 곱해서 사용하는 방식이기때문에 그대로 사용하면 0이 나올 확률이 낮아짐.
			int x =(int)Math.floor(Math.random()*16); //Math.floor()소수점 버림을 이용해서 난수 구하면 위 문제가 좀 해결됨
			for(int j=0;j<z_count;j++) { //j<6값으로 설정해놓으면 0값이 나와도 중복체크에서 벗어나 버리는 문제점이 있었음, 6을 z_count로 바꿔 해결
				if (x==zero[j]) {
					jb = true;	
					break;
				}
			}
			if(jb==false) {
				zero[z_count]=x;
				z_count +=1;
			}			
		}

		// 6개값을 인덱스로 써서 random배열값 0으로 바꾸기
		for(int z=0;z<6;z++) {
			random[zero[z]]=0;
		}
		
		//4x4 배열에 값 넣기
		int m_count=0;
		for(int m=0;m<4;m++) {
			for (int n=0;n<4;n++) {
				matrix[m][n]=random[m_count];
				m_count +=1;
			}
		}
		
		//4x4 배열 출력
		for(int m=0;m<4;m++) {
			for (int n=0;n<4;n++) {
				System.out.print(matrix[m][n]+" ");
			}
			System.out.println();
		}
	}
}
