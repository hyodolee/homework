package homework.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import homework.dto.Human;
import mvc.controller.ElectronicsController;

/**
   사용자의 요청을 키보드로 입력받는 클래스 
*/
public class MenuView{
    Scanner sc= new Scanner(System.in);
	ElectronicsController controller = new ElectronicsController(); // 전역변수 초기화, 생성자 호출 

	/**
	  전체 메뉴를 출력하는 메소드
	*/
	public void printMenu(){
        
	     while(true){
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("1. 프로필저장    2. 프로필 불러오기     3. 종료");
		   System.out.println("----------------------------------------------------------------------------------");
		   System.out.print("메뉴선택 > ");

		   String  menu = sc.nextLine();
		   switch(menu){
               case "1" : 
                   this.createNewFile();
                   break;
			   case "2" : 
				   this.readProf();
				   break;
			   case "3" : 
                 System.exit(0);
			   default:
				   System.out.println("메뉴를 다시 선택해주세요!!!!");

		   }//switch문끝

		 }//while문끝

	}//메소드끝

	public void readProf() {
		System.out.print("이름> ");
        String name = sc.nextLine();
		
		String fname = "src/" + name + ".txt";
		File file = new File(fname);
    	
    	if(!file.exists()) {
    		System.out.println(name + " 에 해당하는 정보는 없습니다.");
    	}else {
    		try (BufferedReader br = new BufferedReader(new FileReader(fname));){

    			//한 줄 읽기
    			String data = null;
    			while((data = br.readLine()) != null) {
    				String arr[] = data.split(":");
    				System.out.println(name + "님 몸무게는" + arr[0] + "Kg 이고 비번은 " + arr[1] + " 입니다.");
    			}
    			
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
	}

	/**
	   등록할때 키보드 입력을 처리하는 메소드
	*/
	public void createNewFile(){
        System.out.print("이름> ");
        String name = sc.nextLine();
        
        String fname = "src/" + name + ".txt";
		File file = new File(fname);

    	if(file.exists()) {
    		System.out.println("이미 존재하므로 다시 입력하세요.");
    	}else {
    		System.out.print("몸무게> ");
    		String weight = sc.nextLine();

    		System.out.print("비밀번호> ");
            int password = Integer.parseInt(sc.nextLine());

            Human human= new Human(name, weight, password);
            
    		try {
    			file.createNewFile();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		
    		this.write(human);
    	}
	}
	
	public void write(Human human) {
		String fname = "src/" + human.getName() + ".txt";
		File file = new File(fname);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));){
			
			String data = human.getWeight() + ":" + human.getPassword();
			bw.write(data);
			bw.newLine();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}