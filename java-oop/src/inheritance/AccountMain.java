package inheritance;

import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		MinusAccount maccount = new MinusAccount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력해 주세요");
		
		int money = scanner.nextInt();
		maccount.deposit(money);
	}
	
}
