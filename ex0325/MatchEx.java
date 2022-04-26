package ex0325;

public class MatchEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double a=Math.PI;
		System.out.println(Math.PI); //원주율값 3.141592653589793
		System.out.println(Math.ceil(a)); //소수점 올림
		System.out.println(Math.floor(a)); //소수점 내림
		System.out.println(Math.sqrt(9)); //제곱근
		System.out.println(Math.exp(2)); //e의 2승
		System.out.println(Math.round(3.14)); //소수점 반올림
		
		System.out.println("이번주 행운의 번호는 ");
		for(int i=0;i<5;i++) {
			System.out.print((int)(Math.random()*45+1)+" ");
		}
			
	}

}
