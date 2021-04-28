package day005;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		int money=54320; //출력결과 만원5장/천원4장/백원3개/십원2개
        int a; int b; int c; int d; int e; int f;
        a=money/10000;
        b=money%10000;
        f=(b/1000);
        c=(b%1000);
        d=(c/100);
        e=(b%100)/10;
        
      
        
        //System.out.println(a);System.out.println(b);
        //System.out.println(c);System.out.println(d);
        //System.out.println(e);System.out.println(f);
		
        System.out.println("출력된 결과 :"+"만원"+a+"장\t"+"천원"+f+"장\t"+"백원"+d+"장\t"+"십원"+e+"장\t");
		/*
		total=(kor+eng+math);
		avg=total/3.f; //평균을 
		level="LV"+(int)(avg/10);
        System.out.println("543에서 5추출: "+(543/100));
        System.out.println("543에서 43추출: "+(543%100));
        System.out.println("43에서 4추출: "+(43/10));
		System.out.println("43에서 4추출: "+(543%100)/10);
		System.out.println("43에서 3추출: "+ 43%10);
		System.out.println("43에서 3추출: "+(543%100)%10);
		
		System.out.println("54320에서 5추출"+(money/10000));
		System.out.println("54320에서 4320추출"+(money%10000));
		System.out.println("4320에서 4추출"+(b/1000));
		System.out.println("4320에서 320추출"+(b%1000));
		System.out.println("320에서 3추출"+(c/100));
		System.out.println("320에서 20추출"+(b%100));
		System.out.println("20에서 2 추출"+(b%100)/10);
		System.out.println((b%100)/10);
		*/
		
		
       
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
