package day005;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		//삼항연산자를 이용하여 절대값을 구하시오(무조건 양수)
		//변수
	 int num=0; int a=0;
		Scanner scanner=new Scanner(System.in);
		//입력
		System.out.println("숫자한개입력>");
		num=scanner.nextInt();
		
		a=num<0?  num*-1:num; 
		System.out.println("입력한값:"+num);
		System.out.println("절대값:"+a);
		
		
		scanner.nextInt();
		
		// TODO Auto-generated method stub

	}

}
