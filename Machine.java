import java.util.Scanner;

class Machine 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int money, menu, pay = 0;
		String choice, select = "";
		String drink = "";
		System.out.println("-----------------------------------------------------------");
		System.out.println("1.콜라(600)	2.환타(550)	3.커피(370)	4.물(420)");
		System.out.println("-----------------------------------------------------------");
		System.out.println();	//line feed
		
		System.out.print("돈을 넣어주세요 : ");
		money = sc.nextInt();
		//System.out.println(money + "원을 넣으셨습니다.");
		while (true)
		{
			System.out.print("음료를 선택하세요(1~4) : ");
			menu = sc.nextInt();

			switch (menu)
			{
				case 1:
					select = "콜라"; 
					pay = 600;
					break;
				case 2:
					select = "환타";
					pay = 550;
					break;
				case 3:
					select = "커피"; 
					pay = 370;
					break;
				case 4:
					select = "물"; 
					pay = 420;
					break;
				default : 
					System.out.println("메뉴를 다시 선택해주세요 (1~4)"); 
					select = "";
					pay = 0;
					break;
			}
			if (money < pay)
			{
				System.out.println("잔액이 부족합니다."); 
				System.exit(0); // 프로그램 종료
			}
			else 
			{
				drink = drink + select + " ";
				money = money - pay;
				System.out.println("잔액은 " + money + "원 입니다.");
			}

			System.out.println();
			System.out.print("추가로 선택하시겠습니까? (y or n) : ");
			choice = sc.next();


			if (choice.equals("n") || choice.equals("N")) break;
		}	//while

		System.out.println();
		System.out.println("***** 이용해 주셔서 감사합니다. *****");
		System.out.println();
		System.out.println("뽑으신 음료수는 " + drink + "이고, 잔액은 " + money + "입니다.");

	}
}
