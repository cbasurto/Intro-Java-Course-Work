// cbasurto: Homework 0 Problem 6 view the picture components in frame using JFrame

import javax.swing.JFrame;

public class ViewPicture
{
    public static void main(String[] args)
    {
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.setTitle("View Circles and Rectangles");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	PictureComponent component = new PictureComponent();
	frame.add(component);

	frame.setVisible(true);
  }
}

