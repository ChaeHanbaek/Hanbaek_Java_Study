package ex0331;


public class GenericMetheodExample {
	public static <T> GStack <T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>();
		while (true) {
			T tmp;
			tmp = a.pop();
			if(tmp == null) {
				break;
			}
			else {
				s.push(tmp);
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		GStack<Double> gs = new GStack<Double>();
		
		for(int i = 0; i<5; i++) {
			gs.push(Double.valueOf(i)); //예제에 있는대로 new Double(i)쓰면 컴파일러가 경고함 자바 홈페이지에선 Double.valueOf()를 쓰라고 추천
		}
		gs = reverse(gs);
		for(int i=0;i<5;i++) {
			System.out.println(gs.pop());
		}

			
		}
	}


