import java.util.Scanner;

public class InsertionSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 for (int i = 1; i< n; i++) {  
	            int key = a[i];  
	            int j = i-1;  
	            while ((j > -1) &&(a[j]>key)) {  
	                a[j+1] = a[j];  
	                j--;  
	            }  
	            a[j+1] = key;  
	        }  
		 System.out.println("aftr sorting");
		 for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
				
			}
	}

}
