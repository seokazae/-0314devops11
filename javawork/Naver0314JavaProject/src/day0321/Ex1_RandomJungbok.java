package day0321;

public class Ex1_RandomJungbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1~30 까지의 난수 10개를 발생하는데 중복처리하기
		 */
		int []rand=new int[10];
		Loop:
		for(int i=0;i<rand.length;i++)			
		{
			int n=(int)(Math.random()*30)+1;
			rand[i]=n;
			
			//중복처리
			for(int j=0;j<i;j++)
			{
				if(rand[i]==rand[j])
				{
					i--;//다시 제자리로 가기 위해서 일단 1을 빼고 이동
					continue Loop;//i++로 이동
				}
			}
		}
		
		//순차적 정렬(오름차순)
//		for(int i=0;i<arr.length-1;i++)//기준
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])//오름차순 정렬
//				{
//					//서로 값을 바꾼다
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
		
		for(int x=0;x<rand.length-1;x++)//기준잡고
		{
			for(int z=x+1;z<rand.length;z++)//다음 애랑 끝까지 비교
			{
				if(rand[x]>rand[z])
				{
					int temp=rand[x];
					rand[x]=rand[z];
					rand[z]=temp;
				}
			}
		}
		
		System.out.println("1~30사이의 중복되지 않는 난수 구하기");
		for(int i=0;i<rand.length;i++)
		{
			System.out.printf("%4d",rand[i]);
		}
			
	}

}
