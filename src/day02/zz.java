package day02;
import java.util.Scanner;

public class zz {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     /*System.out.println("小明的成績");
     int a=scan.nextInt();
     System.out.println("小紅的成績");
         int b=scan.nextInt();
     System.out.println("小剛的成績");
            int c=scan.nextInt();
     System.out.println("平均分等於：");
            double z=(a+b+c)/3;
          System.out.println(z);*/          
	   System.out.println("請輸入草料總數：");
	   double x=scan.nextDouble();
	   System.out.println("一頭牛吃的數：");
	   double y=scan.nextDouble();
	   System.out.println("夠多少頭牛吃的：");
	      int q=(int)(x/y);
     System.out.println(q);	     
	
	String sex=scan.next();
	System.out.println(sex);
	}
	
}