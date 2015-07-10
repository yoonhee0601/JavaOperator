package condition;

import java.util.Scanner;
/*
 * @Date:2015.07.10
 * @Author:me
 * @Story: switch 예제(합격여부 구하기)
 * */
public class SwitchAvg {
	public void calc() {
		// 지역변수 선언부
		String name = "", enter = "";
		int kor = 0, eng = 0, math = 0, sum = 0, avg = 0;
		Scanner scanner = new Scanner(System.in);

		// 연산부
		System.out.println("이름을 입력하세요");
		name = scanner.nextLine();
		System.out.println("점수를 국어, 영어, 수학 순으로 입력하세요");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		sum = kor + eng + math;
		avg = sum / 3;
		
		// 아래부분을 switch-case 로 전환
		switch (avg/10) {
		case 10:case 9: enter="장학생"; break;
		case 8:case 7: enter="합격"; break;
		default: enter="불합격"; break;
		}
		// 출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + enter);
	}
}
