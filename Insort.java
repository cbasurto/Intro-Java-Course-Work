//cbasurto: hw 3 problem 4 insort java to carry out insertion sort

import java.util.ArrayList;
import java.util.Arrays;


public class Insort {

    //defining mutator InPlace that takes int in Array list an
    public static void insertInPlace(int n,ArrayList<Integer> al) {
	int i=n-1;
	while(i >= 0)
	    {
	    if(al.get(n) < al.get(i))
		{
		int tmp = al.get(n);
		al.set(n,al.get(i));
		al.set(i, tmp);
		n--;
		i--;
		}
	    else {
		//not sure this is right, but otherwise the second sorted
		//array would not print out
		break;}
	    }
    }
    //input ar integers to construct array and return sorted arraylist of
    //integers alNew
    public static ArrayList<Integer> insort(int [] ar) {
	ArrayList<Integer> alNew = new ArrayList<Integer>();
	alNew.add(ar[0]);
	int i;
	//ar.length to insert one by one in sorted manner
	for(i=1;i<ar.length;i++) {
	    alNew.add(ar[i]);
	    insertInPlace(i, alNew);
	}
	return alNew;
    }
    //main method to defie arr, print and call insort 
    public static void main(String[] args) {
	int[] arr = {1,-1,22,-22,3,34,3,23,54,23,-21};
	System.out.print("Original array:\n{");
	for(int i=0;i<arr.length-1;i++) {
	    System.out.print(arr[i]+",");
	}
	System.out.println(arr[arr.length-1]+"}");
	System.out.println("Now Sorted: "+insort(arr).toString());
    }
    
}
