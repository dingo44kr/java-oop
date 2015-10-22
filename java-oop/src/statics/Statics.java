package statics;

/**
 * @file_name : Statics.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 5.
 * @story : 스태틱 초기화 블록
 */
public class Statics {
	/**
	 * 스태틱 초기화 블록 - 생성자보다 먼저 호출되는 블록이다. A a = new A() 와 상관없이 초기화 작업을 위해 만들어진 블록
	 * 힙영역과 상관없이 스태틱 영역에서 초기화 되는 것이다.
	 */
	public static void main(String[] args) {
		System.out.println("main 타고 들어옴");
		Box box = new Box();
		Box box2 = new Box("생성자 = 오버로딩");
		System.out.println("스태틱 필드값" + Box.name2);
		Box.test(); // 스태틱 메소드 사용법 (바로 사용) -> Box 클래스의 함수들에 static이 붙어있기 때문에 이 메인메서드에서 바로 불러올 수 있는 것이다.
		box.test3(); // 인스턴스 메소드 사용법
		
	}
}

class Box {
	public static String name2 = " 한빛학원"; // static은 고정된 값이기 때문에 반드시 값이 할당되어야 한다.
	
	// 그렇다면, final 과 차이점은 무엇인가?
	// => 메모리에 저장되는 장소가 다르다. 또한 static은 먼저 메모리 공간을 점유한다.
	private String name;
	static String a; // 스태틱 변수
	String b; // 인스턴스 변수
	
	static String test2(){ // 스태틱 메소드
		return "";
	}
	String test3(){ //인스턴스 메소드
		return "인스턴스 메소드 리턴";
	}
	
	
	public Box() {
		System.out.println("기본 생성자");
	}

	public Box(String s) { // 생성자 오버로딩
		System.out.println("오버로딩 생성자");
	}

	public static void test() {
		System.out.println("스태틱 메소드");
	}
	
	static{
		System.out.println("스태틱 초기화 블록"); // 결국 static을 붙이냐 안붙이냐에 따라 결정, 쉽게 생각!
	}
	{
		System.out.println("인스턴스 초기화 블록");
	}
	
	public String getName() {
		return "한빛 인스턴스";
	}
}