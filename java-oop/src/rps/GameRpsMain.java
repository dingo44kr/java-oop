package rps;

import java.util.Scanner;

public class GameRpsMain {
	/**
	 * [결과]
	 * 컴퓨터는 바위고 당신은 가위이므로 컴퓨터가 이겼습니다.
	 */
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다.");
		GameRps rps = new GameRps();
		GameRpsService service = new GameRpsServiceImpl(); // 깊은 복사(deep copy)
		GameRpsValidation valid = new GameRpsValidation();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("가위:1 바위:2 보자기:3 을 입력하세요");
			int userVal = scanner.nextInt();
			rps.setRpsVal(userVal);
			
			}
			
			}
		}
