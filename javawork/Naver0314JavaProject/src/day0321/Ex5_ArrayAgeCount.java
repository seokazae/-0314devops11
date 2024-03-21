package day0321;

public class Ex5_ArrayAgeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []memberAges= {12,45,22,13,45,35,36,37,38,39,32,13,52,1,40,50,37,5};
		System.out.println("총 인원 수 :"+memberAges.length);
		int []ageCount=new int[6];
		
		/*
		 * 연령별 인원수를 구해서 출력하시오
		 * 
		 * 10대미만 : 3명
		 * 10대
		 * 20대
		 * 30대
		 * 40대
		 * 50대
		 * 이런 식으로 출력하기 
		 */
		
/*
 * 		for(int i=0;i<memberAges.length;i++)
 * 			{
 *				ageConunt[memberAges[i]/10]++; 
 * 			}
 * 
 * 		syso("**연령별 인원수 구하기**");
 *  	for(int i=0;i<ageCount.length;i++)
 *  	{
 *  		if(i==0)
 *  			sys "10세 미만 : "+ageCount[i]+"명");
 *  		else
 *  			syso i*10"대        :"+"ageCount[i]+"명");
 *  	}
 * 
 * 
 */
		//우선 나이대 나누기
		for(int j=0;j<memberAges.length;j++)
		{
				ageCount[memberAges[j]/10]++;
		}	
			
			
		for(int i=0;i<ageCount.length;i++)
		{
				
			if(i==0)
				System.out.println("10세 미만 : "+ageCount[i]+"명");
			else
				System.out.println(i*10+"대   : "+ageCount[i]+"명");
				
		}
			
		}
		
		
}