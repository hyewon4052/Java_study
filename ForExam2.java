class ForExam2 
{
	public static void main(String[] args) 
	{
		int oddSum = 0, evenSum = 0;
		for (int i = 1 ; i <= 10 ; i++ )
		{
			if (i % 2 ==1)
				oddSum += i;
			else 
				evenSum += i;
			
		}
		System.out.println("홀수합 = " + oddSum);
		System.out.println("짝수합 = " + evenSum);
	}
}
