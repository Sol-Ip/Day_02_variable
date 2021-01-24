package com.kh;

import java.util.Scanner;

public class Exam_Scanner {
	public static void main(String [] args) {
		// ctrl + 스페이스바
	Scanner sc = new Scanner(System.in);
		//입력
		System.out.print("int를 입력해주세요 :");
		//System.out.println(sc.nextInt());
		int iNum = sc.nextInt();
		
		System.out.print("float를 입력해주세요 : ");
		float fNum = sc.nextFloat();	
		System.out.print("Double를 입력해주세요 : ");
		double dNum = sc.nextDouble();
		System.out.print("char를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		//sc.netx()는 문자열을 입력을 받고
		//charAt(0)은 입력받은 문자열 중 맨 앞자리(하나)만 가져옴
		
		//문자열 입력받기
		// 1. sc.next() : 공백을 입력받지 않음
		// 홍 길 동 -> 홍, 이름 입력 받을 때
		// 2. sc.nextline() : 공백, 개행을 입력받음
		// 홍 길 동 -> 홍 길 동, 주소 입력 받을 때
		sc. nextLine(); //개행 제거
		System.out.print("String을 입력해주세요 : ");
		String str = sc.nextLine();
		System.out.println(); //개행
		//출력
		System.out.println("입력한 int는 :" + iNum);
		System.out.println("입력한 float은 :" + fNum);
		System.out.println("입력한 double은 :" + dNum);
		System.out.println("입력한 char는 :" + ch);
		System.out.println("입력한 String은 : " + str);
	}
}
