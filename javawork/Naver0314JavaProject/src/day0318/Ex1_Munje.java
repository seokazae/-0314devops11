package day0318;

import java.util.Scanner;

public class Ex1_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 점수(score)를 입력 후 점수가 90점 이상이면 "A" 80점 이상이면 "B" 70점 이상이면 "C" 60점 이상이면 "D" 나머지는
		 * "F"를 출력
		 * 
		 * ex) 점수? 89
		 * 
		 * 89점은 B학점입니다 (조건연산자로 이용해서 조건 구하기)
		 */
	
    Scanner sc= new Scanner(System.in);
    
    System.out.println("점수를 입력하세요");
    int score = sc.nextInt();
    //if문을 이용해서 점수를 잘못 입력했을 경우 메서도 종료를 하자
    
    if(score < 1 || score > 100)
    {
    	System.out.println("잘못된 점수입니다");
    	return; //main 메서드를 종료(곧 프로그램이 종료됨)
    }
    
    String msg = score >= 90? "A" : score>=80? "B" : score>=70? "C" :
    	         score >= 60? "D" : "F";
    	         
    	System.out.println(score + "점은" + msg + "학점");
    }
 	
	}

