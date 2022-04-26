package ex0401;

import java.io.*;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner (System.in);
		FileWriter fout = null;
		//int c;
		try {
			fout = new FileWriter("C:\\Users\\user\\Desktop\\hangul4.txt"); //reader와 다르게 파일 없으면 대상 경로에 생성함
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0 ) {//엔터 두번치면 저장
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2); //한줄띄기 위해 저장해둠
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}

}
