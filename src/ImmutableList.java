import java.util.ArrayList;



public class ImmutableList implements IImmutableList {
      
	  private String tripName;
	  ArrayList<String> locations;
	  
	  public void Trip(String tripName) {
		this.tripName = tripName;
		locations = new ArrayList<String>();
	  }
	  
	  public void addLocation(String location) {
		    System.out.println("Adding location" + location);
	        locations.add(location);
	  }
	  
	  //Getters and Setters
	  public String getTripName() {
	    	return tripName;
	  }

	  public void setTripName(String tripName) {
	    	this.tripName = tripName;
	  }

	  // ----------------------
	  
	  public void animalSound(String says) {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says in ImmutableList: " + says);
	  }
	  
	  public void eat(String food) {
		    // The body of eat() is provided here
		    System.out.println("im hungry, im gonna eat: " + food);
	  }
	  
	  public void sleep(int[] howlong) {
		    // The body of sleep() is provided here
		    // just picking the first element of array for fun to make sure I can pass in array 
		    System.out.println("taking a long snooze: " + howlong[0]);
	  }
	  
	  
	 /**
	  * Returns the element at position index
	  * @param index the index position of the list
	  * @return the value at index location
	  */
	 public int get(int index) { 
		    System.out.println("taking a long snooze: " );
		    return(0);
	 }
	 
	 /**
	 * Returns the concatenation of the current list and other list.
	 * @param list The other list
	 * @return An immutable list containing elements from both list.
	 */
	 public ArrayList<String> concat(IImmutableList list) {
	 }
	 
	 
	 /**
	 * Returns the number of elements in the list.
	 * @return number of elements in list.
	 */
	 public int size() {
		 return(0);
	 }
	 
	 
	 
	 /**
	 * Return a string presentation of the list.
	 * The content is enclosed in [ ], Each element is separated by a comma.
	 * @return string representation of the list.
	 */
	 @Override
	 public String toString() {
		 return("123");
	 }

}

