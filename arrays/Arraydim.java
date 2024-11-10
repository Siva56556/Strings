package arrays;

public class Arraydim {

	public static void main(String[] args) {
		int a[]= new int[6];
	    int b [] = new int[10];
	
		
		
		for(int i=0; i<a.length; i++) {
			a[i]=i;
			
		
		}
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
			
		}
			
		for(int i=0; i<a.length; i++) {
	        System.out.println(b[i]);
			}
		
	
				
				

	}

}
int arr[]= {1,8,3,9,56};

for(int i=0;i<arr.length;i++) {
	for(int j=i+1; j<arr.length; j++) {
		if(arr[j]<arr[i]) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]= temp;
		}
	}
}
System.out.println();
for(int a:arr) {
	System.out.println(a);
	
}

int arr[]= {66,8,3,9,56};
int min = arr[0];

for(int i=0;i<arr.length;i++) {
	if(min>arr[i]) {
		min=arr[i];
	}
}
System.out.println(min);

