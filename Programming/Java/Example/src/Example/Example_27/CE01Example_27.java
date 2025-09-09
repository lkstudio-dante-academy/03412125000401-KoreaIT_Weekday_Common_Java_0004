package Example.Example_27;

/*
 * Java 제네릭 클래스 구현 방법
 * - class + 클래스 이름 + 제네릭 형식 인자 + 클래스 멤버 (Ex. 변수, 메서드 등등...)
 *
 * Ex)
 * class CSomeClass<T> {
 * 		private T m_tVal;
 *
 * 		public T someMethod() {
 * 			return m_tVal;
 * 		}
 * }
 *
 * CSomeClass<Integer> oSomeObjA = new CSomeClass<>();
 * CSomeClass<Float> oSomeObjB = new CSomeClass<>();
 *
 * 위와 같이 제네릭 클래스는 객체를 생성하는 시점에 자료형을 결정해줘야하며 제네릭 메서드와 달리 자료형을
 * 생략하는 것이 불가능하다. (+ 즉, 제네릭 클래스는 Java 컴파일러에 의해서 자료형이 자동적으로
 * 결정되지 않는다는 것을 알 수 있다.)
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Example 27 (제네릭 - 2)
 */
public class CE01Example_27 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		CList_Array<Integer> oListValuesA = new CList_Array<>();
		CList_Linked<Integer> oListValuesB = new CList_Linked<>();
		
		for(int i = 0; i < 10; ++i) {
			int nVal = oRandom.nextInt(1, 100);
			
			oListValuesA.addVal(nVal);
			oListValuesB.addVal(nVal);
		}
		
		System.out.println("=====> 리스트 <=====");
		System.out.println(oListValuesA);
		System.out.println(oListValuesB);
		
		System.out.print("\n정수 입력 (추가) : ");
		int nVal_Insert = oScanner.nextInt();
		
		oListValuesA.insertVal(0, nVal_Insert);
		oListValuesB.insertVal(0, nVal_Insert);
		
		System.out.println("\n=====> 리스트 - 추가 후 <=====");
		System.out.println(oListValuesA);
		System.out.println(oListValuesB);
		
		System.out.print("\n정수 입력 (제거) : ");
		int nVal_Remove = oScanner.nextInt();
		
		oListValuesA.removeVal(nVal_Remove);
		oListValuesB.removeVal(nVal_Remove);
		
		System.out.println("\n=====> 리스트 - 제거 후 <=====");
		System.out.println(oListValuesA);
		System.out.println(oListValuesB);
	}
}
