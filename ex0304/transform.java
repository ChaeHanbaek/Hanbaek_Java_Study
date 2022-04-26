package ex0304;

public class transform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =300;
		byte b =(byte)n; //(변환할 타입)으로 강제변환 가능
		System.out.println(b); // 강제변환하면 값 손실이 일어난다.
		double d =1.9;
		int m =(int)d;
		System.out.println(m);
	}

}
