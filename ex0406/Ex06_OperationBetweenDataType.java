package ex0406;

public class Ex06_OperationBetweenDataType {
	public static void main(String[] args) {
		int v1 = 3+5;
		int v2 = 8/5;
		float v3 = 3.0f+5.0f;
		double v4 = 8.0/5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		int v5 = data1+data2;
		
		System.out.println("int 두값을 서로 더한 int: "+v1);
		System.out.println("int 두값을 서로 나눈 int: "+v2);
		System.out.println("float로 강제 형변환을 한 두 float값을 서로 더한 float: "+v3);
		System.out.println("double두 값을 서로 나눈 double: "+v4);
		System.out.println("byte 두값을 서로 더한 int: "+v5);
		System.out.println("-----------------------------------------");
		
		double v6 = 5 + 3.5;
		int v7 = 5 + (int)3.5;
		
		double v8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		int v9 = data3 + data4;
		double v10 = data3 + data4;
		
		System.out.println("int와 double을 서로 더한 double: "+v6);
		System.out.println("int와 int로 강제 형변환한 double을 서로 더한 double: "+v7);
		System.out.println("int를 double로 나눈 double: "+v8);
		System.out.println("int를 byte로 자동 형변환한 것과 int를 short로 자동 형변환한 거를 더한 int: "+v9);
		System.out.println("int를 byte로 자동 형변환한 것과 int를 short로 자동 형변환한 거를 더한 double: "+v10);
	}
}
