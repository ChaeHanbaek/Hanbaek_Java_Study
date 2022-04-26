package ex0331;
//binary search 원리 찾기위해 integer로 개조

import java.util.*;

public class CollectionEx변형 {
	static void printList(LinkedList<Integer> I) {
		Iterator<Integer> iterator = I.iterator();
		while (iterator.hasNext()) {
			int e = iterator.next();
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
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.add(1);
		myList.add(3);
		myList.add(5);
		myList.add(7);
		myList.add(9);
		myList.add(11);
		myList.add(13);
		myList.add(15);

		//Collections 모듈에 있는 sort메소드 호출 //정렬 기준은 오름차순
		Collections.sort(myList);
		printList(myList);
		
		//Collections 모듈에 있는 요소 순서 반대로 만들어주는 메소드
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, 7);
	
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			int name=it.next();
			System.out.println(name+"의 인덱스는"+myList.indexOf(name)+"입니다");
			index = Collections.binarySearch(myList, name);
			System.out.println(name+"의 바이너리값은 " + (index) + "입니다.");
			System.out.println("-----------------------------------------------");
		}
		
		Collections.sort(myList);
		printList(myList);
		
		Iterator<Integer> tt = myList.iterator();
		while(tt.hasNext()) {
			int name=tt.next();
			System.out.println(name+"의 인덱스는"+myList.indexOf(name)+"입니다");
			index = Collections.binarySearch(myList, name);
			System.out.println(name+"의 바이너리값은 " + (index) + "입니다.");
			System.out.println("-----------------------------------------------");
		}
		
	}
		
	

}
