package encapsule;

import java.util.Scanner;

/**
 * @file_name  : MaxMinMain.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 22.
 * @story      : 최고점, 최저점 구하기
 */
public class MaxMin {
	private static String max;
	private static String min;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생들 평균 점수를 입력하시면 1등과 최고점, 최저점이 출력됩니다.");
		System.out.println("단, 정원은 5명입니다.");
		
		
		int max = 0; 
		int min = 10000;
		
		int [] input = new int[5]; // 데이터 타입 int형의 배열'[]' input 안에 new int[n]개의 공간을 만들어 준다 라는 의미.  
		for (int i = 0; i < input.length; i++) // input.length;라는 것은 여기서 i값이 5까지 있다는 것을 의미(공간 = new int[5])
			{input[i] = scanner.nextInt();
			
			if (max<input[i]) { //이렇게 생각을 해야한다. // input[i]가 지속적으로 변하고, input[i]가 더 컸을 때 max 값은 지속적으로 변한다.(더 큰값으로)
				max = input[i];//50//30//20//10
			}
			if (min>input[i]) { //input[i]의 값이 계속 변하고 그 값이 min보다 작을 때, min은 input[i]로 지속 변환
				min = input[i];
				
			
			} 
		}
		System.out.println("최고값은 "+ max +" 입니다." + "최저점값은 "+min+" 입니다.");//처음에는 max = 50, min 50
		
		
		}			
	}	
				

