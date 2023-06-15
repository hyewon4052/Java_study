import java.util.Scanner;

class IfExam2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		char op;	// +:43, -:45, *:42, /:47
//		System.out.println((int)op); 
		int a = 20, b = 10;
		System.out.print("연산자 입력(+,-,*,/) : ");
//		String op = sc.next();		
//
//
//			if (op.equals("+"))
//				System.out.println(a + " + " + b + " = " + (a + b));
//			else if (op.equals("-"))
//				System.out.println(a + " - " + b + " = " + (a - b));
//			else if (op.equals("*"))
//				System.out.println(a + " * " + b + " = " + (a * b));
//			else if (op.equals("/"))
//				System.out.println(a + " / " + b + " = " + (a / b));
//			else 
//				System.out.println("사칙 연산자만 입력해주세요.");

			String input = sc.next();		
			op = input.charAt(0);

			if (op == '+')
				System.out.println(a + " + " + b + " = " + (a + b));
			else if (op == '-')
				System.out.println(a + " - " + b + " = " + (a - b));
			else if (op == '*')
				System.out.println(a + " * " + b + " = " + (a * b));
			else if (op == '/')
				System.out.println(a + " / " + b + " = " + (a / b));
			else 
				System.out.println("사칙 연산자만 입력해주세요.");

	}
}
