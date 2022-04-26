package ex0401;

import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		File src = new File("c:\\windows\\system.ini");
		File dest = new File("c:\\Temp\\system.txt");
		int c;
		//자바 기본설정에선 폴더와 파일 구분 안함 isFile, isDirectory로 구분해줘야 혹시모를 에러 방지할 수 있음
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c=fr.read()) != -1){ //한줄씩 읽어서
				fw.write((char)c); //한줄씩 복사
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		} 
		catch (IOException e){
			System.out.println("파일 복사 오류");
		}
	}

}
