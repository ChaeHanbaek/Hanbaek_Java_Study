package ex0311;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for(int i=1; i<=5; i++) {
			for(int j=1; j<10; j++) {
			if(i==1&&j==5) {
			System.out.print("*");}
			else if(i==2&&j==4) {
			System.out.print("*");}
			else if(i==2&&j==6) {
			System.out.print("*");}
			else if(i==3&&j==3) {
			System.out.print("*");}
			else if(i==3&&j==7) {
			System.out.print("*");}
			else if(i==4&&j==2) {
			System.out.print("*");}
			else if(i==4&&j==8) {
			System.out.print("*");}
			else if(i==5) {
			System.out.print("*");}
			else {
				System.out.print(" ");}
			}
			System.out.println();
		}
		System.out.println();
	}

}

