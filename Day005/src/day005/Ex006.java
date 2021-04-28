package day005;

public class Ex006 {

	public static void main(String[] args) {
		
		int year=2000;
		String yun=(year%4==0)?"true" : "false"; System.out.println(year+" 윤년"+yun);
		String yun1=!(year%4==0 && year%100==0)?"true" : "false"; System.out.println(year+" 윤년"+yun1);
		System.out.println(year+" 윤년 : "+
				((year%4==0  &&  year%100 != 0 ) || (year%400==0)));
		         //4년 마다 그리고 100으로 나누어 떨어지면 평년이라 윤년을 찾는거기때문에 부정 또는 400으로 나누어 떨어지면 윤년
		
		
		
		// TODO Auto-generated method stub
/*
 1.서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다.(1988,1992,1996,2004,...)
 2.서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.(1900년,2100년...)
 3.서력 기원 연수가 4, 100,400으로 나누어 떨어지는 해는 윤년으로 둔다.(2000년,2400....)
 
 4년마다 2월 29일 나타남
 1.윤년 :4년 마다
 2.윤년 :!(4,100으로 나누어 떨어지는 해는 평년으로 한다.)
 3.윤년 :100,400나누어 떨어지면 윤년
 * 
 
		 [EX]     클래스명 Ex006
		    ㅁ출력된화면 
		    2019년도는 윤년입니까? false 
	*/	
	}

}
