package ex0223.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutExam {
	public FileInputOutExam() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/ex0223/io/aa.txt");
			
//			while(true) {
//				int i = fis.read();
//				if(i==-1)break;
//				System.out.println(i + " = " + (char)i);
//			}
			
			//int len = fis.available();
			byte b [] = new byte[1024];
			int re = 0;
			
			while((re = fis.read(b)) != -1) {
				System.out.println("re= " + re);
				//System.out.println("b= " + b);
				
				//byte 배열을 -> String으로 변환!!!!
				String data = new String(b);
				System.out.println("data = " + data);
			}
			//파일에 저장=출력
			//fos=new FileOutputStream("src/ex0223/io/write.txt");  //없으면 만들고 있으면 덮어쓰기
			fos=new FileOutputStream("src/ex0223/io/write.txt",true);  //없으면 만들고 있으면 이어쓰기
			fos.write(66);
			fos.write(13);
			fos.write(75);
			
			String str = "안녕하세요";
			
			//String -> byte 배열로 변환!!!!!
			fos.write(str.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//닫기
				try {
					if(fis!=null) fis.close();
					if(fos!=null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		new FileInputOutExam();
	}
}
