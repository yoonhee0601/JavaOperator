package controller;

import ifCondition.ArithmeticCalc;
import ifCondition.CalcAvg;

public class OperatorController {
	public static void main(String[] args) {
		//2015.07.09 성적계산기
		CalcAvg avg = new CalcAvg();
		//avg.calcAvg();
		//2015.07.09 사칙연산계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		calc.calc();
	}
}
