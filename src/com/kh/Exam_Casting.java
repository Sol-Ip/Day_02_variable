package com.kh;

public class Exam_Casting {
	public static void main(String [] args) {
		int a = 12;
		double d= 3.3;
		double result = a + d; //자동 형변환
		System.out.println(result); // int -> double
		System.out.println(); //한 줄 띄우기, 개행
	
		double dValue = 123.5;
		int iValue = (int)dValue;
		System.out.println("dValue :" + dValue + " iValue : " + iValue);
		System.out.println(); //개행
		
		System.out.println((char)('1'+'1'));
		System.out.println(); //개행
		
		int iNum = 2147483647;
		int sum = iNum + 1;
		System.out.println(sum);
		
		
	}
}
