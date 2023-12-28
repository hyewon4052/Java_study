 class Exam_04 
{
	public static void main(String[] args) 
	{
		//char ch = 'A';
		//int code = ch + 1;
		//System.out.println(code);
		//System.out.println((char)code);

		//char ch1 = 'A';
		//char ch2 = 'B';
		//int code = ch1 + ch2;
		//System.out.println(code);
	
		//char ch1 = 'A';
		//char ch2 = 'Z';
		//for (int i=ch1;i<=ch2;i++)
		//{
		//	System.out.println((char)i);
		//}

		char ch1 = 'A';
		char ch2 = 'Z';

		for (int i=ch1; i<=ch2; i++)
		{
			for (int j=ch1; j<=i; j++)
			{
				System.out.print((char)j);
			} //for j
			System.out.println();
		} //i

	} //main
}
