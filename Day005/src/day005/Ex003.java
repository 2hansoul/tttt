package day005;

public class Ex003 {

	public static void main(String[] args) {
		//삼항연산자를 이용하여 세 개의 수중에서 최대값 출력
		 int a=1,b=5,c=3; int max;
		 /*
		 1. a와b를 비교해서 a가 크면 max담고 아니면 b를 max담기
		 2. max와 c를 비교 max가 크면 max담고,아니면 c를 max담기
		 */
		 max=(a>b)? a:b; System.out.println(max);
		 max=(max>c)? max:c; System.out.println(max);
		// TODO Auto-generated method stub

	}

}
