package day0318;

import java.util.Scanner;

public class Ex8_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 상품명(sang)과 수량(su),단가(dan) 입력받은 후
		 * 총금액(total)을 구하고 만약 수량이 5개 이상이면
		 * "10프로 할인입니다"와 함게 할인된 금액(dctotal)을 출력하시오
		 *
		 * 상품명?
		 * 딸기
		 * 수량?
		 * 6
		 * 단가?
		 * 2000
		 * 
		 * 딸기 6개의 총금액 : 12000
		 * 10프로 할인입니다
		 * 10프로 할인된 금액 : 10800
		 */
		
		Scanner sc= new Scanner(System.in);
		int su,dan,total;
		String sang;
		
		System.out.println("상품명을 입력하세요");
			sang = sc.nextLine();
		System.out.println("수량을 입력하세요");
			su = sc.nextInt();
		System.out.println("단가를 입력하세요");
			dan = sc.nextInt();
			
			
		//total = su*dan;
		//answer = su>=5? (true):(false)
			  
			
		if(su>=5) 
			{total=su*dan;
			int dctotal=(int)(total*0.9);
			//dctotal=total*9/10 같은 타입 맞추기
			
			System.out.println(sang+" "+su+"개의 총금액 : "+total);
			//system.out.printf("%s %d개의 총금액 : %d\n",sang,su,total);
			System.out.println("10프로 할인된 금액입니다");
			System.out.println("10프로 할인된 금액 : "+dctotal);}
		
		else
			{total=su*dan;
			 System.out.println(sang+" "+su+"개의 총금액 : "+total);}
		
		
	}

}
