package ifCondition;

/*
 * @Date:2015.07.08
 * @Author:me
 * @Story: If 만 있는 구문에 관한 문법
 * */
public class AntiPatternOnlyif {
	public static void main(String[] args) {
		/*
		 구문 (statement)
		 자바 연산식에서 3가지 종류의 구문으로 나뉜다.
		 1.조건문
		 	if, if-else, switch
		 2.반복문
		 	while, do=while, for
		 3.기타구문
		 	continue, break, return
		 * */
		int x=1, y=2;// 지변 초기화
		if (x==y) { // 숫자값의 비교 연산자는 ==
			System.out.println("숫자 x 와 y의 값은 같다");
		}
		if (x != y) { // !는 부정(not) 
			System.out.println("숫자 x 와 y의 값은 다르다");
		}
		if (x > y) {
			System.out.println("숫자 x 는 y의 값보다 크다");
		}
		if (x < y) {
			System.out.println("숫자 x 는 y의 값보다 작다");
		}
		if (x >= y) {
			System.out.println("숫자 x 는 y의 값보다 크거나 같다");
		}
		if (x <= y) {
			System.out.println("숫자 x 는 y의 값보다 작거나 같다");
		}
	}
}
