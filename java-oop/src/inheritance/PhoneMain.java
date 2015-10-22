package inheritance;

import java.util.Scanner;

/**
 * @file_name : Phone.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 9. 30.
 * @story : 상속예제
 */
public class PhoneMain { // 가장메인, 한녀석만 있어야됨.
	// 프로젝트 > 패키지 > 클래스 > 메서드 > 구문
	/**
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 인스턴스 => 참조변수
		Phone androidPhone = new AndroidPhone();
		System.out.println("구매할 사이즈 선택");
		String size = scanner.next();
		System.out.println("안드로이드폰으로 통화할 사람");
		String name2 = scanner.next();
		System.out.println("보낼 메시지 입력");
		String msg2 = scanner.next();
		((AndroidPhone) androidPhone).setData(msg2, name2, size);
		System.out.println(((AndroidPhone) androidPhone).getData());		
		
		
		
		System.out.println("===================");
		Phone iphone = new Iphone();
		System.out.println("아이폰으로 통화할 사람");
		String name = scanner.next();
		System.out.println("보낼 메시지 입력");
		String msg = scanner.next();
		((Iphone) iphone).setData(msg, name);
		System.out.println(((AndroidPhone) iphone).getData());
		
		
		
		System.out.println("==================");
		Phone nokia = new Celphone();
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany()+"를 사용");
		System.out.println("휴대폰으로 통화할 사람");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
		System.out.println("=====================");
		Phone phone = new Phone(); // 타입 인스턴스(객체) = new 생성자
		phone.setCompany("삼성 집전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람");
		phone.setCall(scanner.next());
		System.out.println(phone.getCall());
	}
}

class Iphone extends Celphone{
	private String data; // 인스턴스 변수
	public static String BRAND = "아이폰"; // static 은 고정된 이란 의미로 // 아이폰이라는 브랜드 이름은 바꿀 수 없다.
	// static 이 붙은 변수는 클래스변수라고도 한다. // "건물"
	public static boolean TRUE = true;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void setData(String data, String name) { // 오버로딩("추가 적재", 책 참조)
		super.setCompany(BRAND); // 부모님것을 그대로 가져온다(튜닝도 안하고) super. // 애플은 여러브랜드를 만들지 않고 무조건 아이폰이라 한다.(static)
		super.setPortable(TRUE); // 애플은 집전화기는 안만들고 무조건 휴대폰만 만든다.
		super.setCall(name);
		this.data = super.getCompany()+"\t" 
				+super.isPortable()+"\t"
				+ super.getCall() + "\t" 
				+ data + " : 메시지 전달";
	}
}

class AndroidPhone extends Iphone{
	public static String BRAND = "안드로이드폰"; // 오버라이딩
	private String size;
	private String data;
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setData(String data, String name, String size) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.setSize(size);
		this.data = super.getCompany()+"\t"
				+	super.isPortable()+"\t"
				+	super.getCall()+"\t"
				+	"대화면" +this.getSize()+"로 볼 수 있음\t"
				+	data+" : 카톡메시지 전달";
	}

	
	@Override
	public String getData() {
		return data;
	}
	
	
	
}

class Phone {
	private String company, call; // 인스턴스(의) 변수 => 힙영역으로
	// ALT + SHIFT + S + R = 겟터셋터
	final static double TAX_RATE = 0.095; // 스태틱 변수 => Global variable 전역변수
											// (지역변수의 반대개념) => 스태틱 영역으로
	// 이 TAX_RATE는, 프로젝트 전역에 영향을 미친다.

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company; // 지역(의) 변수 Or (메서드의 변수) =>스택이라는 영역으로...
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
}

class Celphone extends Phone {
	private boolean portable; // 이동성... 가지고 다닐 수 있느냐 없느냐?
	private String move;
	
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		this.portable = portable;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
}