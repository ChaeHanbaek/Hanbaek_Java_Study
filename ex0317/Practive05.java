package ex0317;

import java.util.Scanner;

public class Practive05 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오. : ");
		int money = scanner.nextInt();
		String sort [] = {"5만원권","만원권","천원권","백원","오십원","십원","일원"};//환산할 돈의 종류
		int unit [] = {50000,10000,1000,100,50,10,1}; //환산할 돈의 종류별 금액
		int num [] = new int[7];
		
		for(int i=0;i<num.length;i++) {
			if(i==0) {
				num[i]=money/unit[i];
			}
			else {
				num[i]=money%unit[i-1]/unit[i];
			}
		}

		for(int j=0;j<num.length;j++) {
			System.out.println(sort[j]+" "+num[j]+"개");
		}

	scanner.close();
	}
}
