package encapsule;

public class BigSmallJudge {

	public void judgeGrade(int[] input) { // 입력받은 5개의 점수값을 판단하는 함수를 만들어야된다, 6번
											// 라인에는 데이터의 형태와 이름만 들어가면됨.
		// TODO Auto-generated method stub

		int max = 0, min = 100; //

		for (int i = 0; i < input[i]; i++) {

			if (max < input[i]) {
				max = input[i];
			}
			if (min > input[i]) {
				min = input[i];
			}
		}

		System.out.println("최대값은: " + max + "\n" + "최소값은: " + min);

	}

}
