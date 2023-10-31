class IfExam3 
{
	public static void main(String[] args) 
	{
		int a = args.length;
//		System.out.println(a);

		if (a==0)
			System.out.println("매개변수가 없습니다.");
		else if (a==1)
			System.out.println("당신이 좋아하는 과일은 " + args[0] + "입니다.");
		else if (a==2)
			System.out.println("당신이 좋아하는 과일은 " + args[0] + " " + args[1] + "입니다.");
		else if (a==3)
			System.out.println("당신이 좋아하는 과일은 " + args[0] + " " + args[1] + " " + args[2] + "입니다.");
		else 
			System.out.println("과일은 최대 3개까지만 입력해주세요.");
	}
}
