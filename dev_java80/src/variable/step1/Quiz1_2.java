package variable.step1;

import java.util.Scanner;

public class Quiz1_2 {
	double weight = 0.0;
	Scanner sc = null;
	public void run(double weight) {
		System.out.println("달에서의 몸무게는 "+weight*0.17+"kg 입니다.");
	}
	public static void main(String[] args) {
		Quiz1_2 q = new Quiz1_2();
		q.sc = new Scanner(System.in);
		System.out.print("몸무게를 입력하세요: ");
		q.weight = q.sc.nextDouble();
		q.run(q.weight);
	}

}
