
class Park_if3 
{
	public static void main(String[] args) 
	{
		int num = 6;

		if (num % 3 == 0 )	
		{	
			System.out.println(num + "은 3의 배수입니다.");
			
			if (num %2 == 0)
			{
				System.out.println(num + "은 짝수입니다.");
			}
		}
	}
}
