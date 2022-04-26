package scartchPad;

class A4{
	double averageScore(int... values) {
		double sum = 0;
		for(int x:values) {
			sum+=x;
		}
		return sum/values.length;
	}
}

public class Ch6_P4 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A4 a = new A4();
		
		double a1=a.averageScore(1);
		double a2=a.averageScore(1,2);
		double a3=a.averageScore(1,2,3);
		double a4=a.averageScore(1,2,3,4);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
	}

}
