package com.kh;

import java.util.Scanner;

public class Exam_Scanner {
	public static void main(String [] args) {
		// ctrl + �����̽���
	Scanner sc = new Scanner(System.in);
		//�Է�
		System.out.print("int�� �Է����ּ��� :");
		//System.out.println(sc.nextInt());
		int iNum = sc.nextInt();
		
		System.out.print("float�� �Է����ּ��� : ");
		float fNum = sc.nextFloat();	
		System.out.print("Double�� �Է����ּ��� : ");
		double dNum = sc.nextDouble();
		System.out.print("char�� �Է����ּ��� : ");
		char ch = sc.next().charAt(0);
		//sc.netx()�� ���ڿ��� �Է��� �ް�
		//charAt(0)�� �Է¹��� ���ڿ� �� �� ���ڸ�(�ϳ�)�� ������
		
		//���ڿ� �Է¹ޱ�
		// 1. sc.next() : ������ �Է¹��� ����
		// ȫ �� �� -> ȫ, �̸� �Է� ���� ��
		// 2. sc.nextline() : ����, ������ �Է¹���
		// ȫ �� �� -> ȫ �� ��, �ּ� �Է� ���� ��
		sc. nextLine(); //���� ����
		System.out.print("String�� �Է����ּ��� : ");
		String str = sc.nextLine();
		System.out.println(); //����
		//���
		System.out.println("�Է��� int�� :" + iNum);
		System.out.println("�Է��� float�� :" + fNum);
		System.out.println("�Է��� double�� :" + dNum);
		System.out.println("�Է��� char�� :" + ch);
		System.out.println("�Է��� String�� : " + str);
	}
}
