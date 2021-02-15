package variable.step1;

import java.util.Scanner;

public class Quiz2_2 {
	int n = 0;
	int sum = 0;
	Scanner sc = null;
	public void run(int n) {
		for(int i=1;i<=n;i++)
			sum += i;
		System.out.println("1부터 "+n+"까지의 합계는 "+sum+"입니다.");
	}
	public static void main(String[] args) {
		Quiz2_2 q = new Quiz2_2();
		System.out.print("정수를 입력하세요: ");
		q.sc = new Scanner(System.in);
		q.n = q.sc.nextInt();
		q.run(q.n);
	}

}
