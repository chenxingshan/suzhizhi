package day05;

public class woniuDemo {

	public static void main(String[] args) {
		int day=0;
		double h=0;
		while(true) {
			h+=5;
			day++;
			if(h>57.6) {
				System.out.println(day);
				break;
			}h-=3.5;
			
		}
		

	}

}
