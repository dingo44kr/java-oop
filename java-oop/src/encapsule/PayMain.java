package encapsule;
 /**
  * @file_name  : Pay.java
  * @author     : dingo44kr@gmail.com
  * @date       : 2015. 9. 23.
  * @story      : 월급에 따른 세금 구하기
  */
public class PayMain {
	//멤버 필드
	private final double TAX_RATE = 0.097; // 상수
	private int salary; // 인스턴스 (의) 변수
	private String name;
	private int tax;
	//멤버 메소드

	public PayMain(int salary, String name) {
		this.name = name;
		this.salary = salary;
		this.tax = (int) (salary * 0.097);
//	
//	public PayMain();
//	
//				
				
				
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	

	
}
