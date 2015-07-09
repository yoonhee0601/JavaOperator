package ifCondition;

import java.util.Scanner;

/*
 * @Date:2015.07.09
 * @Author:me
 * @Story: if-else 예제
 * 		프로그램을 하나 개발해야 합니다.
 * 오더는
 * 학생		국어		 영어		수학		총점		평균		합격여부
 * --------------------------------------------------------
 * (홍길동)	(90)	(90)	(90)	(270)	(90)	(장학생)
 * 
 * 평균이 90점 이상이면 장학생
 * 평균이 70점 이상 - 90점 미만이면 합격
 * 평균이 70점 미만이면 불합격
 * */

public class CalcAvgMain {
	public static void main(String[] args) {

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

		if (avg >= 90) {
			enter = "장학생";
		} else if (avg >= 70 && avg < 90) {
			enter = "합격";
		} else {
			enter = "불합격";
		}

		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + enter);
	}
}
