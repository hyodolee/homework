package ex0210.homework;
import java.util.Scanner;

import ex0206.array.goods.GoodsService;
/**
 키보드 입력을 받아 각 기능을 호출해줄 View
*/
public class MenuViewExam20{

 private Scanner sc = new Scanner(System.in);
 private AccountsServiceExam20 service; //전역변수 초기화

  /**
    전체 메뉴를 출력하는 메소드 
  */
  public void printMenu(){

	  service = new AccountsServiceExam20();
	  
	  while(true){
         System.out.println("---------------------------------------------------------------------------");
		 System.out.println("1.계좌생성  |  2.계좌목록  |  3.예금  |   4. 출금  |   5.종료");
		 System.out.println("----------------------------------------------------------------------------");

         System.out.print("메뉴 선택 > ");
		 int menuChoice = Integer.parseInt( sc.nextLine());

		 switch(menuChoice){
             case 1 : 
				 this.inputInsert() ; break;
			 case 2 : 
				 AccountExam20 [] accounts = service.selectAll(); 
			     EndViewExam20.printSelectAll(accounts);
			      break;
			 case 3 : 
				 this.inputIncUpdate(); break;
			 case 4 : 
				 this.inputDecUpdate() ; break;
			 case 5 : 
				 System.out.println("다음에 또 이용해주세요. 프로그램 종료합니다.");
				 System.exit(0); 
			 break;
			 	default: System.out.println("메뉴는 1~5 만 입력해주세요.");

		 }//switch문

	  }//while문

  } //printMenu끝

  /**
     등록관련 키보드 입력
  */
  public void inputInsert(){
       //키보드입력 4개 받기 
	   System.out.print("계좌번호 > ");
	   String accountNum = sc.nextLine();

	   System.out.print("계좌주 > ");
	   String name = sc.nextLine();

	   System.out.print("초기입금액 > ");
	   int price = Integer.parseInt(sc.nextLine());
	   
	   AccountExam20 account = new AccountExam20(accountNum, name, price);
	   
	   int result = service.insert(account);

	   if(result==-1)
		  EndViewExam20.printMessage("더이상 생성할 수 없습니다.");
	   else if(result==0)
		  EndViewExam20.printMessage(accountNum+"는 중복이므로 등록할수 없습니다.");
	   else 
           EndViewExam20.printMessage("계좌가 생성되었습니다..");
  }

  /**
    예금
  */
  public void inputIncUpdate(){
	  System.out.print("예금");
      System.out.print("계좌번호 : ");
	  String accountNum = sc.nextLine();
	  System.out.print("예금액 : ");
	  String price = sc.nextLine();

	  AccountExam20 account = service.selectByAccountNum( accountNum );
	  if(account==null){
          EndViewExam20.printMessage(accountNum+"은 검색할수 없습니다.");
	  }else{
		  service.incUpdate(account, Integer.parseInt(price));
          EndViewExam20.printMessage("출금이 성공되었습니다.");
	  }
  }

  /**
    출금
  */
  public void inputDecUpdate(){
	  System.out.print("출금");
      System.out.print("계좌번호 : ");
	  String accountNum = sc.nextLine();
	  System.out.print("출금액 : ");
	  String price = sc.nextLine();

	  AccountExam20 account = service.selectByAccountNum( accountNum );
	  if(account==null){
          EndViewExam20.printMessage(accountNum+"은 검색할수 없습니다.");
	  }else{
		  service.decUpdate(account, Integer.parseInt(price));
          EndViewExam20.printMessage("출금이 성공되었습니다.");
	  }
  }//메소드끝

}//클래스끝