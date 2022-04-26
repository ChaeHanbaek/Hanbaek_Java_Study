package ex0401;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {

	private static String nextLine;

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Users\\user\\Desktop\\test2.txt");
			//5개짜리 버퍼가 꽉차지 않을때까지 출력
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while((c=fin.read()) != -1) {
				out.write(c);
			}
			
			//엔터를 치면 버퍼에 남아있던것들이 출력된다.
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
