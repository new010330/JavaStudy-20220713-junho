package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 */
		
		String str = "abcdefghijk";
		
		for(int i = 0; i < 11; i++) {
			String substr = str.substring(i, i + 1);
			System.out.println(substr);
		}
		
		
	}

}
