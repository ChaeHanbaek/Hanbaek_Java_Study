package ex0331;

import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		HashMap<String, Integer> javaScore = new HashMap <String,Integer>();
		
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 :"+javaScore.size());
		
		//Set<K> A = B.keySet(); 해시맵 B의 모든 키값을 가진 Set<K> 컬렉션을 A로 리턴
		Set <String> keys = javaScore.keySet();
		
		Iterator<String> it = keys.iterator(); //키값 컬렉션 keys를 Iterator로 변환
		
		while(it.hasNext()) {
			String name = it.next(); //key값을 계속 Iterator로 받아옴
			int score = javaScore.get(name); //받은 키값에 따른 밸류를 언박싱해서 int 값으로 넘겨줌
			System.out.println(name+":"+score);
		}
		
		
	}

}
