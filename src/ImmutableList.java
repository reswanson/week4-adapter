import java.util.ArrayList;

public class ImmutableList implements IImmutableList {

	// ----------------------

	private String tripName;
	ArrayList<String> locations;
	// ArrayList<Int> stuff;

	String myinternalstring = "";

	
	
	// method  I just created to start playing with concatting two strings.	
	public String keeptrack(String mystr) {
		// This is the string I want to keep adding things to.
		this.myinternalstring = this.myinternalstring + mystr;
		System.out.println("in keeptrack: " + this.myinternalstring);
		return (this.myinternalstring);
	}

	public String printit() {
		return (this.myinternalstring);
	}

	
	
	
	
	// Your methods from Trip
	public void Trip(String tripName) {
		this.tripName = tripName;
		locations = new ArrayList<String>();
	}

	public void addLocation(String location) {
		System.out.println("Adding location" + location);
		locations.add(location);
	}

	// Getters and Setters
	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	
	
	// Samples from W3schools for an interface.
	// ----------------------

	public void animalSound(String says) {
		System.out.println("The pig says in ImmutableList: " + says);
	}

	public void eat(String food) {
		System.out.println("im hungry, im gonna eat: " + food);
	}

	public void sleep(int[] howlong) {
		// just picking the first element of array for fun to make sure I can pass in
		// array
		System.out.println("taking a long snooze: " + howlong[0]);
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
		return (0);
	}

	/**
	 * Returns the concatenation of the current list and other list.
	 * 
	 * @param list The other list
	 * @return An immutable list containing elements from both list.
	 */
	// public IImmutableList concat(IImmutableList list) {
	// Took the code from the keeptrack method above, baby steps to concat string

	// this.myinternalstring = this.myinternalstring + mystr;
	// System.out.println("in concat" + this.myinternalstring);
	// return(this.myinternalstring);
	// }

	/**
	 * Returns the number of elements in the list.
	 * 
	 * @return number of elements in list.
	 */
	public int size() {
		return (0);
	}

	/**
	 * Return a string presentation of the list. The content is enclosed in [ ],
	 * Each element is separated by a comma.
	 * 
	 * @return string representation of the list.
	 */
	@Override
	public String toString() {
		// for (ArrayList<Int> t : this.stuff) {
		// // Build string to return
		// return()
		// System.out.println(t.getTripName() + " - " + t.getLocations().size());
		//
		// }
		return (this.myinternalstring);
	}

}
