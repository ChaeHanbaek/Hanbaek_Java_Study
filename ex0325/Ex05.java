package ex0325;
/*
 * 한국대의 알고리즘 기말시험 결과 10명의 학생 성적은 41점, 31점, 48점, 97점, 9점, 65점, 27점, 29점, 13점, 15점이고
 *  낮은 점수를 받은 학생부터 순차적으로 학점을 F, D, D+, C, C+, B, B+, A, A+(2명)로 부여하고자 한다.
 *  선택정렬을 이용하여 성적을 오름차순으로 정렬하고, 학점을 규정에 따라 부여하라.​
 *  41  31  48  97  9  65  27  29  13  15​
 */
public class Ex05 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int score[]= {41,31,48,97,9,65,27,29,13,15}; //score배열의 index 0~9에 성적 정보 넣음 //입력받은 순서 저장용
		//sort 배열을 score 길이에 맞게 만들고 score 각 인덱스에 해당하는 값을 sort에 복사
		int sort[]= new int[score.length];
		for(int a =0;a<score.length;a++) {
			sort[a]=score[a];
		}
		//위 두 배열을 따로 안만들면 레퍼런스 변수로 하나의 배열을 건드리는게 되어버린다.
		String grade [] = {"F","D","D+","C","C+","B","B+","A","A+","A+"}; //10~1등까지의 학점
		int max; //가장 큰 수의 index 찾기위한 변수
		int t; //순서 바꿀때 임시 저장용
		
		for(int k=9;k>0;k--) {//index 0~k까지 탐색 k를 9에서 부터 시작해 1씩 줄임 
			max=0;//k가 변동할때마다 0으로 초기화 //index 0부터 탐색하기 위함
			for(int i=0;i<=k;i++) { //index 0부터 k까지 값 비교
				if(sort[i]>sort[max]) { //크면 그 index를 max에 넣음
					max=i;
				}
			}
			//순서바꾸기 알고리즘
			t=sort[k]; //index k값을 임시 저장
			sort[k]=sort[max];//가장 큰 값을 index k에 넣음
			sort[max]=t;//임시저장한 값을 가장 큰 값이 있던 자리에 넣음
		}
		
		//입력받은 순서대로 출력
		for(int x:score) {
			System.out.print(x+"\t");
		}
		System.out.println();
		
		//입력받은 순서에 맞는 sort결과를 보고 그에 맞는 학점을 출력
		for(int y:score) {
			for(int n=0;n<10;n++) {
				if(y==sort[n]) {
					System.out.print(grade[n]+"\t");
				}
			}
		}
	}

}
