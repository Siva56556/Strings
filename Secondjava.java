import java.util.Scanner;

public class Secondjava {
	int week = 1;
	switch (week) {
	
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println ("enter your Name");
		String name = sc.next();
		System.out.println("enter your age");
		int ages =sc.nextInt();
         System.out.println("enter your quali");
         String quali=sc.next();
         System.out.println("enter percentage");
         int per = sc.nextInt();
         System.out.println("gen");
         String gender = sc.next();
         System.out.println("height");
         int high = sc.nextInt();
         System.out.println("weight");
         int weigh = sc.nextInt();
         System.out.println("pf");
         boolean pfs= sc.nextBoolean();
         if(ages>18&&ages<25) {
        	 if(quali.equals("inter")) {
        		if(per==60) {
        			if(gender.equals("males")) {
        			if(high<=100) {
        				if(weigh<=50) {
        					
        					if(pfs) {
        						
        					}else {
        						System.out.println("pfs");
        					}
        				}else {
        					System.out.println("weiss");
        				}
        				
        			}else {
        				System.out.println("heightss");
        			}
        				
        				
        			}else if(gender.equals("female")){
        				
        			}else {
        				System.out.println("genderss");
        			}
        			
        		}else {
        			System.out.println("persss");
        		}
        	 }else {
        		 System.out.println("qualss");
        	 }
        	
	}else {
		System.out.println("agess");
	}

}
}



