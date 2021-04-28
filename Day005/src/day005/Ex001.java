package day005;

public class Ex001 {

	public static void main(String[] args) {
        //1.산술연산자    + - * / %
		int a=10,b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//2.비교(관계)연산자  >,<,<=,>=,==,!= true/false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b); //다르다
		//Q1 a가 짝수라면 true/아니라면 false
		//1(홀수)
		//2(짝수)
		//3(홀수)
		//4(짝수)
		System.out.println(1%2==0);
		System.out.println(2%2==0);
		System.out.println("a가 짝수:"+((a%2)==0));
		System.out.println("b가 짝수:"+((b%2)==0));
		//Q2 a가 3의 배수라면 true출력/아니면 false 
		//1 (홀수) 1%3 =1 1을 3으로 나눴을때의 나머지 1
		//1 (짝수) 2%3 =0 2을 3으로 나눴을때의 나머지 2
		//1 (홀수) 3%3 =1 3을 3으로 나눴을때의 나머지 0
		//1 (홀수) 4%3 =1 4을 3으로 나눴을때의 나머지 1
		
		//3.논리연산자            &&(그리고,모든조건이 맞아아함), ||(조건중하나라도 걸리면 참)          true/false
		//q3 a가 2배수이면서 5의 배수라며 true출력/아니면 false
		//회사 1차 서류 ok &&2차면접ok =합격
		System.out.println("a가 2의 배수 :"+(a%2==0));
		System.out.println("a가 5의 배수 :"+(a%5==0));
		System.out.println("a가 2의 배수이면서 5의 배수라면 :"+((a%2==0)&&(a%3==0)));
		//q4 a가 2배수이거나 3의 배수라면 true출력/아니면 false
		//점심 :짜장or짬뽕
		System.out.println("a가 2배수이면서 3의 배수라면:"+((a%2==0)||(a%3==0)));
		
		//q5 a가 3의 배수가 아니라면 true출력/아니면 false
		System.out.println("a가 3의 배수가 아니라면:"+!(a%3==0));
		System.out.println("b가 3의 배수가 아니라면:"+!(a%3==0));
		
		
		//4.삼항연산자           조건? 참:거짓
		//Q6 a가 양수라면 양수출력/아니라면 음수출력
		String result=(a>0)? "양수" : "음수"; System.out.println(result);
		//Q7 a가 양수라면 1 출력/아니라면0출력
		int result2=(a>0)? 1:0; System.out.println(result2);
		//Q8 a가 양수라면 1.1곱하기 출력/아니면 0.9곱하기
		double result3=(a>0)? a*1.1:a*0.9; System.out.println(result3);
		
		//5.단항연산자
		
		// TODO Auto-generated method stub

	}

}
