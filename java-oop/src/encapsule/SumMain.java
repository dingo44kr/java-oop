package encapsule;

import java.util.Scanner;

/**
 * @file_name  : SumMain.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 23.
 * @story      : 입력받은 두 수 사이의 값을 모두 더해서 반환해라.
 */
public class SumMain {
	public static void main(String[] args) {
		Sum sum = new Sum();
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2  = 0, result = 0;
		System.out.println("두 수를 입력하세요.");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		sum.setNum1(num1);
		sum.setNum2(num2); // 알아서 sum 가서 num1 하고 num2 대입이 되는거고
		sum.calc(); // 순수한 계산기 역할을 해줌.
		//생성자로 표현하기 위해서는 ? -> 한번 해보기
	
		
		System.out.println(sum.toString());
		
		
	}
}
