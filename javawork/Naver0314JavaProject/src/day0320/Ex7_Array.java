package day0320;

public class Ex7_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int []date= {23,100,200,-13,67,-123,78,345,3,110,-600,500};
		int max,min;
		max=min=date[0];//무조건 첫데이타를 max와 min 지정한다
		System.out.println(date.length);
		
		for(int i=1;i<date.length;i++)
		{
			if(max<date[i])
				max=date[i];
		}
		System.out.println("최대값:"+max);
		
		
		for(int i=1;i<date.length;i++)//for문을 두번 안써도 되겠네
		{
			if(min>date[i])
				min=date[i];
		}
		System.out.println("최소값:"+min);
		
		int pcnt=0,mcnt=0;
		//배열데이터중 양수의 객수와 음수의 갯수를 구하여서 출력해보시오
		
		for(int i=1;i<date.length;i++)
		{
			if(date[i]>0)
				pcnt++;
				
			if(date[i]<0)
				mcnt++;
		}
		
		System.out.println("양수 갯수:"+pcnt);
		System.out.println("음수 갯수:"+mcnt);
		
		//연산자로 하는법
		//pcnt += date[i] > 0? : 1 : 0
		
	}

}
