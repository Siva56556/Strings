package loops;

import java.util.Scanner;

public class Forl {
	public static String even(int a) {
		for(int i=0;i<1; i++) {
			if(a%2==0) {
				System.out.println(a+"eve");
			}else {
				System.out.println(a+"odd");
			}
			return null ;
		}
		return null;
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
	    even(number);
	}
	

}
