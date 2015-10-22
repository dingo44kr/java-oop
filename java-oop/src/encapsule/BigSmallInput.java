package encapsule;

import java.util.Scanner;

public class BigSmallInput {

	private int[] input = new int[5];

	public int[] getInput() {
		return input;
	}
	public void setInput(int[] input) {
		this.input = input;
	}
		
	public void inputPoint() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력 해 주세요.");
		
		
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
			
		}
	}
}
