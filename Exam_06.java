   class Exam_06
{
	public static void main(String[] args) 
	{
		boolean a = true, b = false, c;
		//c = a | b;	// c = true
		//System.out.println(c);

		//c = b & a;
		//System.out.println(c);

		//boolean cc = aa();
		//System.out.println(cc);

		//c = aa() || bb();
		//System.out.println(c);

		c = bb() && aa();
		System.out.println(c);

	} //main

	public static boolean aa() {
	System.out.println("aa() 함수 호출");
	return true;
	
	}
	public static boolean bb() {
	System.out.println("bb() 함수 호출");
	return false;
	}
}
