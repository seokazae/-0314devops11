package day0319;

public class Ex5_forstar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)//행
		{
			for(int j=1;j<=5;j++)//열
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		System.out.println("=".repeat(10));
		for(int i=1;i<=5;i++)//행
		{
			for(int j=1;j<=i;j++)//열
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
			System.out.println("=".repeat(10));
			
			for(int i=1;i<=5;i++)//행
			{
				for(int j=1;j<=5;j++)//열
				{
					System.out.print("*");
			    }
			}	
				System.out.println();		
			
		
	}
}
