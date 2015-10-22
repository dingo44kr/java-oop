package abstraction;
/**
 * @file_name  : Himart.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 1.
 * @story      : 하이마트
 */
public class Himart {
	public static void main(String[] args) {
		
		TV tv = new TV();
		tv.setTvInfo("LG", "TV", "lg1234", "50인치", "올레드");
		Computer computer = new Computer();
		computer.setComputerInfo("삼성", "컴퓨터", "sm1234", "512GHz", "8G", "1TB");
		SmartPhone phone = new SmartPhone();
		phone.setSmartPhoneInfo("샤오미", "스마트폰", "s-1234", "1024만화소", "500g");
		Product[] cart = new Product[3];
		cart[0] = tv;
		cart[1]	= computer;
		cart[2]	= phone;
		
		for (int i = 0; i < cart.length; i++) {
			System.out.println(cart[i].display());
		}
	}
}
