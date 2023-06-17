class SwitchExam3 
{
	public static void main(String[] args) 
	{
		int a = 8;
		switch (a % 3)
		{
		case 0:
			System.out.println(a + "는 3의 배수 입니다.");
			break;
		case 1:
		case 2:
			System.out.println(a + "는 3의 배수가 아닙니다.");
			break;	
		}
	}
}
