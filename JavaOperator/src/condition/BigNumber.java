package condition;

import java.util.Scanner;

/*
 * @Date:2015.07.10
 * @Author:me
 * @Story: if-else 예제(큰 수 구하기)
 * */
public class BigNumber {
	public static void main(String[] args) {
		/*
		 문제 ) 학생 3명의 이름과 숫자를 입력 받아서 1등 출력
		 결과 ) 홍길동이 98점으로 1등입니다.
		 힌트 ) a 와 b 비교, b 와 c를 비교, a 와 c 를 비교
		 * */
		
		String first, second, third, topStudent="";
		int firGrade, secGrade, thirGrade, top=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("비교할 세 명의 이름을 입력 후, enter");
		first = scanner.next();
		second = scanner.next();
		third = scanner.next();
		/*
		 조건식을 따져서 결과를 가정하지 말고,
		 결과를 상상한 다음 거기에 맞는 조건식을
		 설정하세요.
		 * */
		
		System.out.println("비교할 세 명의 점수를 입력 후, enter");
		firGrade = scanner.nextInt();
		secGrade = scanner.nextInt();
		thirGrade = scanner.nextInt();
		
		if (firGrade>=secGrade && firGrade>=thirGrade) {
					top = firGrade;
					topStudent = first;
		}else if (secGrade>=thirGrade && secGrade>=firGrade) {
					top = secGrade;
					topStudent = second;
		}else if (thirGrade>=secGrade && thirGrade>=firGrade){
					top = thirGrade;
					topStudent = third;
		}
		System.out.println(topStudent+" 학생이 "+top+"점으로 1등입니다"); // 지변 출력 이용할 때 초기화를 해야 사용가능
	}
}
