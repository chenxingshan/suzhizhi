package day03;
import java.util.Scanner;
public class zy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//		int a=59,b=11;
		//		System.out.println(a+"+"+b+"="+(a+b));
		//		System.out.println(a+"-"+b+"="+(a-b));
		//		System.out.println(a+"*"+b+"="+(a*b));
		//		System.out.println(a+"/"+b+"="+(a/b));
		//		System.out.println(a+"%"+b+"="+(a%b));
		//		   System.out.println("输入一个学生的成绩");
		//      double c=scan.nextDouble();
		//      System.out.println(c=c+c*0.2);
		//          System.out.println("消费金额");
		//             double a=scan.nextDouble();
		//              System.out.println("抽到的折扣");
		//              double b=scan.nextDouble();
		//             System.out.println("实际消费："+(a*b/10));
		System.out.println("输入三个数值");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		if(a<b) {double t=a;a=b;b=t;}
		if(a<c) {double t=a;a=c;c=t;}
		if(b<c) {double t=b;b=c;c=t;}
		System.out.println("从大到小的顺序输出");
		System.out.println(a+","+b+","+c);





	}

}
