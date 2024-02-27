 class ArrayExam1
{
	public static void main(String[] args) 
	{
//		// 1.선언
//			int a[]; // int[] a;
//
//		// 2.생성
//			a = new int[3];
//
//		// 3.초기화
//			a[0] = 1;
//			a[1] = 2;
//			a[2] = 3;

//		// 1. 선언 & 생성
//			int a[] = new int[3];
//		
//		// 2. 초기화
//			a[0] = 1;
//			a[1] = 2;
//			a[2] = 3;
//
//		// 1. 선언 & 생성 & 초기화
			int a[] = {1,2,3};

			System.out.println(a.length);
			for (int i = 0 ; i < a.length ; i++ )	//비교식에는 숫자가 아닌 a.length 쓰기
			{
				System.out.println(a[i]);
			}
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
	}
}
