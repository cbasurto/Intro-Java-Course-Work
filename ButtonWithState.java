import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonWithState
{
    static JButton button = new JButton("Change");
    static String state = "X";
    public static void main(String[] args)
    {
	JFrame frame = new JFrame("Changes");
	frame.setSize(400,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//inner class inside main
	class StateListener implements ActionListener
	{
	    public void actionPerformed(ActionEvent e)
	    {
		button.setText(state);
		changeState();
	    }
	}
	button.addActionListener(new StateListener());
	button.setFont(new Font("SanSerif",0,60));
	frame.add(button);
	frame.setVisible(true);
    }

    public static void changeState()
    {
	if (state.equals("X"))
	    state = "a";
	else if
	    state = "b";
	else if
	    state = "c";
	else if
	    state = "d";
	else if
	    state = "e";
	else if
	    state = "f";
	else if
	    state = "g";
    	else if
	    state = "h";
	else if
	    state = "i";
    	else if
	    state = "j";
	else if
	    state = "k";
	else if
	    state = "l";
	else if
	    state = "m";
	else if
	    state = "n";
	else if
	    state = "o";
    	else if
	    state = "p";
	else if
	    state = "q";
    	else if
	    state = "r";
	else if
	    state = "s";
    	else if
	    state = "t";
	else if
	    state = "u";
    	else if
	    state = "v";
	else if
	    state = "w";
    	else if
	    state = "x";
	else if
	    state = "y";
    	else if
	    state = "z";
	
    
    }
}

