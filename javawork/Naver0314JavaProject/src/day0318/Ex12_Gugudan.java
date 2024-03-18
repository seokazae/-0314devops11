package day0318;

import java.util.Scanner;

public class Ex12_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 구구단? 11 : if문
		 *  잘못된 숫자 입니다
		 *  
		 * 구구단? 5 : 단일for문
		 * ** 5단 **
		 * 
		 * 5 x 1 = 5
		 * ...
		 * 5 x 9 = 45
		 */
		Scanner sc= new Scanner(System.in);
		
		System.out.println("구구단?");
		int num = sc.nextInt();
		
		
		if(num<2 || num>9)
		{System.out.println("잘못된 숫자 입니다");
		return;}
		
		
		System.out.println("** "+num+"단"+" **");
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d x %d = %2d\n",num,i,num*i);
		}
		
		
	}

}
