package com.kh;

import java.util.Scanner;

public class Exercise_Character {
	public static void main(String [] args ) { // ���� �޼ҵ�
		//Scanner ����Ʈ
		Scanner sc = new Scanner(System.in);
			// �Է�
			System.out.print("�̸��� �Է����ּ��� : ");
			String userName = sc.next();
			//�̸� : ȫ�浿
			System.out.print("���̸� �Է����ּ��� : ");
			int userAge = sc.nextInt();
			//���� : 22
			sc.nextLine(); //���� ����, ���� �ޱ�
			System.out.print("�ּҸ� �Է����ּ��� : ");
			String userAddr = sc.nextLine();
			//����� ���α�
			System.out.print("Ű�� �Է����ּ��� : ");
			double userHeight = sc.nextDouble();
			//185
			System.out.print("�����Ը� �Է����ּ��� : ");
			double userWeight = sc.nextDouble();
			//70 -> 70.0
			System.out.print("������ �Է����ּ��� : ");
			char userGender = sc.next().charAt(0);
			//���ڸ� �Է� �޴� �޼ҵ�� ���� �����Ƿ�
			//���ڿ��� �Է� �޴� �޼ҵ�� ����Ͽ� ���ڸ� �Է� ����
			//��
			System.out.println(); //����
			
			//���
			//ln ���� ������ ��� print(~~ + "\n"); 
			// ctrl + shift + / (���� �ּ�) -> ���� ctrl + shift + \
			// ctrl + / (���� �ּ�) -> ���� ctrl + /
		/*
		 * System.out.print("����� �̸��� : " + userName + "\n");
		 * System.out.print("����� ���̴� : " + userAge + "\n");
		 * System.out.print("����� �ּҴ� : "+ userAddr + "\n");
		 * System.out.print("����� Ű�� : "+ userHeight + "\n");
		 * System.out.print("����� �����Դ� : " + userWeight + "\n");
		 * System.out.print("����� ������ : " + userGender + "\n");
		 */
			
		/*
		 * System.out.printf("����� �̸��� : %s \n" , userName);
		 * System.out.printf("����� ���̴� : %d \n" , userAge);
		 * System.out.printf("����� �ּҴ� : %s \n", userAddr);
		 * System.out.printf("����� Ű�� : %f \n", userHeight);
		 * System.out.printf("����� �����Դ� : %f \n " , userWeight);
		 * System.out.printf("����� ������ : %c \n " , userGender);
		 */
			
			System.out.println("����� �̸��� : " + userName);
			System.out.println("����� ���̴� : " + userAge);
			System.out.println("����� �ּҴ� : "+ userAddr);
			System.out.println("����� Ű�� : "+ userHeight);
			System.out.println("����� �����Դ� : " + userWeight);
			System.out.println("����� ������ : " + userGender);
			
	}
}
