 import java.util.Scanner;

public class Bmi {
	public static void main (String args[]) {


/*
		//String name = "하석진";
		//System.out.println("내가 좋아하는 연예인은? " + name + "입니다.");
		
		
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.next();
		System.out.println("당신이 좋아하는 연예인은? " + name + "입니다.");
		

		float height = 1.63f;
		float weight = 58.5f;
		float result = weight / (height*height);	
		
		
		Scanner sc = new Scanner(System.in);
		String name, bmi_result;
		float height, weight, result;
		
		System.out.print("이름 입력 : ");
		name = sc.next();

		System.out.print("키 입력 : ");
		height = sc.nextFloat();
		
		System.out.print("몸무게 입력 : ");
		weight = sc.nextFloat();

		result = weight / (height*height);

		if(result >30.0) {
				bmi_result = "비만";
		}
		else if (result > 25.0) {
				bmi_result = "과체중";
		}
		else if (result > 18.5) {
				bmi_result = "정상";
		}
		else {
				bmi_result = "저체중";
		}



		switch : 정수, dufault, break
		int su = (int)result;		//강제형변환

		switch(su) {	su = 21
			case 15: case 16: case 17:
			bmi_result = "저체중";
			break;

			case 18: case 19: case 20: case 21: 
			case 22: case 23: case 24: case 25:
			bmi_result = "정상";
			break;
			
			case 26: case 27: case 28: case 29: case 30:
			bmi_result = "과체중";
			break;
		
			default:
				bmi_result = "비만";
				break;
		}


		System.out.println(name + "님의 체질량 지수는 " + result + "이고, 결과는 " + bmi_result + "입니다.");
*/	

		//for (int i = 1; i <= 5; i++) {
				//System.out.println(i);
		//}		

			
		//int i = 1;
		//while(i<=5) {
		//System.out.println(i);
		//if(i==5) break;				
  		//i++; 
		//}  while

		Scanner sc = new Scanner(System.in, "EUCKR");

		System.out.println();
		System.out.println("***** 지금부터 체질량지수를 측정하겠습니다. *****");
		System.out.println();

		while(true) {

			String name, bmi_result;
			float height, weight, result;

			System.out.print("이름 입력 : ");
			name = sc.next();

			System.out.print("키 입력 : ");
			height = sc.nextFloat();
		
			System.out.print("몸무게 입력 : ");
			weight = sc.nextFloat();

			result = weight / (height*height);

			if(result >30.0) {
				bmi_result = "비만";
			}
			else if (result > 25.0) {
				bmi_result = "과체중";
			}
			else if (result > 18.5) {
				bmi_result = "정상";
			}
			else {
				bmi_result = "저체중";
			}

			System.out.println(name + "님의 체질량 지수는 " + result + "이고, 결과는 " + bmi_result + "입니다.");

			System.out.print("계속하시겠습니까? (y or n) : ");
			String choice = sc.next();
			//if(choice.equals("n") || choice.equals("N")) break;
			if(choice.equalsIgnoreCase("n")) break;
			System.out.println();
		
		}

		System.out.println();
		System.out.println("***** 이용해 주셔서 감사합니다. *****");

	} // main
} 