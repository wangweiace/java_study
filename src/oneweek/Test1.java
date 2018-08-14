package oneweek;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.print("请输入数字：");
		Scanner in = new Scanner(System.in);
		System.out.println("echo:"+in.nextLine());
		System.out.println("2+3="+5);
		System.out.println(2+3+"=2+3");
		int price,amount;
		amount = in.nextInt();
		price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
		*/
		/*
		int foot;
		double inch;
		double height;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		height =  (foot + inch/12.0)*0.3048;
		System.out.print("height="+height);
		*/
		/*****练习题**************************/
		
		System.out.print("请输入华氏温度：");
		Scanner in = new Scanner(System.in);
		int F = in.nextInt();
		int C ;
		C = (int) ((F-32)/9.0*5);
		System.out.print("摄氏温度为："+ C);
	}

}
