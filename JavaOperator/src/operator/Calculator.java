package operator;
/*
 * @Date:2015.07.08
 * @Author:me
 * @Story: 이항 연산자 문법 연습문제
 * */
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너로 두 값을 입력받아서
		 * 사칙연산 결과가 나오도록 하시오.
		 * 20 + 7 = 27
		 * 20 * 7 = 140
		 * */
		
		//연산에 쓸 재료들을 준비하는 선언부
		Scanner scanner = new Scanner(System.in);
		int x=0, y=0, add=0, sub=0, 
				gob=0, mok=0, nmg=0;//지역변수는 디폴트값을 초기화
		
		//연산부
		System.out.println("연산할 두 값을 입력하시오");
		x = scanner.nextInt();// next 커서 다음 글자(숫자)를 변수 
		y = scanner.nextInt();
		add = x + y;
		sub = x - y;
		gob = x * y;
		mok = x / y;
		nmg = x % y;
		System.out.println(x+"+"+y+"=\t"+ add);
		System.out.println(x+"-"+y+"=\t"+ sub);
		System.out.println(x+"*"+y+"=\t"+ gob);
		System.out.println(x+"/"+y+"=\t"+ mok);
		System.out.println(x+"%"+y+"=\t"+ nmg);
	}
}
