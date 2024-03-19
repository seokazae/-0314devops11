package day0318;

public class Ex9_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		System.out.printf("%2d",i);
		System.out.println();
		
		for(int i=10;i>=1;i--)
			System.out.printf("%2d",i);
			System.out.println();
			
		for(int i='a';i<='z';i++)
			System.out.printf("%4c",(char)i);
			System.out.println();
			
		for(int i=1;i<=10;i++)
		{System.out.printf("%3d",i);
		
		if(i==5)
			break;//현재 속한 반복문을 빠져나간다
		
		
		for(i=1;i<=10;i++)
		 {
			if(i%2==0) //짝수일 경우는 출력하지 말고 i++로 가라
				continue; //i++로 이동
			System.out.printf("%3d",i);
		 }
		
		}
	
	}
}
