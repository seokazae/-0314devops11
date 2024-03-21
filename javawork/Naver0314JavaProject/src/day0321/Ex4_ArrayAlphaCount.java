package day0321;

import java.util.Scanner;

public class Ex4_ArrayAlphaCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 영어문장을 입력하면 알파벳 기준으로 각각의 갯수를 출력하시오
 * have a nice day!!!!!
 * 
 * 'A' -> 0번지 증가
 * 'b' -> 1번지 증가
 * alpha['A'-'A']++//0번지 증가
 * alpha['B'-'A']++//1번지 증가
 * alpha['c'-'a']++//2번지 증가
 * A:3 B:0 .... Z:0
 */
		Scanner sc=new Scanner(System.in);
		String msg;
		int []alpha=new int[26];
		
		//대문자로 바꾸기
		System.out.println("영어 문장을 입력하시오");
		msg = sc.nextLine();
		
		for(int i=0;i<msg.length();i++)
			{
			char ch=msg.toUpperCase().charAt(i);//대문자로 변경후 i번지 글자 얻기
			if(ch>='A' && ch<='Z')
			alpha[ch-'A']++;
			}
		
		System.out.println("**알파벳별 갯수 구하기**");
		for(int i=0;i<alpha.length;i++)
		{
			System.out.printf("%c:%d\t",(char)('A'+i),alpha[i]);
			if((i+1)%5==0)
				System.out.println();
		}
				
		
//		for(int i=1;i<27;i++)
//		{
//			for(char j='A';j<='Z';j++);
//			alpha[i]=j;
//		}
//		
//		//대문자로 바꾸기
//		System.out.println("영어 문장을 입력하시오");
//		msg = sc.nextLine();
//		System.out.println(msg.toUpperCase());
//		
//		//알파벳 추출
//		for(int i=0;i<=msg.length();i++)
//		{
//			msg.charAt(i);
//		}
//		
//		//숫자 세기
//		//출력
	}

}
