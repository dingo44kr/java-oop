package madefile;
/**
 * @file_name : AdminService.java
 * @author : dingo44kr@naver.com
 * @date : 2015. 9. 30
 * @story : 통장 관리 함수들
 */
public class AdminService implements Admin {
	private Account[] accountList;
	private int count;
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
	public Account searchAccountByAccountNo(int accountNo1) {
		Account searchAccount = null;
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getAccountNo() == (accountNo1)) {
				searchAccount = accountList[i];
			} else {
				System.out.println("해당 계좌번호는 존재하지 않습니다.");
			}
		}
		return searchAccount;
	}

	@Override // 이름으로 검색
	public Account[] searchAccountsByName(String searchname) {
		int tempCount = 0;  //searchCountByName(name);
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(searchname)) {
				tempCount++;
			}
		}
		Account[] tempList = new Account[tempCount];
		tempCount = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(searchname)) {
				tempList[tempCount++] = accountList[i];
			}

		}

//		// 여러분이 완성하세요
//			tempCount++;
		return tempList;
	}

	private int searchCountByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		Account removeAccount = null;
		String result = "요청하신 해지건이 완료되었습니다.";
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo()==(accountNo)) {
				removeAccount = accountList[i];
				count--;
			}
		}
		return result;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String openAccount(int accountNo, String name, int restMoney) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
