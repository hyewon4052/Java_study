 class Array_Study_01 
{
	public static void main(String[] args) 
	{
		int score[] = {100, 88, 100, 100, 90};
		int sum = 0;
		float average ;

		for (int i = 0; i < score.length ; i++)
		{
			sum += score[i];
		}

		average = sum / (float) score.length;
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + average);

		
	}
}
