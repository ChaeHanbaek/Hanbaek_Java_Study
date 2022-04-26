package ex0331;

import java.util.*;

public class CollectionEx {
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = " ->";
			}
			else {
				separator = "\n";
			}
			System.out.print(e+separator);
		}
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");
		
		//Collections 모듈에 있는 sort메소드 호출 //정렬 기준은 오름차순
		Collections.sort(myList);
		printList(myList);
		
		//Collections 모듈에 있는 요소 순서 반대로 만들어주는 메소드
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타");
		System.out.println("아바타는 " + (index+1) + "번째 요소입니다.");//index는 0부터 시작하므로 +1로 보정
		
		Iterator<String> it = myList.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name+"의 인덱스는"+myList.indexOf(name)+"입니다");
			index = Collections.binarySearch(myList, name);
			System.out.println(name+"는 " + (index) + "번째 요소입니다.");
		}
		
		Collections.sort(myList);
		printList(myList);
		
		Iterator<String> tt = myList.iterator();
		while(tt.hasNext()) {
			String name=tt.next();
			System.out.println(name+"의 인덱스는"+myList.indexOf(name)+"입니다");
			index = Collections.binarySearch(myList, name);
			System.out.println(name+"는 " + (index+1) + "번째 요소입니다.");
		}
		
	}
		
	

}
