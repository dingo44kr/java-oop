package encapsule;

import java.util.Scanner;

/**
 * @file_name  : Factor.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 22.
 * @story      : 약수 알고리즘
 */
public class FactorMainBean1 {
	public int[] main() {
		
		int dest = 0;	
		
		int[] result = new int[dest];
		int[] arr = new int[dest];
		int divisor = 0;
		
		for (int i = 1; i <= dest; i++) {
			// 6을 넣엇을 때 1,2,3,6이 나오게하려면...
			int x = i;
			if (dest % x == 0) {
				divisor = dest / x; // 이 식은, 약수의 출력
				result[dest] = (divisor);
			}
		}

		return result;
	}
}
