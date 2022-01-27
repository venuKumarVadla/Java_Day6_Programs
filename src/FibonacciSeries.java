
public class FibonacciSeries {
	
	
	
	
	public static void main(String[] args) {

	System.out.println("This is a fibanacci  ");
	
	int n1 = 0;
	int n2 = 1;
	int n = n1 + n2;
	int i;
	
for (i=2;i<10; i++){
	  n=n1+n2;  
	  
 System.out.println(" " + n);
	 n1 = n2;
	 n2 = n;
	 n = n1 + n2;
     }

	}
}
