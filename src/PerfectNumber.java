

import java.util.Scanner ;

public class PerfectNumber {
	private static Scanner sc;

	
	public static void main(String [] args) {
		int Number;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		perfectNumber (Number);
	}

	public static void perfectNumber (int Number) {
		int i, Sum = 0;
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("%d is a Perfect Number", Number);
		}
		else {
			System.out.format("%d is NOT a Perfect Number", Number);
		}
	
		
	}

}
