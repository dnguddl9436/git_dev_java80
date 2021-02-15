package com.base;

public class AccountA {
	//전역변수의 경우 초기화를 생략할 수 있다.
	double kor = 0;
	double math = 0;
	double eng = 0;
	double kor1;
	double math1;
	double eng1;
	
	double kor2 = 70;
	double math2 = 80;
	double eng2 = 90;
	void methodA() {
		/* 지역변수이다.
		 * double kor = 70;
		 * double math = 80;
		 * double eng = 90;
		 */
		kor 	= 70;
		math 	= 80;
		eng 	= 90;
	}
}
