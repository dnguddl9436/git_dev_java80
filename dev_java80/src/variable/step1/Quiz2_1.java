package variable.step1;

import java.util.Scanner;

public class Quiz2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		System.out.print("정수를 입력하세요: ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
			sum += i;
		System.out.println("1부터 "+n+"까지의 합계는 "+sum+"입니다.");
	}

}
