package two_week;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner in = new Scanner(System.in);
	
		System.out.print("���������֣�");
		int amount = in.nextInt();
		if(amount >= 10)

		{
			int balance = (amount -10);
			
			System.out.println("��Ʊ�ɹ�,Ʊ��10Ԫ"+",���㣺"+balance);
		}
		else
			System.out.print("����");
		*/
		/**********************************/
		/*
		final int PASS = 60;
		Scanner in = new Scanner(System.in);
		
		int score;
		score= in.nextInt();
		System.out.println("������ĳɼ���"+ score);
		
		if (score >=PASS)
		{
			System.out.println("very good!");
		}
		else
			System.out.println("very bad !");
		System.out.print("�ټ�");
		*/
		/***************************************************/
		/*
		Scanner in = new Scanner(System.in);
		
		System.out.print("������С��7������:");
		int BJT = in.nextInt();
		switch(BJT)
		{
			case 1:
				System.out.println("��������1��");
				break;
			case 2:
				System.out.println("��������2��");
				break;
			case 3:
				System.out.println("��������3��");
				break;
			case 4:
				System.out.println("��������4��");
				break;
			case 5:
				System.out.println("��������5��");
				break;
			case 6:
				System.out.println("��������6��");
				break;
			case 7:
				System.out.println("��������7��");
				break;
			default:
				System.out.println("��������ִ���7��");
			
		}
		*/
		/************��ϰ��*****************************/
		/*
		System.out.print("������0-2359֮�������:");
		Scanner in = new Scanner(System.in);
		int BJT = in.nextInt();
		//int Thou,Hun,Ten,Sin;
		int num,UTC;
//		Thou = BJT/1000;
//		Hun=BJT%1000/100;
//		Ten=BJT%100/10;
//		Sin=BJT%10;
		//if(Thou<=2 && Hun<=3 && Ten<=5 && Sin<=9)
		if(BJT>=0&&BJT<=2359)
		{
			if(BJT>=800)
			{
				UTC = BJT - 800;
				
			}
			else
			{
				num = 800-BJT;
				UTC = 2400 - num;
				
			}
			if(BJT<10)
			{
				System.out.println("BJTΪ:0"+BJT);
				
			}
			else
			{
				System.out.println("BJTΪ:"+BJT);
			}
			if(UTC<10)
			{
				System.out.println("UTCΪ:0"+UTC);
				
			}
			else
			{
				System.out.println("UTCΪ:"+UTC);
			}
			
				
		}
		else
		{
			System.out.print("������Χ����������:");
		}
		*/
		
		System.out.print("������11-59֮�������:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int R,S;
		R=num%100/10;
		S=num%10;
		if(num>=11&&num<=59)
		{
			
			switch(S)
			{
				case 1:
					System.out.print("Faint signals, barely perceptible,");
					break;
				case 2:
					System.out.print("Very weak signals,");
					break;
				case 3:
					System.out.print("Weak signals,");
					break;
				case 4:
					System.out.print("Fair signals,");
					break;
				case 5:
					System.out.print("Fairly good signals,");
					break;
				case 6:
					System.out.print("Good signals,");
					break;
				case 7:
					System.out.print("Moderately strong signals,");
					break;
				case 8:
					System.out.print("Strong signals,");
					break;
				case 9:
					System.out.print("Extremely strong signals,");
					break;
				default:
					System.out.print("�����");
				
			}
			
			switch(R)
			{
				case 1:
					System.out.println("Unreadable.");
					break;
				case 2:
					System.out.println("Barely readable, occasional words distinguishable.");
					break;
				case 3:
					System.out.println("Readable with considerable difficulty.");
					break;
				case 4:
					System.out.println("Readable with practically no difficulty.");
					break;
				case 5:
					System.out.println("Perfectly readable.");
					break;
				default:
					System.out.println("�������");
					
					
			}
		}
		else
		{
			System.out.print("������Χ����������:");
		}
		
		
	
	}
	

}
