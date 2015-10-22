package encapsule;

import java.util.Scanner;

/**
 * @file_name  : kaup.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 24.
 * @story      : 체중에 관한 비만, 저체중, 과체중을 구하기.
 */

public class Kaup {
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
	 * 
	 */
	public static void main(String[] args) {
		
		KaupCal kaupcal = new KaupCal();
		
		kaupcal.kaupjisu();
		System.out.println(kaupcal.toString());
		
		
	}
}

