package day04;
import java.util.Scanner;
public class su {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		System.out.println("输入周几");
//		int a=scan.nextInt();
//		     if(a==1) {System.out.println("红烧排骨"); }
//		else if(a==2) {System.out.println("水煮鱼");}
//		else if(a==3) {System.out.println("佛跳墙");}
//		else if(a==4) {System.out.println("松仁玉米");}
//		else if(a==5) {System.out.println("猪肉粉条");}
//		else          {System.out.println("没吃的");}

		System.out.println("输入形状1长方形、2正方形、3三角形、4圆形");
		int a=scan.nextInt();
		switch(a) {
		case 1 :
			System.out.println("长方形");
			System.out.println("请输入长");
			int c=scan.nextInt();
			System.out.println("请输入宽");
			int h=scan.nextInt();
			System.out.println("长方形面积"+(c*h));
			break;
		case 2:
			System.out.println("正方形");
			System.out.println("请输入边长");
			int d=scan.nextInt();
			System.out.println("正方形面积"+(d*d));
			break;
		case 3:
			System.out.println("三角形");
			System.out.println("请输入底");
			int x=scan.nextInt();
			System.out.println("请输入高");
			int y=scan.nextInt();
			System.out.println("三角形面积"+(x*y/2));
			break;
		case 4:
			System.out.println("圆形");
			System.out.println("请输入半径");
			double r=scan.nextDouble();
			System.out.println("圆形面积"+(3.14*r*r));
			break;
		default:System.out.println("不匹配");
		
		
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
