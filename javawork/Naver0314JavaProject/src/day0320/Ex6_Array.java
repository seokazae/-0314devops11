package day0320;

public class Ex6_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1={4,6,8,10,30};
		System.out.println("**출력#1**");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.printf("%4d",arr1[i]);
		}
		System.out.println();
		
		System.out.println("**출력#2**");
		for(int n:arr1)
		{
			System.out.printf("%4d",n);
		}
		System.out.println();
		System.out.println("+".repeat(30));
		
		int []arr2;
		//arr2= {10,20,30,40} 따로줘야해
		arr2=new int[]{10,20,30,40};
		System.out.println("arr2의 갯수:"+arr2.length);
		
		for(int n:arr2)
		{
			System.out.printf("%4d",n);
		}
		System.out.println();
		
		//문자열 배열
		String []str1= {"김영자", "이미자","강호동","이재성"};
		String []str2;
		str2=new String[] {"사과","오렌지","딸기"};
		
		//출력(str1은 length를 이용해서 출력, str2는 두번째 방법으로)
		
		for(int i=0;i<str1.length;i++)
			System.out.printf("%4s",str1[i]);
		System.out.println();
		for(String n:str2)
			System.out.printf("%4s",n);
			
	}

}
