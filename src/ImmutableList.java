import java.util.ArrayList;

public class ImmutableList implements IImmutableList {


	// internal struct
	int[] myinternallist;


	// ---------These are the ones I was playing with -------------
	private String tripName;
	String locations;
	ArrayList<String> mylist;
	String myinternalstring = "";
	// ------------------------------------------------------------


	public ImmutableList(int[] incomingarraylist) {
		this.myinternallist=incomingarraylist;
	}


	public ImmutableList(IImmutableList mylist) {
		// loop thru new list and get each element and add it to the internal array.
		//<String>(mylist.toString());

		// this.myinternallist        int[]a = {1,2,3,4};
		// mylist  being passed in    int[]b = {4,16,1,2,3,22};
		//how to recreate myinternallist with a new size each time.????

		System.out.println("size inside Immutablelist: " + this.myinternalstring.length()); // + this.size());
		System.out.println("size of mylist in imutablelist: " + mylist.size()); // + this.size());


		for (int i = 0; i < this.myinternalstring.length(); i++) {
			System.out.print("===" + this.myinternallist[i] + " ");
		}

		int newlength = this.size() + mylist.size();
		System.out.println("size inside is: " + newlength); // + this.size());

		this.myinternallist = new int[newlength];
		System.arraycopy(mylist, 0, this.myinternallist, 0, mylist.size());

		this.size();
	}


	// For our assignment.
	// -----------------------------------
	/**
	 * Returns the element at position index
	 * 
	 * @param index the index position of the list
	 * @return the value at index location
	 */
	public int get(int index) {
		return (this.myinternallist[index]);
	}

	/**
	 * Returns the concatenation of the current list and other list.
	 * 
	 * @param list The other list
	 * @return An immutable list containing elements from both list.
	 */
	public IImmutableList concat(IImmutableList list) {
		//this.myinternalstring = this.myinternalstring + list;
		System.out.println("in concat");

		return(this);
		//return(this.myinternalstring);

	}

	/**
	 * Returns the number of elements in the list.
	 * 
	 * @return number of elements in list.
	 */
	public int size() {

		//NullPointerException – when the array is null.
		//IllegalArgumentException – when the given object array is not an Array.
		//ArrayIndexOutOfBoundsException – if the given index is not in the range of the size of the array.

		try {
			System.out.println("in size : " + this.myinternallist.length);
		} catch (NullPointerException e) {
			System.out.println("caught exception :" + e);
		} catch (IllegalArgumentException e ) {
			System.out.println("caught exception :" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught exception :" + e);			
		}

		System.out.println("in size : " + this.myinternallist.length);

		//if (this.myinternallist.length = null) {
		//	return (0);
		//} else { 
		return (this.myinternallist.length);
		//}
	}

	/**
	 * Return a string presentation of the list. The content is enclosed in [ ],
	 * Each element is separated by a comma.
	 * 
	 * @return string representation of the list.
	 */
	@Override
	public String toString() {
		// for (ArrayList<Int> t : this.stuff ) {
		// // Build string to return
		// return()
		// System.out.println(t.getTripName() + " - " + t.getLocations().size());
		//
		// }
		
		System.out.print("[");
		for(int i = 0; i < this.myinternallist.length; i++) {
			System.out.print(this.get(i) + ", ");
		} 
		System.out.print("]");


		return (this.myinternalstring);
	}


	// method  I just created to start playing with concatting two strings.	
	public String concatstring(String mystr) {
		// This is the string I want to keep adding things to.
		this.myinternalstring = this.myinternalstring + mystr;
		System.out.println("in concatstring: " + this.myinternalstring);
		return (this.myinternalstring);
	}

	public String printit() {
		return (this.myinternalstring);
	}

	/*
	 * // Your methods from Trip 
	 * public void Trip(String tripName) { 
	 * this.tripName = tripName; 
	 * locations = new ArrayList<String>(); 
	 * }
	 * 
	 * public void addLocation(String location) {
	 * System.out.println("Adding location" + location); 
	 * locations.add(location); }
	 * 
	 * // Getters and Setters 
	 * public String getTripName() { return tripName; }
	 * public void setTripName(String tripName) { this.tripName = tripName; }
	 */


	// Samples from W3schools for an interface.
	// ----------------------
	/* 
	public void animalSound(String says) {
		System.out.println("The pig says in ImmutableList: " + says);
	}

	public void eat(String food) {
		System.out.println("im hungry, im gonna eat: " + food);
	}

	public void sleep(int[] howlong) {
		// just picking the first element of array for fun to make sure I can pass in
		// array
	System.out.println("taking a snooze: " + howlong[0]);
	}
	 */

}
