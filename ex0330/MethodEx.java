package ex0330;
//Ex06에서 만들었던 메서드 모아둠
class ArrayMethod{
	ArrayMethod() {
	}
	public void Arrayprint(int A[]) { //1차원 배열 출력
		for(int x:A) {
			System.out.print(x+"\t");
		}
		System.out.println();
	}
	public int[] InsertArray(int x, int i,int A[]) {
		//x를 A배열의 index i위치에 넣을때 사용할 메소드 //i보다 작은 배열은 그대로 x는 i에 들어가고 그뒤 값들의 index는 1씩증가한다. 
		//작동 확인 // 마지막자리에 오도록 하면 에러 발생해서 고치는데 시간 오래걸림
		int B[] = new int[A.length+1];
		for(int k=0;k<A.length;k++) {
			if(i==A.length) {
				B[i]=x;
			}
			if(k<i) {
				B[k]=A[k];
			}
			else if(k==i) {
				B[k]=x;
				B[k+1]=A[k];
			}
			else if(k>i) {
				B[k+1]=A[k];
			}

		}
		return B;
	} 
	public void InsertIndex(int x, int i,int A[]) {//배열 A의 인덱스 i위치에 x를 넣고 그뒤에 있는 값의 인덱스를 하나씩 밀어내는 메소드
		int B[]=new int[A.length];
		for(int k=0;k<A.length;k++) {
			if(k<i) {
				B[k]=A[k];
			}
			else if(k==i) {
				B[k]=x;
				if(k<A.length-1) {//마지막 숫자가 가장 클때 에러방지
					B[k+1]=A[k];
				}
			}

			else if(k>i&&k<A.length-1) { //이렇게 해야 인덱스 i+1부터 A.length-2까지 값이 들어감
				B[k+1]=A[k];
			}
		}
	
		for(int n=0;n<A.length;n++) { //로컬 배열이라 그런지 A=B;식으로 하면 값을 못넘겨받음
			A[n]=B[n];
		}
	} 
}

public class MethodEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}

}
