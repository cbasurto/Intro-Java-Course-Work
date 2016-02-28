//cbasurto: hw 2 problem 3 prime games
public class PrimeGames {

    public static void main(String[] args) {
	listTwinPrimes(15);
		
	System.out.println();
		
	listGoldbach(12);
	}

    public static boolean isPrime(int x){
	boolean isPrime=true;
	int divisor=2;

	if (x<2)
	    {isPrime=false;}
	else if(x>2)
	    while(divisor <= Math.sqrt(x) && isPrime){
		if(x%divisor==0)
		    {isPrime=false;}
		divisor++;
			}

	return isPrime;
    }
    //twinPrime static method
    public static boolean twinPrime(int x) {
	if(isPrime(x) && isPrime(x+2)) {
	    return true;
	}
	else {
	    return false;
	}
    }
    //listTwinPrimes static method	
    public static void listTwinPrimes(int x) {
	int i;
	for(i=3;i<=x-2;i++) {
		    if(twinPrime(i)) {
			System.out.println(i+", "+(i+2));
		    }
	}
    }
    //golbbach static method
    public static String goldbach(int e) {
	if(e%2 != 0) {
	    return "";
	}
	int i;
	for(i=2;i<=e/2;i++) {
	    if(isPrime(i)&&isPrime(e-i)) {
		return (e+"="+i+"+"+(e-i));
	    }
	}
	return "";
    }
    //listing the Goldbach
    public static void listGoldbach(int x) {
	int i;
	for(i=4;i<=x;i++) {
	    String gret = goldbach(i);
	    if(!gret.isEmpty())
		System.out.println(gret);
	}
    }
}
