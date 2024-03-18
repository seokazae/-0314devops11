package day0318;

import java.util.Scanner;

public class Ex7_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름(name),기본급(gibon),가족수(familysu) 를 키보드로 입력후
		 * 가족수가 3인 이상이면 기본급 +(가족수*50000)으로 실수령액(totpay)을 구하고
		 * 가족수가 3인 미만이면 기본급 +30000으로 실수령액을 출력하시오
		 * 출력은
		 * 이름
		 * 기본급
		 * 가족수
		 * 실수령액
		 */
		
		//string name;
		//int gibon,familysu,totpay;
		
		Scanner sc= new Scanner(System.in);
		int totpay;
		
		System.out.println("이름를 입력하세요");
			String name = sc.nextLine();
			
		System.out.println("기본급을 입력하세요");
			int gibon = sc.nextInt();
			
		System.out.println("가족수를 입력하세요");
			int num = sc.nextInt();
			
			if(num>=3) 
				{totpay=gibon+num*50000;}
			
			else
				{totpay=gibon+30000;}
			
		System.out.println("이름 : "+name+"\n"
				      		+"기본급 : "+gibon+"\n"
				      		+"가족수 : "+num+"\n"
				      		+"실수령액 : "+totpay);
		

	}

}
