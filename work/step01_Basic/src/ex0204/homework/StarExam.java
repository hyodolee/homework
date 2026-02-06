package ex0204.homework;

import java.util.Arrays;
import java.util.Scanner;
/**
 *  주제:
 *  작성일:
 *  작성자:
 **/

public class StarExam {

	public static void main(String[] args) {
		int cnt1 = 5, cnt2 = 4, cnt3 = 4, cnt4 = 5;
		
		for(int i=0; i < 5; i++) {
			for(int j=5; j > 0; j--) {
				System.out.print("*");
				if(j == cnt1) {
					cnt1-=1;
					break;
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for(int i=0; i < 5; i++) {
			for(int j=0; j < 5; j++) {
				System.out.print("*");
				if(j == cnt2) {
					cnt2 -= 1;
					break;
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		
		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (j < cnt3) {
		            System.out.print("-");
		        } else {
		            System.out.print("*");
		        }
		    }
		    cnt3 -= 1;
		    System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for (int i = 0; i < 5; i++) {
		    for (int j = 5; j > 0; j--) {
		        if (j > cnt4) {
		            System.out.print("-");
		        } else {
		            System.out.print("*");
		        }
		    }
		    cnt4 -= 1;
		    System.out.println();
		}
	}
}