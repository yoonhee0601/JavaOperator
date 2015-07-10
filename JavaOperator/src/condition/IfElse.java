package condition;
/*
 * @Date:2015.07.08
 * @Author:me
 * @Story: if 연산자 문법
 * */
public class IfElse {
	public static void main(String[] args) {
		int x = 1, y = 2; // 지변 초기화
		if((x==1) && (y==1)){
			System.out.println("x 는 1 이면서, y 도  2이다.");
		}else if ((x==3)||(y==3)) { // || 컬럼 읽으시고 or 연산자
			System.out.println("x 는 1이거나, y 는 2이다.");
		}else{
			System.out.println("해당 사항이 없습니다.");
		}
	}
}
