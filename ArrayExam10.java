 class ArrayExam10 
{
	public static void main(String[] args) 
	{
		// 1. 선언
//			int a[][];
//			int[][] a;
//			int[] a[];

		// 2. 생성
//			a = new int[2][3];

//		 3. 초기화
//			a[0][0] = 1;
//			a[0][1] = 2;
//			a[0][2] = 3;
//			a[1][0] = 10;
//			a[1][1] = 20;
//			a[1][2] = 30;

		// 1. 선언 & 생성
//			int a[][] = new int [2][3];

		// 2. 초기화
//			a[0][0] = 1;
//			a[0][1] = 2;
//			a[0][2] = 3;
//			a[1][0] = 10;
//			a[1][1] = 20;
//			a[1][2] = 30;
		
		// 1. 선언 & 생성 & 초기화
			int a[][] = { {1},{2,3},{4,5,6}, {7,8,9,10,11,12,13,14,15,16} };

		for (int i = 0; i < a.length; i++)		// i = 0,1
		{
			for (int j = 0; j < a[i].length; j++)		// j = 0,1,2 
			{
//				System.out.println(i + " " + j);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
