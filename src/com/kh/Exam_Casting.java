package com.kh;

public class Exam_Casting {
	public static void main(String [] args) {
		int a = 12;
		double d= 3.3;
		double result = a + d; //�ڵ� ����ȯ
		System.out.println(result); // int -> double
		System.out.println(); //�� �� ����, ����
	
		double dValue = 123.5;
		int iValue = (int)dValue;
		System.out.println("dValue :" + dValue + " iValue : " + iValue);
		System.out.println(); //����
		
		System.out.println((char)('1'+'1'));
		System.out.println(); //����
		
		int iNum = 2147483647;
		int sum = iNum + 1;
		System.out.println(sum);
		
		
	}
}
