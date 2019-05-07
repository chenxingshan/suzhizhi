package day05;
import java.util.Scanner;
public class zzdemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=1;
		while(i<=3) {
			System.out.println("请输入密码");
			int pwd=scan.nextInt();
			if(pwd==123) {
				System.out.println("输入正确");
				break;
			}
			System.out.println("密码错误");
			i++;
		}







	}

}
