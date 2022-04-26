package ex0412_Ch8.sec01_accesmodifier.Ex03_AcessModiferOfClass_2;

import ex0412_Ch8.sec01_accesmodifier.Ex03_AcessModiferOfClass_2.pack.AA;
//import ex0412_Ch8.sec01_accesmodifier.Ex03_AcessModiferOfClass_2.pack.BB;
//public 아닌 클래스는 import 불가
import ex0412_Ch8.sec01_accesmodifier.Ex03_AcessModiferOfClass_2.pack.CC;


public class AccessModiferOfClass_2 {	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		AA a = new AA(); //A는 알아서 생성자를 클래스와 같은속성인 public으로 붙여줌
		//BB b = new BB(); //B는 import못해서 못가져옴
		//CC c = new CC(); //C는 import는 가능하나 디폴트 생성자만 있어서 다른 패키지에서 접근불가
	}

}
