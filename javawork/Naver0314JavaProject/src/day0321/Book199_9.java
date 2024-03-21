package day0321;

import java.util.Scanner;

public class Book199_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int butt;
		int []score = {};
		
		Program://레이블
			
		while(true)
		{	
			
		int num;
			
		System.out.println("=".repeat(45));
		System.out.println("1.학생수 ; 2.점수입력 ; 3.점수리스트 ; 4.분석 ; 5.종료");
		System.out.println("=".repeat(45));
		System.out.println("선택>");
		choice=sc.nextInt();
		
		switch(butt)
		{
		case 1 : 
			
			System.out.println("학생수> ");
			num=sc.nextInt();
			break;
		
		case 2 :
			
			score = new int[num];
			System.out.println("점수> ");
			for(int i = 0; i<num ;i++)
				{
				System.out.print((i + 1)+".");
				score[i] = sc.nextInt();
				}
			break;
				
			
		case 3 :
			System.out.println("점수 리스트> ");
			for(int i=0 ; i<num ; i++)
			{
				System.out.println((i+1)+".");
				score[i] = sc.nextInt();
			}
			
			
		case 4 :
			
			int maxScore = 0, sumAll =0
			for(int i =0;i<num ; i++)
			{
				sumAll+= score[i];
				maxScore=maxScore<score[i]? score[i] : maxScore;
			}
			
			System.out.println("최고점수> "+ maxScore);
			System.out.println("평균점수> "+(sumAll/num));
			break;
				
		case 5 :
			break Program;
			
		default:
			System.out.println("잘못된 선택지입니다 다시 입력해주세요");
			continue Program;
			
		}
				
		}
	}

}
