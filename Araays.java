
public class Araays {

	public static void main(String[] args) {
   int a[][]=new int[10][10];
  
int count =1;
   for(int i=0;i<3;i++) {
	   for(int j=0; j<3;j++) {
		   a[i][j]=count++;
	   }
	   }
   for(int i=0;i<3;i++) {
	   for(int j=0; j<3;j++) {
		   System.out.print(a[i][j]+"\t");
	   }
	   System.out.println();
   }
	}

}
