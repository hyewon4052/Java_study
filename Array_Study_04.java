  class Array_Study_04 
{
	public static void main(String[] args) 
	{
//		int table[][] = new int[3][4];
//		table[0][0] = 10;
//		table[1][1] = 20;
//		table[2][3] = table[0][0] + table[1][1];
//
//		System.out.println(table[0][0]);
//		System.out.println(table[1][1]);
//		System.out.println(table[2][3]);

		int table[][] = { {1}, {2,3}, {4,5,6,7,8} };
		for (int i = 0; i < table.length ; i++ )
		{
			for (int j = 0 ; j < table[i].length ; j++)
			{
				System.out.print(table[i][j] + "\t");
			} // 서술형 기말고사 / 수행평가 시험문제
			System.out.println();
		}

	}
}
