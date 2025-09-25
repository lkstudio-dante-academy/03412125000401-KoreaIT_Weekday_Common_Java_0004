package Training.Training_17;

/*
 * Java 연습 문제 17
 * - 경우의 수 출력하기
 * - 서로 다른 가격의 물건 3 개가 존재한다 (+ Ex. 50 원, 250 원, 500 원)
 * - 사용자로부터 소지 금액을 입력 받는다
 * - 입력 받은 소지 금액 모두 소비해서 구입 할 수 있는 물건의 조합을 모두 출력한다
 *
 * Ex)
 * 소지 금액 입력 : 1000
 *
 * =====> 구입 가능 조합 <=====
 * 물건 A x 0 개, 물건 B x 0 개, 물건 C x 2 개
 * 물건 A x 0 개, 물건 B x 1 개, 물건 C x 1 개
 * ...이하 생략
 */

import java.util.Scanner;

/**
 * Training 17
 */
public class CT01Training_17 {
	/** 초기화 */
	public static void start(String[] args) {
		final int PRICE_STUFF_A = 50;
		final int PRICE_STUFF_B = 250;
		final int PRICE_STUFF_C = 500;
		
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("소지 금액 입력 : ");
		int nAmount = oScanner.nextInt();
		
		System.out.println("\n=====> 구입 가능 조합 <=====");
		
		for(int i = 0; i <= nAmount; i += PRICE_STUFF_A) {
			for(int j = 0; j <= nAmount; j += PRICE_STUFF_B) {
				for(int k = 0; k <= nAmount; k += PRICE_STUFF_C) {
					// 조합이 불가능 할 경우
					if(i + j + k != nAmount) {
						continue;
					}
					
					int nNumStuffsA = i / PRICE_STUFF_A;
					int nNumStuffsB = j / PRICE_STUFF_B;
					int nNumStuffsC = k / PRICE_STUFF_C;
					
					String oMsgA = String.format("물건 A x %d 개", nNumStuffsA);
					String oMsgB = String.format("물건 B x %d 개", nNumStuffsB);
					String oMsgC = String.format("물건 C x %d 개", nNumStuffsC);
					
					System.out.printf("%s, %s, %s\n", oMsgA, oMsgB, oMsgC);
				}
			}
		}
	}
}
