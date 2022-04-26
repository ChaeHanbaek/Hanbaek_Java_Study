package ex0401;

import java.io.*;

public class fileInputStreamEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		byte b[] = new byte [6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\user\\Desktop\\test.out");
			int n =0, c;
			while((c=fin.read()) != -1) {
				b[n]=(byte)c;
				n++;
			}
			System.out.println("C:\\Users\\user\\Desktop\\test.out에서 읽은 배열을 출력합니다.");
			for(byte x:b) {
				System.out.print(x+" ");
			}
			System.out.println();
			fin.close();
		}
		catch(IOException e){
			System.out.println("C:\\Users\\user\\Desktop\\test.out에서 읽지 못하였습니다. 경로명을 체크하세요.");
		}
	}

}
