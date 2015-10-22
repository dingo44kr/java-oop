package encapsule;

import java.util.Scanner;

/**
 * @file_name  : BigSmallMain.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 23.
 * @story      : 최대로 5개의 값을 입력하고 제일 큰값과 작은 값을 구해내는 프로그램.
 */
public class BigSmallMain {
	public static void main(String[] args) {
		
		BigSmallJudge judge = new BigSmallJudge();
		BigSmallInput input = new BigSmallInput();
		
		
		input.inputPoint();			//점수입력 함수호출
		
		judge.judgeGrade(input.getInput());  //최대 최소값 판별 함수 호출
		
		
		
		//System.out.println(judge.toString());	//결과값 호출(최대 최소값 판별한 결과)
		
		
		
	}
	
}
