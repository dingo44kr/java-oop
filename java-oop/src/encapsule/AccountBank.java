package encapsule;

import java.util.Scanner;

public class AccountBank {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	while (true) { // 무한루프를 사용할 때는 WhileLoop을 사용한다.
		System.out.println("원하는 업무를 선택해주세요\n "
				+ "1: 통장개설 2: 잔액조회 3: 입금 4: 출금 5: 정지");
		int key = scanner.nextInt();
		
		switch (key) {
		case 1:  // 통장개설
			
			break;
		case 2: // 잔액조회
			break;
		case 3: // 입금
			break;
		case 4: // 출금
			break;
		case 5: // 정지
			return;

		default: break;
		}
		
		}

	
	}
}