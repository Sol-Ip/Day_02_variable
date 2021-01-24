package com.kh;

import java.util.Scanner;

public class Exercise_Character {
	public static void main(String [] args ) { // 메인 메소드
		//Scanner 임포트
		Scanner sc = new Scanner(System.in);
			// 입력
			System.out.print("이름을 입력해주세요 : ");
			String userName = sc.next();
			//이름 : 홍길동
			System.out.print("나이를 입력해주세요 : ");
			int userAge = sc.nextInt();
			//나이 : 22
			sc.nextLine(); //개행 제거, 엔터 받기
			System.out.print("주소를 입력해주세요 : ");
			String userAddr = sc.nextLine();
			//서울시 구로구
			System.out.print("키를 입력해주세요 : ");
			double userHeight = sc.nextDouble();
			//185
			System.out.print("몸무게를 입력해주세요 : ");
			double userWeight = sc.nextDouble();
			//70 -> 70.0
			System.out.print("성별을 입력해주세요 : ");
			char userGender = sc.next().charAt(0);
			//문자를 입력 받는 메소드는 따로 없으므로
			//문자열을 입력 받는 메소드로 사용하여 문자를 입력 받음
			//남
			System.out.println(); //개행
			
			//출력
			//ln 없이 개행할 경우 print(~~ + "\n"); 
			// ctrl + shift + / (다중 주석) -> 해제 ctrl + shift + \
			// ctrl + / (한줄 주석) -> 해제 ctrl + /
		/*
		 * System.out.print("당신의 이름은 : " + userName + "\n");
		 * System.out.print("당신의 나이는 : " + userAge + "\n");
		 * System.out.print("당신의 주소는 : "+ userAddr + "\n");
		 * System.out.print("당신의 키는 : "+ userHeight + "\n");
		 * System.out.print("당신의 몸무게는 : " + userWeight + "\n");
		 * System.out.print("당신의 성별은 : " + userGender + "\n");
		 */
			
		/*
		 * System.out.printf("당신의 이름은 : %s \n" , userName);
		 * System.out.printf("당신의 나이는 : %d \n" , userAge);
		 * System.out.printf("당신의 주소는 : %s \n", userAddr);
		 * System.out.printf("당신의 키는 : %f \n", userHeight);
		 * System.out.printf("당신의 몸무게는 : %f \n " , userWeight);
		 * System.out.printf("당신의 성별은 : %c \n " , userGender);
		 */
			
			System.out.println("당신의 이름은 : " + userName);
			System.out.println("당신의 나이는 : " + userAge);
			System.out.println("당신의 주소는 : "+ userAddr);
			System.out.println("당신의 키는 : "+ userHeight);
			System.out.println("당신의 몸무게는 : " + userWeight);
			System.out.println("당신의 성별은 : " + userGender);
			
	}
}
