package ex0401;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		FileReader fin = null;
		//파일 읽을때는 에러가 클수 있으므로 try catch로 에러관리
		try {
			fin = new FileReader("c:\\windows\\System.ini");
			int c;
			while ((c=fin.read()) != -1){ //한 문자씩 파일 끝까지 읽기, fin.read값은 읽을게 없으면 -1을 반환하므로 이렇게 짠다.  
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
