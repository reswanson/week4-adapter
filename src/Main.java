import java.util.ArrayList;



public class Main {

	public static void main(String[] args){
		//IImmutableList list1 = new ImmutableList(new int[]{1,2,3});

		//IImmutableList list1 = new ImmutableList();

		
		// working with the animal classes
		IImmutableList list1 = new ImmutableList();
		list1.animalSound("oink");
		list1.eat("pizza");
		list1.sleep(new int[]{1,2,3});
		
		
		///// STUCK HERE               how is it of type IImmutableList?
		//list1.concat(list1.???);


		// Trying to add a concat feature of just a string	
		list1.keeptrack("123");
		list1.keeptrack("456");
		list1.keeptrack("789");


		System.out.println(" in main, hereis my concatted list" + list1.printit());
		

		//create the trip list
		ArrayList<Trip> tripList = new ArrayList<Trip>();
		Trip tripOne = new Trip("Hawaii");
		Trip tripTwo = new Trip("Bali");
		tripList.add(tripOne);
		tripList.add(tripTwo);
		tripOne.addLocation("CostaRica");

		//loop through all the lists and detail them and the number of locations in the trips
		for (Trip t : tripList) {
			System.out.println(t.getTripName() + " - " + (t.getLocations().size()+1));  // Adding 1 as it starts at 0
		}

		
		// From this weeks assignment.
		
		//IImmutableList list1 = new ImmutableList(new int[]{1,2,3});
		//IImmutableList list2 = new ImmutableList(list1);
		//IImmutableList list3 = list1.concat(list2);
		//IImmutableList list4 = new ImmutableList(new int[]{4,5,6,7});
		//IImmutableList list5 = list1.concat(list4.concat(list3));
		//System.out.println(list1);
		//System.out.println(list2);
		//System.out.println(list3);
		//System.out.println(list4);
		//System.out.println(list5);
	}
}
