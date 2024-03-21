package day0321;

import java.util.Scanner;

public class Ex6_ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int []lotto=new int[6];
		int money;
		
		/*
		 * money를 입력하면 해당 횟수만큼 로또구하기
		 * 로또 : 1~45까지의 중복되지 않은 숫자
		 * 
		 * 
		 * 로또금액입력? 800
		 * 	>금액이 부족합니다
		 * 로또금액입력? 0
		 *  >종료합니다(while문종료)
		 * 로또금액입력? 3000
		 *  1회 : 4 7 12 34 44 45
		 *  2회 : 3 7 9  13 39 42
		 *  ...
		 *  
		 * 
		 */		
		//1. 1000원 미만 거르기(if)
		//2. 0일 경우 끄기(break;)(if else)
		//3. 반복문(for문)-a. 금액에 맞춘 횟수
		//4. 안에 6개 반복(랜덤 숫자 1-45)
		//5. 출력(in할 수 있는 것 하기)
		
		
		
		while(true)
			
		{
			System.out.println("로또금액입력?");
			money = sc.nextInt();
			
			if(money==0) {
				System.out.println("**종료합니다");
				break;}
			
			if(money<1000) {
				System.out.println("금액이 부족합니다");
				continue;}
				
		
		//금액만큼 반복
		for(int m=0;m<money/1000;m++)
		{
		//로또 숫자 구하기
		Loop:
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)((Math.random()*45)+1);
			//중복숫자 체크
			for(int j=0;j<i;j++) // i=0경우 움직이지 않음
				                 // i=1경우 j=0 하나만 찾음
				                 // i=2경우 j=1,2 둘 찾음
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;//두번째 for문 아래에 다른코드가 없으므로 continue대신 break써도 됨.
					//continue Loop;
				}
			}
		}
		
		//오름차순 정렬
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
		}
		
		
		//출력
		System.out.printf("%2d 회 : ",m+1);
		for(int n:lotto)
				System.out.printf("%3d",n);
		System.out.println();
		
		}
		}
	
	}

}
