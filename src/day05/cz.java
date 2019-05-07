package day05;

import java.util.Random;
public class cz {

	public static void main(String[] args) {
		Random ran=new Random();
		double sum=0;
		int [] arr=new int[10];
		for(int i=0 ; i<arr.length;i++) {
		int num=ran.nextInt(10);
		System.out.println(num);
		arr[i]=num;
		sum+=arr[i];
		}
		System.out.println("总和="+sum);
		System.out.println("平均数="+(sum/arr.length));
	}

}
