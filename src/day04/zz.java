package day04;
import java.util.Scanner;
public class zz {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//		    System.out.println("请输入消费金额");
		//		    int a=scan.nextInt();
		//		    if(a>=5000) {
		//		    	System.out.println("您是钻石vip");
		//		    }else if(a>=1000){
		//		    	System.out.println("您是铂金vip");
		//		    }else if (a>=500){
		//		    	System.out.println("您是黄金vip");
		//		    }else {System.out.println("您不是vip");
		//		        }	
		System.out.println("输入消费金额");
		double a=scan.nextDouble();
		System.out.println("输入你的积分");
		double b=scan.nextDouble();
		if(b>2000) {
			System.out.println("实际消费金额"+(a*0.7));
		}else if(b>1000){
			System.out.println("实际消费金额"+(a*0.8));
		}else if(b>600) {
			System.out.println("实际消费金额"+(a*0.9));
		}else {
			System.out.println("实际消费金额"+a);
		}


	}

}
