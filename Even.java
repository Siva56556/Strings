import java.util.Scanner;

public class Even {
 
public static void prime(int arr[]) {
	int min = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println(min);

}
	public static void main(String[] args) {
	
	Even pass = new Even();
	int array[]= {78,87,3,4,5,43,56};
	pass.prime(array);
	
	
}
}




