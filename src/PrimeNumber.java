
public class PrimeNumber {
	

public static void main(String [] args) {
	
	
	int p = 7;
	int count = 0;
	
	if (p >1) {
		for(int i=1;i<=p;i++) {
			if(p%i==0) {
				count ++;
		}
	}
		if (count==2) {
			System.out.println(" This is a Prime Number");
			
		}else {
				System.out.println(" %d This is Not a Prime Number");
	
		 }
		}
	else 
	{
		System.out.println("%d  This is not a Prime Number");
	}
	
}
}
