package ex0210.homework;
/**
  요청 결과를 출력할 view
*/
public class EndViewExam20{
   /**
     성공여부 메시지를 출력하는 메소드 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     전체검색 결과를 출력하는 메소드
   */
   public static void printSelectAll(AccountExam20 [] arr){//service에 있는 주소가 전달되었다.
	  int cnt = AccountsServiceExam20.count;
	   
	  System.out.println("계좌목록");
	  for(int i = 0; i < cnt; i++) {
		  System.out.println(arr[i].getAccountNum() + "    " + arr[i].getName()+ "    " + arr[i].getPrice());
	  }
   }

   /**
     계좌에 해당하는 상세정보 출력하는 메소드 
   */
   public static void printSelectByAccount(AccountExam20 account){
	   System.out.println("계좌번호:" + account.getAccountNum());
	   System.out.println("계좌주:" + account.getName());
	   System.out.println("초기입금액:" + account.getPrice());
   }


}