package day05;

public class sss {

	public static void main(String[] args) {
//       int sum=0;
//       int i=1;
//       for(i=1;i<=100;i++) {
//    	   if(i%3==0) {
//    		   continue;
//    	   }sum+=i;
//       }System.out.println(sum);
		int []arr=new int[6];
		arr[1]=20;
		arr[3]=35;
		arr[arr.length-1]=42;
		  
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}System.out.println(sum);
		
		
		
		
		
		
	}

}
