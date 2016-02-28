//cbasurto: hw 3 problem 1 creating a divisor array list

import java.util.ArrayList;


public class Divisors {

    public static ArrayList<Integer> divisors(int x) {
	ArrayList<Integer> divs = new ArrayList<Integer>();
	
	int i;
	for(i=1;i<=x;i++) {
	    if(x%i==0) {
		divs.add(i);
	    }
	}
	return divs;
    }
	
    public static void main(String[] args) {
	System.out.println(divisors(6).toString());
    }
	
}
