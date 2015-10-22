package encapsule;

import java.util.Scanner;

/**
 * @file_name  : Money.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 금액을 입력하면 화폐단위별로 분류시키는 문제.
 */
public class MoneyMain {
	/**
	 * 예를 들어서 134,530 이면
	 * 거스름돈을 화폐로 표시해 주면 5만원: 2, 1만원: 3, 1천원: 4 ...
	 * 표시하고 10원 미만은 절삭
	 * @return 
	 */
	public String[] countMoney(int money) { // String 값을 반환한다는 의미.
		int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] moneyCount = new int[moneyUnit.length]; //
		String[] results = new String[moneyUnit.length];

		// 211,000원을 나눈다고 했을 때,
		for (int i = 0; i < moneyUnit.length; i++) {
			moneyCount[i] = money / moneyUnit[i];
			money = money % moneyUnit[i];
			results[i] = moneyUnit[i] + "원 권 " + moneyCount[i] + " 매"; // 이와 같은 int 타입을 더 큰타입인 스트링 타입으로 변경 할 수 있다. - 프로모션
			//5+"만원"+3 =>"5"+"만원"+"3" => "5만원3" // 프로모션 
		}
		return results; // 여기서 return results; 라는 것은 위의 for문에서 발생된 "results"라는 값을 Test의 알고리즘 결과값으로 그대로 output 해 준다는 것이다.
	}
}

