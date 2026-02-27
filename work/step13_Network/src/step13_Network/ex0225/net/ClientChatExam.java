package step13_Network.ex0225.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientChatExam {
	public ClientChatExam() {
		try {
			Socket sk = new Socket("192.168.0.29", 8001);
			
			//보내는 스레드(전송=출력)
			new SendThread(sk, "[Client]").start();
			
			//받는 스레드(읽기)
			new Thread(()->{
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
					
					while(true) {
						String readData = br.readLine();
						
						if(readData.equals("exit")) break;
						
						System.out.println(readData);
					}
					
					System.out.println("client받는 스레드 종료합니다.");
					
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("client의 받는 스레드 예외 발생했어요.");
				} finally {
					System.out.println("--모든 프로그램을 종료합니다.");
					System.exit(0);
				}
			}).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ClientChatExam();
	}
}
