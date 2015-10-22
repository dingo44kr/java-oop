package person;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 * @file_name : PersonMain.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 6.
 * @story : String 클래스 예제
 */
public class PersonMain {
	public static void main(String[] args) {
		/**
		 * Person 클래스에 String 타입의 인자값을 받는 생성자가 없어서 에러가 났습니다.
		 */
		/**
		 * 중요! 클래스는 주소값이 없고, 객체는 주소값을 갖는다.
		 * 주소값은
		 * A : 65 => 101010101010(임의의 수), 아스키 코드로 매핑
		 * B : 66
		 * ㄱ : (임의의 수), 아스키 코드로 매핑.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		Person p1 = new Person("800101-1234567"); // 800101-1234567
		Person p2 = new Person("800101-1234567");
		
		String s1 = new String("800101-1234567"); //비추 -> 메모리 낭비
		String s2 = new String("800101-1234567");
		
		String s3 = "800101-1234567"; // 새로 주소값을 지정합니다.
		String s4 = "800101-1234567"; // s4는 s3에 지정된 주소값을 그대로 할당받는다.
		char s5 ='A'; // 65번 주소를 할당
		String s6 = "AB"; // 6566 번지에 저장
		String s7 = "AB"; // 6567 번지 저장하지 않고 6566번지의 "AB"의 주소값을 s7에 할당 (s7은 "AB"의 주소를 불러온다)
		
		// == 레퍼런스 비교(내부 숫자(주소)비교)
		// equals() 밸류 비교 (내부 문자(값) 비교)
		
		
		Test t = new Test("800101-1234567");
		if (p1.getSsn()==t.getSsn()) {
			System.out.println("정말 상수풀 주소를 참조하는 것이 맞구나");
		} else{
			System.out.println("모든 것은 거짓말이었다.");
		}
		
		
		if (p1.equals(p2)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다른 클래스 객체입니다.");
		}
		if (p1.equals(t)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다른 클래스 객체입니다.");
		}
		
	
		
		
		
		
		
//		Date today = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String comp = p1.getSsn().substring(0, 2);
//		int com = Integer.parseInt(comp);
//		int tod = Integer.parseInt(sdf.format(today));
		int ageformula = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - Integer.parseInt(comp);
		int age = ageformula-1900;
		/**
		 * p1과 p2가 동일인물인지 체크하는 로직을 완성하세요.
		 * 단, 삼항연산자로 처리.
		 * 현재 2015년 입니다.
		 * 현재 p1 의 나이는 몇살입니까 ?
		 * 결과물은
		 * [ p1 과 p2 는 동일 인물이며, 나이는 **살입니다. ] 
		 */
		System.out.println(p1.getSsn().equals(p2.getSsn()) ? "용의자1과 용의자2는 동일 인물이며, 나이는 만"+age+"살 입니다." : "용의자1과 용의자2는 다른사람이다.");
	}
}

class Person {
	private String ssn; // 주민번호
	private String age; // 나이
	private String name; //

	public Person(String ssn) { // 태어나자마자 주민번호를 부여받는다.
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return true;
		} else {
			return false;

		}
	}
}



class Test{
	private String ssn;
	public Test(String ssn){
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
}
