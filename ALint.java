//cbasurto: hw 4 problem 1 making an array list from an array
import java.util.Arrays;

public class ALint
{
    //field
    private int [] arr;

    //constructors
    public ALint()
    {
	arr = new int [0];
    }

    //method to add an item to an array
    public void add(int item)
    { //Arrays.copyOf replicates the first array
	//int [] newArray = new arr [1];
	arr = Arrays.copyOf(arr, arr.length + 1);
	arr[arr.length-1] = item;
    }

    //void add(int index,int item)
    public void add(int index, int item)
    { 
	arr = Arrays.copyOf(arr, arr.length + 1);
	int i = 0;
	for (i= arr.length-1; i>index; i--)
	    {
		arr[i] = arr[i-1]; //shifting everything to the right by 1 position
	    }
	arr[index] = item; //inserting the item at index 
    }
    //int get(int index)
    public int get(int index)
    {
	return arr[index]; //access value at index and return
    }
    //void set(int index, int item)
    public void set(int index, int item)
    {
	arr[index] = item; //arr[index] to access value at given index in array
    }
    //int remove(int index) (return the value you removed)
    public int remove(int index)
    {
	int ret = arr[index];
	int i = index;
	for (i=index; i<=arr.length-2; i++)
	    {
		arr[i]= arr[i+1];
	    }
	arr = Arrays.copyOf(arr, arr.length -1);
	return ret;
    }
		   
    //int size()
    public int size()
    {
	return arr.length;
    }			     
    //String toString()
    public String toString()
    {
	String outStr = "";
	int i = 0;
	for (i=0; i<arr.length; i++)
	    {
		outStr = outStr + arr[i] + " ";
	    }
	return outStr;
    }
}
