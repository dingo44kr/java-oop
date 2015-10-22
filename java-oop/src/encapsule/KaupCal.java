package encapsule;

import java.util.Scanner;

public class KaupCal {
	/**
	 * To. 개발자님
	 * 사람의 이름, 몸무게, 키 입력하면
	 * 비만인지, 저체중인지 알려주는 카우프 프로그램 제작요청.
	 * 카우프 지수 = 몸무게를 키의 제곱으로 나눈 후 10000을 곱한 인덱스 값이랍니다.
	 * 
	 * 인덱스값 30 이상이면 비만
	 * 24 이상이면 과체중
	 * 20이상이면 정상
	 * 15이상이면 저체중
	 * 13이상이면 마름
	 * 10이상 영양실조
	 * 그 미만 소모증
	 * @return 
	 * 
	 */
	
	private String result = "";
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void kaupjisu() {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력해주세요");
	String name = scanner.next();
	System.out.println("몸무게를 입력해주세요");
	double weight = scanner.nextInt();
	System.out.println("키를 입력해주세요");
	double height = scanner.nextInt();
	
	int kaup = (int) (weight/(height*height)*10000);
	
	
	
		if (kaup >= 30) {
			result = "비만";

		} else if (kaup >= 24) {
			result = "과체중";
		} else if (kaup >= 20) {
			result = "정상";
		} else if (kaup >= 15) {
			result = "저체중";
		} else if (kaup >= 13) {
			result = "마름";
		} else if (kaup >= 10) {
			result = "영양실조";
		} else {
			result = "소모증";
		}
	} 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}
	
}
