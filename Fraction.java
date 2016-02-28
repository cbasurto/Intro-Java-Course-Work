//cbasurto: defining the fraction class
public class Fraction
{
    //fields
    private int numerator;
    private int denominator;

    //constructors
    public Fraction(int num, int den){
	numerator = num;
	denominator = den;
    }
    
    //construct a fraction in a string
    public Fraction(String s)
    {
	int position = s.indexOf('/');
	String before = s.substring(0,position-1);
	String after = s.substring(position+1);
	numerator = Integer.parseInt(before);
	denominator = Integer.parseInt(after);
    }
    
    //addition method
    public Fraction add(Fraction f) {
	int num = this.numerator*f.numerator + f.denominator*this.numerator;
	int den = this.denominator*f.denominator;
	Fraction g = new Fraction (num, den);
	return g;
    }
    //multlipication method
    public Fraction mult(Fraction f) {
	int num = this.numerator*f.numerator;
	int den = this.denominator*f.denominator;
	Fraction g = new Fraction (num, den);
	return g;
    }  
    //division method
    public Fraction div(Fraction f){
	int num = this.denominator*f.numerator;
	int den = this.numerator*f.denominator;
        Fraction g = new Fraction (num, den);
        return g;
    }
    
    //boolean method 
    public boolean equal(Fraction f){
	return(f.denominator*this.numerator==this.denominator*f.numerator);
    }
    public String toString(){
	return("Fraction =  "+numerator+" / "+denominator);
    }
}



	
	    
