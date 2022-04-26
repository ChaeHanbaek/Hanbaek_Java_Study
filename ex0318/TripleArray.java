package ex0318;
//3중 for each문 실험
public class TripleArray {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int AAA[][][]= {{{1,2},{3,4}},{{5,6},{7,8}}};
		for(int [][] x:AAA) {
			for(int [] y:x) {
				for(int z:y) {
					System.out.println(z+" 확인22");
				}
				System.out.println("확인11");
			}
			System.out.println("확인00");
		}
	}

}
