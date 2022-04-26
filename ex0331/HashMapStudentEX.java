package ex0331;

import java.util.*;

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}
public class HashMapStudentEX {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("이재문", new Student(2,"010-222-2222"));
		map.put("김남윤", new Student(3,"010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름을 입력하시오. :");
			String name = scanner.nextLine();
			if (name.equals("exit")){
				break;
			}
			Student student = map.get(name);
			if(student == null) {
				System.out.println(name+"은/는 없는 사람 입니다.");
			}
			else {
				//System.out.println("id :" + student.getId()+", 전화 :"+student.getTel()); //Student 클래스에 getId getTel메소드를 만들어서 맞게하거나
				System.out.println("id :" + student.id+", 전화 :"+student.tel);//바로 인자를 불러오면된다.
			}
		}
		scanner.close();
	}

}
