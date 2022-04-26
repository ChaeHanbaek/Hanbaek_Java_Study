package ex0317;
//0넣을 공간 6개 찾는게 아니라 16자리에서 10개찾아서 임의 값넣기
public class Practive07변형 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int matrix[][]=new int[4][4];
		int random[]= new int[16];
		
		//1~16사이 10개값 중복없이 찾기
		int sort[]=new int[10];
		boolean jb;
		int s_count=0;
		while(s_count<10) {
			jb = false;
			//int x = (int)(Math.random()*15); //0~0.9999값을 가지는걸 곱해서 사용하는 방식이기때문에 그대로 사용하면 0이 나올 확률이 너무 낮아짐.
			int x =(int)Math.floor(Math.random()*16);
			for(int j=0;j<s_count;j++) { //j<10으로 설정해놓으면 0값이 나와도 중복체크에서 걸려서 안나오는 문제점이 있었음 10을 s_count로 바꿔 해결
				if (x==sort[j]) {
					jb = true;	
					break;
				}
			}
			if(jb==false) {				
				sort[s_count]=x; 
				s_count +=1;

			}			
		}
		
		// 10개값을 인덱스로 써서 random배열값 1~10사이 임의의 수로 바꾸기
		for(int z=0;z<10;z++) {
			random[sort[z]]=(int)(Math.random()*10+1);
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
