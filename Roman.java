//cbasurto: problem 7 homework 0 program to print out roman numerals

import java.util.Scanner;
      public class Roman
      {
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Type in a one or two digit number: ");
        int x = in.nextInt();

        
        //get both digits of x using division by 10 to get the first
        //digit and  the remainder x%10 to get the second
        int tens = x/10;
        int units = x%10;

    
      //romanNumeral is the concatenation of roman tens and roman
      //units. Use the methods below (tens2roman and units2roman)
      //to obtain the roman numerals for the tens and the units you
      //computed above.
     
	String romanNumeral = tens2roman(tens) + units2roman(units);
	
	System.out.print(x+" as a roman numeral is ");
	System.out.println(romanNumeral);
	}  //end of main


// now add the following methods

  //a method to translate tens to  roman tens: 
  //one of "XC", "LXXX", "LXX", "LX","L", "XL", "XXX","XX" or "X"
 public static String tens2roman(int x){

    String romanValue="";

    if(x==0)
      romanValue = "";
    else if (x==1)
      romanValue = "X";
    else if (x==2)
      romanValue = "XX";
    else if (x==3)
	romanValue = "XXX";
    else if (x==4)
      romanValue = "XL";
    else if (x==5)
      romanValue = "L";
    else if (x==6)
	romanValue = "LX";
    else if (x==7)
      romanValue = "LXX";
    else if (x==8)
      romanValue = "LXXX";
    else if (x==9)
	romanValue = "XC";


     return romanValue;
      }


  //a method to translate units 9,8,7,6,5,4,3,2,1  to  roman units:
  // one of "IX","VIII","VII","VI","V","IV","III","II" or "I"
 public static String units2roman(int x){

    String romanValue2="";

    if(x==0)
      romanValue2 = "";
    else if (x==1)
      romanValue2 = "I";
    else if (x==2)
      romanValue2 = "II";
    else if (x==3)
	romanValue2 = "III";
    else if (x==4)
      romanValue2 = "IV";
    else if (x==5)
      romanValue2 = "V";
    else if (x==6)
	romanValue2 = "VI";
    else if (x==7)
      romanValue2 = "VII";
    else if (x==8)
      romanValue2 = "VIII";
    else if (x==9)
	romanValue2 = "IX";


     return romanValue2;


    }

}
