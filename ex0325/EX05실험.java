package ex0325;
//오름차순 정렬 알고리즘 소프트웨어공학에서 받은거로 교체
public class EX05실험 {
	public static void main(String[] args) {
		int score[]= {41,31,48,97,9,65,27,29,13,15}; //score배열의 index 0~9에 성적 정보 넣음 //입력받은 순서 저장용
		//sort 배열을 score 길이에 맞게 만들고 score 각 인덱스에 해당하는 값을 sort에 복사
		int sort[]= new int[score.length];
		for(int a =0;a<score.length;a++) {
			sort[a]=score[a];
		}
		for (int i = 0;i<10;i++) {

			for(int j = i+1; j<10; j++) {
				if(sort[i]>sort[j]){
					int t=sort[i];
					sort[i]=sort[j];
					sort[j]=t;
				}
			}
		}
		for(int x:sort) {
			System.out.print(x+"\t");
		}
	}

}
