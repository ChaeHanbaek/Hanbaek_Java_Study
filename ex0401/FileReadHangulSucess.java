package ex0401;

import java.io.*;

public class FileReadHangulSucess {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\user\\Desktop\\minbangwui.txt"); //소스폴더위치에 생성시킨건 상세주소 필요없이 파일명만 있으면 됨 "C:\\Users\\user\\Desktop\\minbangwui.txt"
			in = new InputStreamReader(fin,"UTF-8"); //윈도우 10 메모장 기본 저장형식은 UTF-8이라서 바꿔야함 MS949는 ANSI형식 읽는데 사용 //이클립스 파일생성도 UTF-8
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
