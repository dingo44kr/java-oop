package encapsule;

import java.util.Scanner;

/**
 * @file_name  : MaxMinMain.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 22.
 * @story      : 최고점, 최저점 구하기
 */
public class MaxMin1Seed {
	/**
	 * "학생들 평균 점수를 입력하시면 1등과 최고점, 최저점이 출력됩니다."
	 * "단, 정원은 5명입니다."
	 *  Seed 
	 */
	
	String result = "";
	int [] avg = new int[5];

	public void ScanStudent() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < avg.length; i++) {
			System.out.println("평균 점수를 입력하세요");
			avg[i] = scanner.nextInt();
		}
	}

	public String MaxMin1Cal(int[] avg) {
		// TODO Auto-generated method stub
		int max = 0, min = 100;
		for (int i = 0; i < avg.length; i++) {
			if (max < avg[i]) {
				max = avg[i];
			}
			if (min > avg[i]) {
				min = avg[i];
			}
			
		}
		result = "최고값은" + max + "이며" + "\n" + "최저값은" + min + "입니다.";

		return result; // result를 반환한다.

	}
}
