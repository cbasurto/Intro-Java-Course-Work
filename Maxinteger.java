//cbasurto: creating enhanced for loop to find max integer in array list

import java.util.ArrayList;

public class Maxinteger
{
    public static intmax(ArrayList<Integer>al)
    {
	int i = al.get(0);

	for (int e: al)
	    {
		if (i<e)
		    {
			i = e;
		    }
	    }
	return i;
    }
}

