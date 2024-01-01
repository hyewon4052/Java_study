 class Park_for1 
{
	public static void main(String[] args) 
	{
		int gu = 2;

		for (gu = 2 ; gu < 10; gu++ )
		{
			if (gu % 2 == 0)
				for (int i =1; i<10 ; i++)
				{
					System.out.print(gu + " * " + i +  " = " + gu*i + "\t");
				}
			System.out.println("");
		}
	}
}
