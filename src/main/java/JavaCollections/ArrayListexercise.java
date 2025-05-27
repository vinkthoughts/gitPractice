package JavaCollections;

import java.util.ArrayList;

public class ArrayListexercise {
	
	/*ArrayList Manipulation:

		In the main function, modify the ArrayList a to contain the elements "apple", "banana", "cherry", "mango", "apple" (with duplicates).

		Print the ArrayList after these additions.

		Element Removal:

		Remove the first occurrence of "apple" from the ArrayList.

		Print the ArrayList after the removal.

		Element Search:

		Check if the ArrayList contains the element "orange".

		Print a message indicating whether "orange" is found or not.

		Size and Content Check:

		Print the size of the ArrayList.

		Use a loop to iterate through the ArrayList and print the index and value of each element.*/
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
	    a.add("apple");
	    a.add("banana");
	    a.add("cherry");
	    a.add("mango");
	    a.add("apple");
	   System.out.println(a);
	    
	    a.remove(0);
	    System.out.println(a);
	    
	    a.contains("orange");
	    System.out.println(a);
	    
	    a.size();
	    System.out.println(a.size());
	    System.out.println("****************");
	    
	    for(int i=0;i<a.size();i++){
	    	 System.out.println(i);
	       System.out.println(a.get(i));
	    }
		
	}
	
	
    

}
