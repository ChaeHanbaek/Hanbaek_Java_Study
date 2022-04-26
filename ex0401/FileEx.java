package ex0401;

import java.io.File;

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----"+dir.getPath()+"의 서브 리스트입니다. -----");
		File [] subFiles = dir.listFiles();
		for (File x:subFiles) {
			File f = x;
			long t = f.lastModified();
			if(x.isFile()){
				System.out.print(f.getName());
				System.out.print("\t파일크기: "+ f.length());
				System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t,t,t,t);
			}
			else if(x.isDirectory()){
				System.out.print(f.getName());	
				System.out.print("\t폴더\t");
				System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t,t,t,t);
			}

		}
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+", "+f1.getParent()+", "+f1.getName());
		String res ="";
		if(f1.isFile()) {
			res = "파일";
		}
		else if(f1.isDirectory()) {
			res = "디렉토리";
		}
		System.out.println(f1.getPath()+"은 "+res+"입니다.");
		
		File f2 = new File("c:\\Temp\\java_samle");


		if(!f2.exists()){ // file.exists 존재하면 true, 없으면 false 여기선 앞에 !을 붙여 반대로 사용
			f2.mkdirs(); // 여러 디렉토리를 만드는 명령어 .mkdirs(); //.mkdirs()자체도 boolean타입이라서  if문 조건문에 넣을 수 있음.
		}

		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new File("c:\\Temp\\javasample"));
		listDirectory(new File("c:\\Temp"));
	}

}
