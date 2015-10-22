package abstraction;

/**
 * @file_name : Product.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 1.
 * @story : 제품을 추상클래스로 만든 예제
 */
public abstract class Product { // 추상클래스는 상속을 하기 위해서 만들어진 클래스이다.
	// public final String A = "a"; 상수는 모두가 볼 수 있어야 된다.
	// protected int aa;
	protected String company, name, serialNo;
	
	public void setProductInfo(String company, String name, String serialNo){ // {바디&블록이라 함} // 구상메소드 concrete method
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	
	public abstract String display(); // 추상메소드 abstract method (바디가 없기 때문에)
}
