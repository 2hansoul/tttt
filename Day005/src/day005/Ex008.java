package day005;

public class Ex008 {

	public static void main(String[] args) {
        //다음 연산의 겨로가를 적으시오
		//우선순위를 따지는 문제
		int x=2;
		int y=5;
		char c ='A'; //'A'의 문자코드 65
		
		
		//연산자 우선순위
		//제일높은연산자:단항.()
		//제일낮은연산자:=
		//산술(사칙)>비교(<,>) > 논리(&&,||)
		System.out.println(y>=5 || x < 0 && x>2 );//y는 5보다크거나같고 또는 x가0보다작고 그리고 x가2보다는 크다
		//1.5>=5 || 2<0 && 2>2 => 비교
		//2.true || false && false=> &&가 ||우선 순위가 높음
		//3.true || false           
		
		System.out.println(y+=10 - x++);//16-3
		//1. 5+=10-2++ 
		//2. 2++뒤에 붙음 ..;뒤로계산  => 우선순위1순위 ++,()
		//3 10-2
		//4 5+=8 =13
		//출력 다 끝나고 난뒤 x는 3
		System.out.println(x+=2);//2=2
		//1. 3+=2 
		System.out.println(!('A'<=c && c <= 'Z'));//A는 c보다 작거나같고 그리고 c는 Z보다 작거나같다
		
		//System.out.println((int)'Z');
		System.out.println('C'-c);
	    //1. 'C'-'A' =2   'A'(65),'B'(66),'C'(67)
		System.out.println('5'-'0');
		System.out.println(c+1);
		//'A'(숫자또는문자)+1 + 의 두가지의미)연산,출력("")
		//숫자+숫자
		System.out.println(++c);
		//[단항]++문자열 'B'
		//문자증가후 출력
		System.out.println(c++);
		//1.[단항] 문자++ - 문자 출력후(;)증가 'C'
		//2.(1.)의 둿처리 - 출력 다 끝나고 난뒤에 증가'C'
		System.out.println(c);
		
		
		
		// TODO Auto-generated method stub

	}

}