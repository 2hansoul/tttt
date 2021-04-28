package day005;

import java.util.Scanner;

public class MiniBank {

   public static void main(String[] args) {
      //변수
      String a;
      int input=0 ,id=1 , pass=1;float balance=10000.0f ,bal=0.0f ,balance1=0.0f;
      float withdraw=0.0f ,wit=0.0f;
 
      Scanner scanner=new Scanner(System.in);
      //입력
      System.out.println("============BANK===========");
      System.out.println("1.추가");
      System.out.println("2.조회");
      System.out.println("3.입금");
      System.out.println("4.출금");
      System.out.println("5.삭제");
      System.out.println("6.종료");
      System.out.println("입력>>>");
      input=scanner.nextInt();//입력 변수를 만들어 줌
     
     
      System.out.println((input==1)?"※추가기능":
     	 (input==2)?  "※조회기능":
     		  (input==3)?  "※입금기능":
     			  (input==4)? "※출금기능":
     				  (input==5)? "※삭제기능":
     					 (input==6)? "※종료기능입니다":"" );
      if (!(input==6)) {System.out.print("아이디:");}//6종료기능을 누르면 아이디,패스위드를 나타내지않고 바로 종료
      id=scanner.nextInt();
      
      if (!(input==6))System.out.print("패스워드:");
      pass=scanner.nextInt();
      scanner.nextLine();
      
      if(id==1 && pass==1 && input==3 ) {System.out.println("입금"); balance1=scanner.nextFloat();}//평소에는 표현하지않고 3,4번 누르면표현
      if(id==1 && pass==1 && input==4 ) {System.out.println("출금"); balance1=scanner.nextFloat();}
      
      
     
      
      
      //처리 
      bal= (int)balance+(float)balance1;//입금
      wit=bal-withdraw;//출금
      if(id==1 && pass==1 && (input==1)) {System.out.println("잔액:"+balance);System.out.print("설정 되었습니다.");}
      else if(!(id==1 && pass==1)&&(input==1)) {System.out.println("다시 입력해주세요");}//1번 추가기능



      if(id==1 && pass==1 && (input==2)) {System.out.println("반갑습니다 고객님");System.out.println("ID:"+id);System.out.println("pass:"+pass);System.out.println("balance:"+balance);}    
      else if(!(id==1 && pass==1) &&(input==2)) {System.out.println("다시 확인 해주세요");}//2번 조회기능
      
      if(id==1 && pass==1 && input==3 && balance>0 ) {{System.out.print("==잔액확인\n"+"ID:"+id+"\n"+"pass:"+pass+"\n");System.out.print("balance:"+wit);}}
      else if(!(id==1 && pass==1)&&(input==3) || balance<0 ) {System.out.println("다시 입력해주세요");}//3번 임금기능
     
       
      
       if(id==1 && pass==1 && input==4  && balance>0) {{System.out.print("==잔액확인\n"+"ID:"+id+"\n"+"pass:"+pass+"\n");System.out.print("balance:"+wit);}}
       else if(!(id==1 && pass==1)&&(input==4) || balance<0) {System.out.println("금액이 모자랍니다 "+"\n"+"종료합니다");}
      // if(!(id==1 && pass==1)&&(input==4) && balance>0) {System.out.println("다시 입력해주세요");}//4출금번 임금기능
      
     
       
      
      if(id==1 && pass==1 && input==5) {System.out.println("삭제기능");System.out.print("==잔액확인\n"+"ID:"+0+"\n"+"pass:"+0+"\n");System.out.print("balance:"+0.0f);}
      else if(!(id==1 && pass==1)&&(input==5)) {System.out.println("다시 입력해주세요");}//5번 삭제 임금기능
      
      

      
      
    //삼항연산자 
      //4.삼항연산자           조건? 참:거짓
            //Q6 a가 양수라면 양수출력/아니라면 음수출력
            //String result=(a>0)? "양수" : "음수"; System.out.println(result);
            //Q7 a가 양수라면 1 출력/아니라면0출력
            //int result2=(a>0)? 1:0; System.out.println(result2);
            //Q8 a가 양수라면 1.1곱하기 출력/아니면 0.9곱하기
      //double result3=(a>0)? a*1.1:a*0.9; System.out.println(result3);
      
      //출력
      /*
      String result1=(input==1)? "출력기능입니다":" "; System.out.printf(result1);//1입력 하면 출력 아니면 "" 표시 
      result1=(input==2)? "조회기능 입니다":" "; ;//출력 부분을 통일하여 숫자 하나를 입력해도 다 출력되지 않고 그부분만 출력
      result1=(input==3)? "입금기능 입니다":" "; 
      result1=(input==4)? "출금기능 입니다":" "; 
      result1=(input==5)? "삭제기능 입니다":" "; 
      result1=(input==6)? "종료기능 입니다":" "; 
     //System.out.println(result==1? "출력기능":result==2? "조회기능":result==3? "입금":result==4?"출금":
    	  //result==5? "삭제기능":result==6? "종료기능":"");
      */ 
 
      
      
      
      
      // TODO Auto-generated method stub

   }

}
