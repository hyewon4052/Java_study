import java.util.Scanner;

class Quiz_03 
{
	public static void main(String[] args) 
	{	
		// 영어, 소문자, 숫자, 특수문자를 입력받으면 그대로 출력할 것!
		// 영어 대문자가 입력되면 소문자로 변환해서 출력할 것!
		// 문자열이 입력되면 첫글자만 변환해서 출력할 것!

		Scanner sc = new Scanner(System.in);
		String input;
		char code;
		
		System.out.print("문자 입력 : ");
		input = sc.next();
		
		char ch = input.charAt(0);	//String을 char로 변환
//		if (ch >= 65 && ch <= 90 )
//		{
//			code = (char)(ch + 32);
//		}
//		else 
//		{
//			code = ch;
//		}

		code = ch >= 65 && ch <= 90 ? (char)(ch + 32) : ch;

		System.out.println("입력한 문자 : "+ input + " 변환된 문자 : " + code);
		
	}
}
