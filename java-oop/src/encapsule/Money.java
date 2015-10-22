package encapsule;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) { // 보안을 하기 위해서는 private를 사용.

		Scanner scanner = new Scanner(System.in);
		MoneyMain money = new MoneyMain();
		System.out.println("금액을 입력하세요");
		int input = scanner.nextInt();
		// int arr = {1,2,3};
		// int arr = new int[3];
 		// String[] abc = {"5만원 2", "1만원 2", ...}
		
		String[] results = money.countMoney(input); // (input) 파라미터 = 매개변수 ->연결 해 주는 것.
		//results = money.countMoney(input)의 결과값을 String으로 프로모션(작은상자는 큰상자에 포함)하여 출력.
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}

	}
}
