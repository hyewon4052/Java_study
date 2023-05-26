import java.util.Scanner;		//스캐너를 사용하기 위해 작성

class Park_if2 
{
	public static void main(String[] args) 
	{
		int ja;
		Scanner sc = new Scanner(System.in);	//스캐너 선언

		System.out.print("자바 점수를 입력해주세요. : ");
		ja = sc.nextInt();
		System.out.println("당신의 자바 점수는 " + ja + "입니다.");

		if ( ja >= 90)
		{
			System.out.println("당신의 자바 학점은 A입니다.");
		}
		else if ( ja >= 80)
		{
			System.out.println("당신의 자바 학점은 B입니다.");
		}
		else if ( ja >= 70)
		{
			System.out.println("당신의 자바 학점은 C입니다.");
		}
		else if ( ja >= 60)
		{
			System.out.println("당신의 자바 학점은 D입니다.");
		}
		else {
			System.out.println("당신의 자바 학점은 F입니다.");
		}
	}
}
