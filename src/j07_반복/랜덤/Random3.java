package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		
		/*
		 * Random 클래스
		 * nextBoolean()
		 * nextInt()
		 * 
		 */
		
		Random random = new Random();
		
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		while(i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);
			System.out.print("a:" + a);
			System.out.print(" b:" + b);
			System.out.println(" c:" + c);
			
			
			if(a > b && max < a) {
				max = a;
			}else if(max < b) {
				max = b;
			}
			
			if(max < c) {
				max = c;
			}
			
			i++;
			System.out.println("최대값: " + max + "\t" + i);
			System.out.println();
		}
		
		
	}

}
