class SwitchExam4 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
//		System.out.println(a);

		switch (a)
		{
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 : 
		case 9 : 
		case 11: 
			System.out.println(a + "월은 31일까지입니다.");
			break;
		case 4 : 
		case 6 : 
		case 8 : 
		case 10 : 
		case 12 : 
			System.out.println(a + "월은 30일까지입니다.");
			break;
		case 2 : 
			System.out.println(a + "월은 28일까지입니다.");
			break;
		default : 
			System.out.println("1 ~ 12 사이의 정수만 입력해 주세요.");
		}
	}
}
