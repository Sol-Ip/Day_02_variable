package com.kh;

public class Exam_03 {

	public static void main(String [] args) {
	System.out.println (1 +1);  // 2
	System.out.println (1.1 + 1.1); // 2.2
	System.out.println ('1' + '1'); 
	// 98, 문자열 '1'=> 49 따라서 49 + 49
	System.out.println ("1" + "1"); // 11
	System.out.println ("Hello" + 'q'); // Helloq
	System.out.println ("Hello" + 3.14); // Hello3.14
	
	System.out.println (10 + 20 + "Hello"); //30Hello
	System.out.println (10 + "Hello" + 20); //10Hello20
	System.out.println ("Hello" + 10); //Hello10
	System.out.println (10 + "Hello"); //10Hello
	System.out.println (10 + (20 + "Hello"));//1020Hello
	// 문자열의 위치는 상관 없고 문자열이 있을 경우,
	// 문자열로 인식 됨
	
	}
}
