package ex0318;

class ArrayEX {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int A1[]= {1,56,12,2314,1234,12};
		for (int m:A1) {
			System.out.println(m);
		}
		
		int BB[][]= {{11,22},{33,44}};
		for (int n:BB[0]) {
			System.out.println(n);
		}
		for (int i=0;i<BB.length;i++) {
			for (int k:BB[i]) {
				System.out.println(k);
			}
		}

	}

}
