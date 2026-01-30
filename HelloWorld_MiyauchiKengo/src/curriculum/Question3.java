package curriculum;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i ++) {   
			   System.out.println(i);  
			  } 

		
		for (int i = 2; i <= 20; i += 2) {   
			   System.out.println(i);  
			  } 
		
		
		for (int i = 10; i >= 1; i --) {   
			   System.out.println(i);  
			  } 
		
		
		int sum = 0;
		for (int i = 1; i <= 100; i ++) {  
			   sum += i;
			   }
			   System.out.println(sum);  
		
		
		String stars = "";
		for (int i = 1; i <= 5; i ++) { 
			stars += "*";
			   System.out.println(stars);
			   } 
		
		
		int count = 1; 
		  while (count <= 10) {
		   System.out.println(count);
		   count ++; // count を1ずつ増やす
		  }
		
		
		  int count2 = 2;
		  while (count2 <= 20) {
		   System.out.println(count2);
		   count2 += 2;
		  }
		  
		  
		  int count3 = 10;
		  do {
		   System.out.println("カウント:" + count3);
		   count3 --;
		  } while (count3 > 0);
		  
		  
		  int count4 = 1;
		  int sum2 =0;
		  while (count4 <= 100) {
			  sum2 += count4;
			  count4++;
		  }
		   System.out.println(sum2);
		  
		  
		   Scanner sc = new Scanner(System.in);
	        int num = 0;
	        while (num != 0) {
	            num = sc.nextInt();
	        }
	        System.out.println("終了しました");
	        sc.close();
	        
	        
	        for (int i = 1; i <= 9; i++) {
	            for (int j = 1; j <= 9; j++) {
	                System.out.printf("|%02d*%02d=%02d| ", i, j, i * j);
	            }
	            System.out.println();
	        }
	        
	        
	}

}
