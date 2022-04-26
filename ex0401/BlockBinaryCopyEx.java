package ex0401;

import java.io.*;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		File src = new File("c:\\windows\\web\\wallpaper\\theme1\\img1.jpg");
		File dest = new File("c:\\temp\\desert.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte [1024*10]; //버퍼 크기를 10kb로 지정 //1024 byte = 1kb
			while(true) {
				int n = fi.read(buf); //버퍼 크기만큼 읽기, n은 실제 읽은 바이트
				fo.write(buf,0,n); //buf[0]부터 n바이트 쓰기
				if(n<buf.length) { // 버퍼보다 남은 파일길이가 작은거로 end of file로 보고 반복 끝냄
					break;
				}
			}
			fi.close(); //이때 버퍼에 남은거 자동 반환됨
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
