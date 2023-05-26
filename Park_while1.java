class Park_while1
{
	public static void main(String[] args) 
	{
		int i = 1;
		while (true)
		{
				if (i> 10)
				{
					break;
				}
				if (i % 2 == 0)
				{
					i++;			// 순서 중요
					continue;
				}
			System.out.println("Hello World!" + i);
			i++;					// 증감식
		}
		
	}
}
