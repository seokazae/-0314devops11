package day0320;

import java.util.Random;
import java.util.Scanner;

public class Ex3_RandomGame {

	public static void main(String[] args) {	
	/*
	 * 1.1~100 사이의 난수를 발생한 후 숫자 알아맞추기
	 * 2. 숫자 입력시 앞에 횟수 출력
	 * 3. 숫자 n이 난수보다 크면 (n보다 작습니다)
	 * 4. 숫자를 맞췄을 경우 (획수와 정답을 출력후)
	 * 5. 계속 숫자맞추기 게임을 하시겠습니까?(y/n)
	 * 6. y를 누르면 다시 난수발생후 숫자맞추기 시작
	 * 7. y가 아니면 게임종료/획수 정해진게 아니라 while문 써야 브레이크레이블을 써라)
	 */
		
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		
		int su,count,rnd;
		
		Exit:
			while(true)
			{				
				//획수초기화/게임한개 돌리기
				count=0;
				//난수구하기
				rnd=r.nextInt(100)+1;
				while(true)
				{
					System.out.print(++count+"회\n");
					System.out.println("숫자를 입력하시오");
					su =Integer.parseInt(sc.nextLine());
				
					if(su<rnd)
						System.out.printf("%d보다 큽니다\n",su);
					else if(su>rnd)
						System.out.printf("%d보다 작습니다\n",su);
					else
						{System.out.printf("%d가 정답입니다",su);
						System.out.println("계속하려면 y/그만하려면 n을 눌러주세요");
						String ans=sc.nextLine();
						if(ans.equalsIgnoreCase("y"))
						{System.out.println("**새로운 게임을 시작합니다**");
							break;}
						else {
							break Exit;}}//바깥쪽 와일문으로 나간다
					}
				}
			
					System.out.println("** 게임을 종료합니다 **");
				}
		
	
		
		
}
