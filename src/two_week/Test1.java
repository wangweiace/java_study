package two_week;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner in = new Scanner(System.in);
	
		System.out.print("请输入数字：");
		int amount = in.nextInt();
		if(amount >= 10)

		{
			int balance = (amount -10);
			
			System.out.println("购票成功,票价10元"+",找零："+balance);
		}
		else
			System.out.print("金额不足");
		*/
		/**********************************/
		/*
		final int PASS = 60;
		Scanner in = new Scanner(System.in);
		
		int score;
		score= in.nextInt();
		System.out.println("请输你的成绩："+ score);
		
		if (score >=PASS)
		{
			System.out.println("very good!");
		}
		else
			System.out.println("very bad !");
		System.out.print("再见");
		*/
		/***************************************************/
		/*
		Scanner in = new Scanner(System.in);
		
		System.out.print("请输入小于7的数字:");
		int BJT = in.nextInt();
		switch(BJT)
		{
			case 1:
				System.out.println("今天星期1，");
				break;
			case 2:
				System.out.println("今天星期2，");
				break;
			case 3:
				System.out.println("今天星期3，");
				break;
			case 4:
				System.out.println("今天星期4，");
				break;
			case 5:
				System.out.println("今天星期5，");
				break;
			case 6:
				System.out.println("今天星期6，");
				break;
			case 7:
				System.out.println("今天星期7，");
				break;
			default:
				System.out.println("输入的数字大于7了");
			
		}
		*/
		/************练习题*****************************/
		/*
		System.out.print("请输入0-2359之间的数字:");
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
				System.out.println("BJT为:0"+BJT);
				
			}
			else
			{
				System.out.println("BJT为:"+BJT);
			}
			if(UTC<10)
			{
				System.out.println("UTC为:0"+UTC);
				
			}
			else
			{
				System.out.println("UTC为:"+UTC);
			}
			
				
		}
		else
		{
			System.out.print("超出范围，重新输入:");
		}
		*/
		
		System.out.print("请输入11-59之间的数字:");
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
					System.out.print("输错了");
				
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
					System.out.println("又输错了");
					
					
			}
		}
		else
		{
			System.out.print("超出范围，重新输入:");
		}
		
		
	
	}
	

}
