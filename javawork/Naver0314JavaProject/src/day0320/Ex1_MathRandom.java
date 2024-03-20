package day0320;

public class Ex1_MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**Math.randaom()을 이용한 난수 구하기**");
		System.out.println("1. 랜덤할 때 값");
		
		for(int i=1;i<=5;i++)
		{
			double d=Math.random();//0.0<=r<1.0
			System.out.println(d);
		}
		
		System.out.println("2. 0~9 발생 ");
		for(int i=1;i<=5;i++)
		{
			int n=(int)(Math.random()*10);
			System.out.printf("%4d",n);
		}
			System.out.println();
			System.out.println("=".repeat(30));
			
			System.out.println("3. 1~10 발생 ");
			for(int i=1;i<=5;i++)
			{
				int n=(int)(Math.random()*10)+1;
				System.out.printf("%4d",n);
			}
				System.out.println();
				System.out.println("=".repeat(30));
				
				System.out.println("4. 1~100 발생 ");
				for(int i=1;i<=5;i++)
				{
					int n=(int)(Math.random()*100)+1;
					System.out.printf("%4d",n);
				}
					System.out.println();
					System.out.println("=".repeat(30));
					
					System.out.println("5. A~Z 발생 ");
					for(int i=1;i<=5;i++)
					{
						int n=(int)(Math.random()*26)+65;
						System.out.printf("%4c",(char)n);
					}
						System.out.println();
						System.out.println("=".repeat(30));
						System.out.println("6. a~z 발생 ");
						for(int i=1;i<=5;i++)
						{
							int n=(int)(Math.random()*26)+97;
							System.out.printf("%4c",(char)n);
						}
							System.out.println();
							System.out.println("=".repeat(30));
	}

}
