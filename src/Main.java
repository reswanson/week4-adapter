import java.util.ArrayList;



public class Main {

	public static void main(String[] args){
		
		
		// From this weeks assignment.
		
		IImmutableList list1 = new ImmutableList(new int[]{1,2,3});
		
		System.out.println(list1);	
		
		System.out.println("MAINsize of array : " + list1.size());
		System.out.println("MAINvalue at position 1 : " + list1.get(1));

		
		IImmutableList list2 = new ImmutableList(list1);
		
		//IImmutableList list3 = list1.concat(list2);
		
		//IImmutableList list4 = new ImmutableList(new int[]{4,5,6,7});
		//IImmutableList list5 = list1.concat(list4.concat(list3));
		//System.out.println(list1);
		//System.out.println(list2);
		//System.out.println(list3);
		//System.out.println(list4);
		//System.out.println(list5);

		
		
		
		//----------------------------------------------------------------
		
		// working with the animal classes
		//IImmutableList listone = new ImmutableList(new int[]{1,2,3});

		//IImmutableList list1 = new ImmutableList();
		//list1.animalSound("oink");
		//list1.eat("pizza");
		//list1.sleep(new int[]{1,2,3});
		
		//IImmutableList list2 = new ImmutableList();
		
		//list1.concat(list2);
			
		
		// Trying to add a concat feature of just a string	
		//list1.concatstring("123");
		//list1.concatstring("456");
		//list1.concatstring("789");
		
		//list2.concatstring(list1);

		//System.out.println(" from main, here is list1: " + list1.printit());
		
		//create the trip list
		//ArrayList<Trip> tripList = new ArrayList<Trip>();
		//Trip tripOne = new Trip("Hawaii");
		//Trip tripTwo = new Trip("Bali");
		//tripList.add(tripOne);
		//tripList.add(tripTwo);
		//tripOne.addLocation("CostaRica");

		//loop through all the lists and detail them and the number of locations in the trips
		//for (Trip t : tripList) {
		//	System.out.println(t.getTripName() + " - " + (t.getLocations().size()+1));  // Adding 1 as it starts at 0
		//}

		
	}
}
