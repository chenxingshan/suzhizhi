package day03;

import java.util.Scanner;

public class ss {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//		System.out.println("小明的英语成绩：");
		//		double english=scan.nextDouble();
		//		System.out.println("小明的音乐成绩：");
		//		double music=scan.nextDouble();
		//		boolean e=english>85;
		//		boolean m=music>60;
		//		System.out.println("能否获得一本漫画："+(e&&m));
		//		System.out.println("请输入小明的百米成绩");
		//		double time=scan.nextDouble();
		//		System.out.println("请输入小明的跳高成绩");
		//		double high=scan.nextDouble();
		//		boolean t=time<13;
		//		boolean h=high>2.2;
		//		System.out.println("能否参加此赛"+(t||h));
		//		int count=55;
		//		int room=6;
		//		int num=count%room==0?count/room:count/room+1;
		//		System.out.println(num);


		//		System.out.println("消费金额：");
		//		double money=scan.nextDouble();
		//		if(money>=1000) {
		//			System.out.println("获得200代金劵一张");
		//		}

		//		
		//		System.out.println("用户输入");
		//		int num=scan.nextInt();
		//		if(1000<=num&& num<=9999) {
		//			System.out.println("会员登陆成功");
		//		}



		//		System.out.println("输入一个年份");
		//		int year=scan.nextInt();
		//		if (year%4==0&&year%100!=0 ||year%400==0) { 
		//			System.out.println("是闰年");
		//
		//		}
		//		else                                      { 
		//			System.out.println("是平年");
		//		} 
//
//		System.out.println("输入消费金额");
//		double money=scan.nextDouble();
//		if(money>=1000) {
//			System.out.println("实际消费金额"+(money*0.8));
//		}else {
//			System.out.println("实际消费金额"+(money*0.9));
//		}
//		System.out.println("谢谢惠顾！");
       System.out.println("输入一个四位数");
       int num=scan.nextInt();
           int a=num%10,b=num%100/10,c=num%1000/100,d=num/1000;
         int  z=a+b+c+d;
         System.out.println(z);





	}

}
