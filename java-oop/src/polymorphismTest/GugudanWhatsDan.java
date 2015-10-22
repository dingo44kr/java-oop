package polymorphismTest;

import java.util.Scanner;

public class GugudanWhatsDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		int dan = scanner.nextInt();
		
		for (int i = 1; i < dan; i++) {
			System.out.println(dan+"*"+i +"="+dan*i);
		}
	}
}
