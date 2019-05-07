package day05;

public class suzhizhiDemo {

	public static void main(String[] args) {
		int[] nums= {8,7,3,9,5,4,1};
		int max=nums [0];
		int min=nums [0];
		for(int j=1;j<nums.length;j++) {
			if (nums [j]<min) {
				min=nums [j];
			}
			}
		for(int i=1;i<nums.length;i++) {
			if (nums [i]>max) {
				max=nums [i];
			}
		}System.out.println("最大值"+max);
		System.out.println("最小值"+min);
	}

}
