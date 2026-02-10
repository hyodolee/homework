package ex0210.homework;

import ex0206.array.goods.Goods;
import ex0206.array.student.Student;

/**
  각 요청에 대한 로직(기능)을 담당할 클래스
  (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
*/
public class AccountsServiceExam20{

	//상품을 관리할 배열 선언
	private AccountExam20 [] accounts = new AccountExam20 [100];
	public static int count;//0 배열방에 저장 객체의 개수
	public static int searchedIdx; 


	public AccountsServiceExam20(String [][] data){
		int cnt = data.length;
		
	  for(int i =0; i < cnt; i++) {
		  this.accounts[count++] = create(data[i]);
	  }
	}

   public AccountsServiceExam20() {
		// TODO Auto-generated constructor stub
   }

   /**
      account를 생성해서 값을 설정하고 생성된 account를 리턴하는 메소드 
   */
   private AccountExam20 create(String [] row){
	   AccountExam20 account = new AccountExam20();
	   account.setAccountNum(row[0]);
	   account.setName(row[1]);
	   account.setPrice(Integer.parseInt(row[2]));
       return account;
   }


   /**
     등록(등록실패 - 중복인경우, 배열의 길이 벗어난경우)
	 @return : 
			 0이면 계좌번호 중복 ,
			 1이면 등록성공, 
			 -1이면 배열의 길이 벗어남
   */
   public int insert(AccountExam20 account){

	   // 배열의 길이 체크
	   if(accounts.length == count) return -1;

	   //중복체크 
	   AccountExam20 searchedAc = selectByAccountNum(account.getAccountNum());
	   
	   if(searchedAc != null) return 0;
	   
	   this.accounts[count++] = account;
	  
      return 1;
   }


   /**
     전체검색
   */
   public AccountExam20[] selectAll( ){
      return accounts;//
   }

   /**
     계좌번호에 해당하는 계좌 검색
	 @return : 만약 계좌번호에 해당하는 값이 있으면 account를 리턴하고
	           없으면 null 리턴
   */
   public AccountExam20 selectByAccountNum(String accountNum){
       for(int i = 0; i < count; i++) {
    	   if(accounts[i].getAccountNum().equals(accountNum)) {
    		   searchedIdx = i;
    		   return accounts[i];
    	   }
    		    
       }
       
       return null;
   }


   /**
    예금 
	@return : true이면 수정완료, false이면 수정실패
   */
   public boolean incUpdate(AccountExam20 account, int price){ 
	   account.setPrice(account.getPrice() + price);
	   
	   return true;
	}
   
   /**
    출금 
	@return : true이면 수정완료, false이면 수정실패
  */
   public boolean decUpdate(AccountExam20 account, int price){ 
	   account.setPrice(account.getPrice() - price);
	   
	   return true;
	}
}
