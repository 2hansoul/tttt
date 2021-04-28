package day005;

public class Ex005 {

	public static void main(String[] args) {
		int d; int h ; int m; int s;
		double year=365.2422;
		/*
		System.out.println(5*60*60*24);
		System.out.println(86400*2422);//1일 86400, 2422 초단위 209260800
		System.out.println(86400*365); //31536000 365일에 초단위
		*/
		int now=(int)(year*86400);
		
		d=now/86400;
		now=now%86400;
		
		h=now/3600;
		now=now%3600;
		
		m=now/60;
		s=now%60;
		
		System.out.println(d+"일"+h+"시간"+m+"분"+s+"초");
				
		/*
		EX]     클래스명 Ex005
    365.2422일 --> 365일 5시간 48분 46초
   double year=365.2422;
   
	※ 힌트
   1초 : 1
   1분 : 1*60
   1시간 : 1*60*60
   1일 :   1*60*60*24 = 86400   초단위
   1일     86400*1
   2일     86400*2
   365.2422일     86400*365.2422   => 초단위로
		*/
		// TODO Auto-generated method stub

	}

}
