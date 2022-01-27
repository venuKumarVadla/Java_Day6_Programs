
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num = 6426;
	    int reversedNum = 0;
	    System.out.println("Original Number: " + num);

	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversedNum = reversedNum * 10 + digit;
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversedNum);
	  }
	
	}
