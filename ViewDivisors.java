//cbasurto: hw 3 problem 2 ViewDivisors

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.*;
import java.util.Arrays;


public class ViewDivisors {
	
    public static void main(String[] args)
    {
	//asking for input from user
	System.out.println("Enter a positive integer between 10 and 100: ");
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();

	//constructing integer array of divs 
	int[] divs = new int[x]; 
	
	//for loop makes sure that the divisors are everything except 1 and i
	for(int i= 1; i<x;i++) {
	    if(i==1) {
		//if i is prime, then divs[i] is 0
		divs[i]=0;
	    }
	    else {
		//call Divisors
		divs[i] = Divisors.divisors(i).size()-2;  
	    }
	}
	    divs[0]=0;
	    divs[1]=1;
	    //display bar graph in JFrame extension
	    for (int i= 1; i<x; i++)
		     {
		     System.out.println(divs[0]);
		     }
	    
	    JFrame f = new JFrame();
	    
	    f.setSize(500, 300);
	    f.setTitle("Divisors");
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    
	    
	    Array2BarGraphComponent component = new Array2BarGraphComponent(divs, 400, 300);
	    f.add(component);
	    f.setVisible(true);
	
	}
    }
    


    
