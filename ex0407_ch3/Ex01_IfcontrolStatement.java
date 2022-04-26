package ex0407_ch3;

class Ex01_IfcontrolStatement {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int v1 = 5;
		if(v1>3) {
			System.out.println("실행1");
		}
		if(v1<5) {
			System.out.println("실행2");
		}
		boolean b1 = true;
		boolean b2 = false;
		if(b1) {
			System.out.println("실행3");
		}
		if(b2) {
			System.out.println("실행4");
		}
		
		int v2 = 5;
		if (v2>3) {
			System.out.println("실행5");
		}
		else {
			System.out.println("실행6");
		}
		
		System.out.println((v2>3)?"실행5":"실행6");
		System.out.println();
		
		int v3 = 85;
		if(v3>=90) {
			System.out.println("A학점");
		}
		else if(v3>=80) {
			System.out.println("B학점");
		}
		else if(v3>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
		
		if(v3>=70) {
			System.out.println("C학점");
		}
		else if(v3>=80) {
			System.out.println("B학점");
		}
		else if(v3>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
		
		if(v3>=70 && v3<80) {
			System.out.println("C학점");
		}
		else if(v3>=80 && v3<90) {
			System.out.println("B학점");
		}
		else if(v3>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
	}

}
