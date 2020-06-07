import java.util.ArrayList;

public class ImmutableList implements IImmutableList {


	// internal struct
	int[] myinternallist;

	
	// method to accept type integer
	public ImmutableList(int[] incomingarraylist) {
		this.myinternallist=incomingarraylist;
	}


	//method to accept type IImmutableList
	public ImmutableList(IImmutableList incominglist) {

		int incominglength = incominglist.size();

		//create new internallist of incominglength size and copy element by element from incominglist
		this.myinternallist = new int[incominglength];
		for(int i = 0; i < incominglength; i++) {
			this.myinternallist[i] = incominglist.get(i);
		}
	}


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
	public IImmutableList concat(IImmutableList incominglist) {

		// get the lengths of the existing this and the new list coming in.
		int incominglistsize=incominglist.size();
		int thislistsize=this.size();


		// define array of new combined size
		int combinedlength = this.size() + incominglist.size();
		int[] myinternallist = new int[combinedlength]; 


		// replicate elements from existing list into new array
		for(int i = 0; i < thislistsize; i++) {
			myinternallist[i] = this.get(i);
		}

		// then append new elements from incominglist, start writing at 'thislistsize' in the new list
		for(int i = 0; i < incominglistsize; i++) {
			myinternallist[i+thislistsize] = incominglist.get(i);
		}

		IImmutableList newlist = new ImmutableList(myinternallist);

		return(newlist);
	}


	/**
	 * Returns the number of elements in the list.
	 * 
	 * @return number of elements in list.
	 */
	public int size() {

		// I had started to play with a trycatch to catch these then gave up.
		//NullPointerException – when the array is null.
		//IllegalArgumentException – when the given object array is not an Array.
		//ArrayIndexOutOfBoundsException – if the given index is not in the range of the size of the array.

		return (this.myinternallist.length);
	}


	/**
	 * Return a string presentation of the list. The content is enclosed in [ ],
	 * Each element is separated by a comma.
	 * 
	 * @return string representation of the list.
	 */
	@Override
	public String toString() {

		String newstring="[";

		for(int i = 0; i < this.myinternallist.length; i++) {
			newstring = newstring + this.get(i);
			if (i < this.myinternallist.length-1) {
				newstring = newstring + ",";
			}		
		} 
		newstring = newstring + "]";
		return(newstring);
	}
}
