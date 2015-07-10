package condition;

import java.util.Scanner;

/*
 * @Date:2015.07.10
 * @Author:me
 * @Story: switch 예제(남녀 판별)
 * */
public class ManOrWoman {
	public void ssn() {
		//선언부
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(예800101-2123456)");
		String ssn = scanner.next(), msg="";
		/*
		 charAt(n) 이 메소드는 0 부터 시작하여
		 n번째 글자 하나만 출력하는데,
		 출력결과를 프로그래밍에서는 리턴값이라고 한다.
		 위 예 값은 상황에서는 리턴값이 2가 된다.
		 * */
		char ch = ssn.charAt(7);
		/*
		 * ssn 의 체계
		 * 1,3 번 남자
		 * 2,4 번 여자
		 * 5번 외국인
		 * 잘못 입력한 값입니다.
		 * */
		//연산부
		switch (ch) {
		case '1':case '3': msg="남자입니다"; break; // char '1', String "1", int 1
		case '2':case '4': msg="여자입니다"; break;
		case '5': msg="외국인입니다"; break;
		default: msg="잘못 입력한 값입니다"; break;
		}
		//출력부
		System.out.println(msg);
	}
}
