//cbasurto: hw 2 problem 4 oddsum
public class Oddsum
{
	
    public static void main(String[] args) {
	    System.out.println("Sum of first 6 odd numbers is "+sumodd(6));
	}

    //method to add first n odd integers
    public static int sumodd(int n) {
    	int count=1; // to track the number of odd numbers
    	int num=1; // to iterate over odd numbers like 1,3,5,7
    	int sum=0; // to hold the sum
    	while( count <= n ) {
	    sum = sum + num;
	    num=num+2;
	    count++;
    	}
    	return sum;
    }
	
}
