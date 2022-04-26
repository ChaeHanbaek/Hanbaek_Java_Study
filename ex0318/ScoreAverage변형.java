package ex0318;
//이중 for문을 이중 for each 문으로 변형
public class ScoreAverage변형 {
	public static void main(String[] args) {
		//2차원배열로 선언과 동시에 초기화
		double score[][]= { {3.3,3.4}, //1학년 1,2학기
							{3.5,3.6}, //2학년
							{3.7,4.0}, //3학년
							{4.1,4.2}}; //4학년

		double sum =0;
		for (double [] x:score) { //각 학년별 반복 //score[]을 가리키는 x설정
			for(double y:x) { //각 학년의 학기별 반복 //score[][]을 가리키는 y설정
				sum += y; //전체 평점 합
			}
 		}
		int n=score.length; //학년수
		int m= score[0].length; //학기수
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
	}
}
