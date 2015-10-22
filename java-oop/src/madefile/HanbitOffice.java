package madefile;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
		AdminService service = new AdminService(1000);
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("관리자화면 : 1.계좌개설 2.검색(계좌번호) 3.검색(이름) 4.총계좌수 5.해지 6.종료");
			int key = scanner.nextInt();
			
			switch (key) {
			case 1:
				System.out.println("계좌번호입력 6자리");
				int accountNo = scanner.nextInt();
				System.out.println("이름 입력");
				String name = scanner.next();
				System.out.println("비밀번호 입력");
				String passWord = scanner.next();
				System.out.println("입금액 입력");
				int restMoney = scanner.nextInt();
				service.openAccount(accountNo, name, passWord, restMoney);
				System.out.println(service.openAccount(accountNo, name, restMoney));
				break;
				
			case 2:
				System.out.println("검색할 계좌번호를 입력 해 주세요."); 
				int accountNo1 = scanner.nextInt();
				service.searchAccountByAccountNo(accountNo1);
				System.out.println(service.searchAccountByAccountNo(accountNo1));
				break;
							
			case 3:
				System.out.println("검색할 이름을 입력하여 주세요.");
				String searchname = scanner.next();
				service.searchAccountsByName(searchname);
				System.out.println(service.searchAccountsByName(searchname));
				break;
			case 4:
				
				
				break;
			case 5:
				break;	
			case 6:
				return;
			default:
				System.out.println("입력이 잘못되었습니다. 하실 업무를 다시 입력해주세요");
				break;

			}

		}
	}
}
