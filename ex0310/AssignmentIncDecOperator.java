package ex0310;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int a=3, b=3, c=3; //변수 3개 선언과 동시에 초기화
		
		//대입 연산자 사례
		a +=3; //a=a+3
		b *=3; //b=b*3
		c %=2; //c=c%2
		System.out.println("a="+a+", b="+b+", c="+c);
		
		int d=3;
		//증감 연산자 사례 / 연산자가 앞에 있으면 연산한 후에 같은 값이되고, 뒤에있으면 같은 값이 되고 연산한다.
		//증감 연산자는 앞에 있는 변수에는 못쓰고 뒤에 있는 변수에만 가능하다. eg)++a=d (불가), a=++d(가능)
		a= d++; //a=3, d=4 / a=d가 되고, d=3+1값이 된다.
		System.out.println("a="+a+", d="+d);
		a= ++d; //d=5, a=5 / d=4+1이 되고, a=d가 된다.  
		System.out.println("a="+a+", d="+d);
		a= d--; //a=5, d=4 / a=d가되고, d=5-1이 된다.
		System.out.println("a="+a+", d="+d);
		a= --d; //d=3, a=3 / d=4-3이되고, a=d가 된다.
		System.out.println("a="+a+", d="+d);
	}

}
