package problem02;

public class Main {

	public static void main(String[] args) {
		String[] expressions = { "3 + 4", "12 * 4", "8 / 2", "10 - 2" };

		for (String expression : expressions) {
			String[] tokens = expression.split(" ");

			String arith = tokens[1];// 사칙연산
			int num1 = Integer.parseInt(tokens[0]);// 첫번재 수
			int num2 = Integer.parseInt(tokens[2]);// 두번째 수

			System.out.println(getInstance(arith).calculate(num1, num2));

			// num1, num2, arith 세 개의 변수와 getInstance 메소드를 사용하여
			// 문제의 결과화면에 맞게 출력하는 계산기 나머지 코드를 아래에 완성 하십시오.
			// 주어진 코드는 수정하지 않습니다.

		}
	}

	public static Arithmetic getInstance(String arith) {
		// 기호에
		if (arith.equals("+")) {
			Add add = new Add();
			return add;
		} else if (arith.equals("*")) {
			Mul mul = new Mul();
			return mul;
		} else if (arith.equals("/")) {
			Div div = new Div();
			return div;
		} else {
			Sub sub = new Sub();
			return sub;
		}

	}
	
	public static class Add implements Arithmetic{

		@Override
		public int calculate(int a, int b) {
			return a+b;
		}
		
	}
	public static class Sub implements Arithmetic{

		@Override
		public int calculate(int a, int b) {
			return a-b;
		}
		
	}
	public static class Mul implements Arithmetic{
		@Override
		public int calculate(int a, int b) {
			return a*b;
		}
		
	}
	public static class Div implements Arithmetic{
		@Override
		public int calculate(int a, int b) {
			return a/b;
		}
		
	}
}