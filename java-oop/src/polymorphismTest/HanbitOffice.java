package polymorphismTest;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
		Admin service = AdminService.getInstance();
		// 인터페이스 객체 = new 인터페이스를 구현한클래스생성자
		// Collection / 최상위 인터페이스
		// 첫째아들 Set / 상속받은 인터페이스
		// 둘째아들 List / 상속받은 인터페이스
		
		// class HashSet implements Set{};
		// Set set(이름) = new HashSet();
		
		// class stack implements List{};
		// 둘째아들 List list(이름) = new stack();
		
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
				System.out.println(service.openAccount(accountNo, name, passWord, restMoney));
				break;
				
			case 2:
				System.out.println("검색할 계좌번호를 입력 해 주세요."); 
				int searchAccountNo = scanner.nextInt();
				System.out.println(service.searchAccountByAccountNo(searchAccountNo));
				break;
							
			case 3:
				System.out.println("검색할 이름을 입력해 주세요.");
				String searchName = scanner.next();
				Account[] result = service.searchAccountsByName(searchName); //배열을 받았으면 무조건 for문으로 출력해준다! 공식!
				for (int i = 0; i < result.length; i++) {
					System.out.println(result[i]);
				}
				
				break;
			case 4:
				System.out.println("총 계좌수는"+service.countAll()+"개 입니다.");
				break;
			case 5:
				System.out.println("해지할 계좌번호를 입력해 주세요.");
				int closeAccountNo = scanner.nextInt();
				System.out.println(service.closeAccount(closeAccountNo));
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
