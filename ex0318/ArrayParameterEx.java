package ex0318;

public class ArrayParameterEx {
	static void replaceSpace(char a[]) {//' '를 ','로 바꾸는 메소드
		for (int i = 0; i<a.length;i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
	}
	static void printCharArray(char a[]) {//배열에 있는 문자를 모두 출력하는 메소드
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
