package day005;

public class Ex007 {

	public static void main(String[] args) {
		
		int a=1,b=1,c=1,d=1,e=1;
		
		a=a+1; 
		System.out.println("산술(+) 숫자1개 증가 :a=a-1 ="+a);
		b+=1;
		System.out.println("대입(+=) 숫자1개 증가 :b+=1 ="+b);
		System.out.println("증감(c++) 숫자1개 늘리기 : ="+ c++);
		System.out.println(";빠져나온(후)1개 증가");
		
		System.out.println("증감(++d) 숫자1개 늘리기 :"+ d++);
		System.out.println(";빠져나온(전)1개 증가"+ d++);
		
		e++; System.out.println("1개 증가 : "+e);
		++e; System.out.println("1개 증가 : "+e);
		// TODO Auto-generated method stub

	}

}
