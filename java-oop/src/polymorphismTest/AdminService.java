package polymorphismTest;
/**
 * @file_name : AdminService.java
 * @author : dingo44kr@naver.com
 * @date : 2015. 9. 30
 * @story : 통장 관리 함수들
 */
public class AdminService implements Admin {
	private Account[] accountList;
	private int count=0;
	private static Admin instance = new AdminService();
	
	public static Admin getInstance() {
		return instance;
	}
	
	
	public AdminService() {
		this(0);
	}
	public AdminService(int count) {
		accountList = new Account[count];
	}
	
	
	public Account[] getAccountList() {
		return accountList;
	}


	public int getCount() {
		return count;
	}


	public void setAccountList(Account[] accountList) {
		this.accountList = accountList;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	

	@Override
	public String openAccount(int accountNo, String name, String passWord, int restMoney) {
		Account account = new Account();
		String msg = "";
		account.setAccountNo(accountNo);
		account.setOwnerName(name);
		account.setRestMoney(restMoney);
		account.setPassword(passWord);
		accountList[count] = account;
		count++;
		msg = account.toString();
		return msg;
		}

	@Override // 계좌번호로 검색
	public Account searchAccountByAccountNo(int searchAccountNo) {
		Account searchAccount = null;
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getAccountNo() == (searchAccountNo)) {
				searchAccount = accountList[i]; //searchAccount에 accountList를 복사
			} else {
				System.out.println("해당 계좌번호는 존재하지 않습니다.");
			}
		}
		return searchAccount;
	}

	@Override // 이름으로 검색
	public Account[] searchAccountsByName(String searchName) {
		int tempCount = 0;  //searchCountByName(name);
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(searchName)) {
				tempCount++;
			}
		}
		Account[] tempList = new Account[tempCount];
		tempCount = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(searchName)) {
				tempList[tempCount++] = accountList[i];
			}
			
		}
		return tempList;
	}
//
//	private int searchCountByName(String name) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	@Override
	public String closeAccount(int closeAccountNo) {
		String result = "입력하신 계좌는 존재하지 않습니다.";
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo()==(closeAccountNo)) {
				accountList[i] = accountList[count-1];
			result = "입력하신 계좌는 해지되었습니다.";
			count--;
			}
		}
		return result;
	}

	@Override
	public int countAll() {
		return getCount();
	}
	

}
