//cbasurto hw 2 problem 2 after creating indexOf test for characters c and s
//using the word arugula and character r for this example

public class MyString {
	
    public static void main(String[] args) {
	String s="arugula";
	System.out.println("Index of character r in string "+s+" is: "+findIndex(s, 'r'));
    }

    public static int findIndex(String s, char c) {
	int pos=-1;
	int count=0;
	while(count < s.length()) {
	    // looking at every char in string to see if it matches character c
	    if(s.charAt(count)==c) { 
		pos=count;
		break;
	    }
	    count++;
	}
	return pos;
    }
    
}
