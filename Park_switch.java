import java.util.Scanner;	//스캐너를 사용하기 위해 작성


class Park_switch 
{
	public static void main(String[] args)	//스캐너 선언
	{
		char rank;
		Scanner sc = new Scanner(System.in);
		System.out.print("자바 학점을 입력하세요. : ");
		rank = sc.next().charAt(0);

		switch (rank)
		{
		case 'a' :
		case 'A' :
			System.out.println("당신의 점수는 90점 이상입니다."); break;
		case 'b' :
		case 'B' :
			System.out.println("당신의 점수는 80점 이상입니다."); break;
		case 'c' :
		case 'C' :
			System.out.println("당신의 점수는 70점 이상입니다."); break;
		case 'd' :
		case 'D' :
			System.out.println("당신의 점수는 60점 이상입니다."); break;
		case 'f' :
		case 'F' :
			System.out.println("당신의 점수는 59점 이하입니다."); break;
		default :
			System.out.println("잘못 입력하셨습니다."); break;
		
		}
	}
}
