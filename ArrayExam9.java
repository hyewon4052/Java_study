 class ArrayExam9 
{
	public static void main(String[] args) 
	{
		int a[];
		int b[];
		int c[] = {31,32,33};
		a = new int[4];
		b = new int[] {21,22,23,34};

		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);

		c = b;	// call by reference여서 주소값을 넘겨줌
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);

		
	}
}
