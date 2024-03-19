package day0319;

import java.util.StringTokenizer;

public class Ex8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**String 객체의 Method 공부하기**");
		String str1="Have a Nice Day";
		String str2="apple";
		String str3="Apple";
		
		System.out.println(str1.charAt(7));//7번 인덱스의 문자 :N
		System.out.println(str1.charAt(0));//0번 인덱스의 문자 :H
		System.out.println(str1.indexOf('a'));//첫번째 'a'의 위치 : 1
		System.out.println(str1.indexOf('X'));//첫번째 X의 위치 : -1(없을 경우 -1)
		System.out.println(str1.lastIndexOf('a'));//마지막 a의 위치 : 13
		System.out.println(str1.length());//str1의 총길이 15, 메소드라서 가로는 필요함
		System.out.println(str2.concat("***"));//str2문자에 *** 추가해서 반환
		System.out.println(str1.toLowerCase());//모두 소문자로 변환해서 반환
		System.out.println(str1.toUpperCase());//모두 대문자로 변환해서 반환
		
		//문자열 비교시(값으로 비교시 equal 사용)
		System.out.println("apple".equals(str2));//true
		System.out.println("apple".equals(str3));//false
		System.out.println(str2.equals(str3));//false 대소문자 다르므로
		System.out.println(str2.equalsIgnoreCase(str3));
		//대소문자 상관없이 비교 : true(==동등연산자는 기본값 비교시에만 사용)
		
		//문자열 추출
		System.out.println(str1.substring(7));//7번 인덱스부터 끝까지 추출
		System.out.println(str1.substring(7,10));//7부터9까지 추출
		
		//문자열 비교
		System.out.println(str1.startsWith("have"));//have로 시작하면 true
		System.out.println(str1.startsWith("Nice"));//Nivce로 시작하지 않으니 false
		
		System.out.println(str1.endsWith("Day"));//Day로 끝나니 true
		System.out.println(str1.toLowerCase().endsWith("day"));//true
		
		//compareTo로 비교시
		System.out.println("apple".compareTo("append"));//'l','e' : 7(양수:첫문자열이 더 크다), 첫문자열이 작을 경우 음수가 나온다
		System.out.println("apple".compareTo("banana"));//'a','b' : -1 (음수:뒤문자열이 더 크다)
		System.out.println("apple".compareTo("apple"));//0(같을 경우)
		
		//반복
		System.out.println(str2.repeat(3));
		System.out.println("*".repeat(10));
		
		//변경
		System.out.println(str1.replace('a', '*'));
		System.out.println(str1.replace("Nice", "Good"));
		
		//문자열 분리(결과값이 배열타입)
		String colors="red,blue,green,yellow,pink";
		String []a1=colors.split(",");
		System.out.println("분리된 배열의 갯수:"+a1.length);
		System.out.println(a1[0]+","+a1[4]);
		
		//분리하는 또다른 방법
		StringTokenizer st=new StringTokenizer(colors,",");
		System.out.println("분리할 토큰수 :"+st.countTokens());
		
		
		//분리된 토큰값 출력
		while(st.hasMoreTokens())//더이상 토큰이 없을 경우 false가 되면서 while문을 빠져나간다
		{
			System.out.println(st.nextToken());//다음 토큰 꺼내서 출력
		}
		
		
		String msg="   hello   ";
		System.out.println(msg.length());//글자수
		System.out.println(msg.trim().length());//양쪽공백제거후 5글자
		
		//valueOf:어떤 타입의 데이타든지 모두 스트링으로 전환해준다.
		System.out.println(String.valueOf(3));//정수 3인 문자열 "3"으로 반환
		System.out.println(3+"");//이방법도 있음(문자 3으로 바꾸기)
		
	}

}
