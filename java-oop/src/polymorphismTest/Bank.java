package polymorphismTest;
/**
 * 
 * @file_name  : Bank.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 25.
 * @story      :
 */
public interface Bank {
	
	
	// 1. 개설
	public String open(int password, String accountName);
	
	// 2. 입금
	public String deposit(int inMoney); // 추상메소드	

	// 3. 출금
	public String withdraw(int outMoney);
	
	// 4. 조회
	public String search();
	
	
	
}
