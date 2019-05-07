package day04;
import java.util.Scanner;
import java.util.Random;
public class cdemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int flag=0;
	int i=1;
	while(i<=5) {
		System.out.println("输入第"+i+"个数字");
		int num=scan.nextInt();
		if (num<0) {
			flag=1;
		}
		i++;
	
		}
	if (flag==1) {
		System.out.println("youfushu");
	}else {
		System.out.println("meifushu");
	}
	}
	
    
	}


