package ex0401;

import java.io.*;

public class FileOutputStramEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		byte b[]= {7,51,3,4,-1,24};
		try {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Desktop\\test.out");
		for(byte x:b) {
			fout.write(x);
		}
		fout.close();
		}
		catch(IOException e){
			System.out.println("C:\\Users\\user\\Desktop\\test.out 에 저장 할 수 없습니다. 경로명을 확인해 주세요.");
			return;
		}
		System.out. println("C:\\Users\\user\\Desktop\\test.out을 저장하였습니다.");
	}

}
