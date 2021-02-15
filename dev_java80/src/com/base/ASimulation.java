package com.base;
/*
 * 
 * 
 * 
 * C언어는 초기화를 생략하면 쓰레기값을 출력한다.
 * 자바언어에서는 각 타입이 갖는 초기값이 정해져 있다.
 * int, long = 0
 * float, double = 0.0f, 0.0(d)
 * 
 */
public class ASimulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountA a = new AccountA();
		System.out.println("영어: "+a.eng);
		System.out.println("수학: "+a.math);
		System.out.println("국어: "+a.kor);
		System.out.println("==================");
		System.out.println("영어: "+a.eng1);
		System.out.println("수학: "+a.math1);
		System.out.println("국어: "+a.kor1);
		System.out.println("==================");
		System.out.println("영어: "+a.eng2);
		System.out.println("수학: "+a.math2);
		System.out.println("국어: "+a.kor2);
		AccountA a2 = new AccountA();
		a2.eng2 = 95;
		a2.math2 = 85;
		a2.kor2 = 75;
		System.out.println("==================");
		System.out.println("영어: "+a2.eng2);
		System.out.println("수학: "+a2.math2);
		System.out.println("국어: "+a2.kor2);
		//같은 타입이지만 서로 다른 내용과 메소드의 처리결과를 가질 수 있다.
		//인스턴스화를 할때마다 복제본이 여러개 생긴다.
	}

}
