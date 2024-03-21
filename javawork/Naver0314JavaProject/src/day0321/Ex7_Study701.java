package day0321;

import java.util.Calendar;
import java.util.Date;

public class Ex7_Study701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {
				"강하윤","공병현","김도훈","김우형","김정호",
				"김창인","민경진","박민지","박보민","박주용",
				"박한경","배동우","서정현","손가원","시바타유니",
				"신완철","우태형","유상곤","이가현","이병현",
				"이장우","이현성","정민석","정상혁","정진욱",
				"정환용","최시현","허승필","황재웅","꽝!"
		};
		Date date=new Date();
		int []rnd=new int[30];
		//2차원 배열에 5명씩 총 6조
		String [][]team=new String[6][5];
		//0~29까지 서로 중복되지 않게 배열에 임의로 발생시켜 넣고
		Loop:
		for(int i=0;i<members.length;i++)
		{
			
			rnd[i]=(int)(Math.random()*30);
			
			for(int j=0;j<i;j++)
			{
				if(rnd[i]==rnd[j])
				{
					i--;
					continue Loop;
				}
			}
		}
		
		//멤버스 배열 숫자를 위에서 변수로 고정해놓고
		int idx=0;
		for(int i=0;i<team.length;i++)
		{
			for(int j=0;j<team[i].length;j++)
			{
				team[i][j]=members[rnd[idx++]];
			}
		}
		
		//현재 날짜를 출력하시오 (년-월-일)
		int year=date.getYear()+1900;//년도는 1900이 빠진값
		int month=date.getMonth()+1;//0~11이 반환
		int day=date.getDate();
		
		System.out.println(year+"-"+month+"-"+day);
		
		System.out.println("\t\t**701 스터디팀**\n");
		for(int i=0;i<team.length;i++)
		{
			System.out.printf("[%d조 팀]\t",i+1);
			for(int j=0;j<team[i].length;j++)
			{
				System.out.print(team[i][j]+"\t");
			}
			System.out.println();
			
		}	
		}	
	}

