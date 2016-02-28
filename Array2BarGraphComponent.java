//cbasurto: hw 3 problem 2 part three to take an array of ints and create a bar graph from that information


import java.awt.*;
import javax.swing.*;
import java.util.Random;


public class Array2BarGraphComponent extends JComponent{

    //fields:array of bar heights and frame dimensions
    private static int [] divs;
    private static int width;
    private static int height;


    //constructor: takes as input the array it is going to plot.
    public Array2BarGraphComponent(int [] a, int w, int h)
    {
	divs = a;
	width = w;
	height = h;
	
    }
   
    
    public static int getMax() {
	int max=divs[0];
	int i;
	for(i=1;i<divs.length;i++) {
	    if (max < divs[i])
		max=divs[i];
	}
	return max;
    }

    
    public void paint(Graphics g)
	{
	    Graphics2D g2 = (Graphics2D) g;
	    
	    int barwidth = (int) Math.round((double) width/divs.length);
	    double barheightUnit = (double) height/getMax();
	    
	    for(int i=0;i<divs.length;i++)
		{
		    Rectangle r = new Rectangle(i*barwidth+25,
						height - (int) (barheightUnit*divs[i]-25),
						barwidth,
						(int) (barheightUnit*divs[i]-5));
		    g2.setColor(Color.RED);
		    g2.fill(r);
		    g2.setColor(Color.BLACK);
		    g2.draw(r);
		}
	}
    
}


