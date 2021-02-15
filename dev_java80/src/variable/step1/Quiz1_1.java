package variable.step1;

import java.util.Scanner;

public class Quiz1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게를 입력하세요: ");
		double weight = sc.nextDouble();
		System.out.println("달에서의 몸무게는 "+weight*0.17+"kg 입니다.");
	}

}
