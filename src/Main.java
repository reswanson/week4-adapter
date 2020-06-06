import java.util.ArrayList;



public class Main {

	 public static void main(String[] args){
		 //IImmutableList list1 = new ImmutableList(new int[]{1,2,3});
		 
//IImmutableList list1 = new ImmutableList();


IImmutableList list1 = new ImmutableList();

list1.animalSound("oink");
list1.eat("pizza");
list1.sleep(new int[]{1,2,3});


//create the trip list
ArrayList<Trip> tripList = new ArrayList<Trip>();
Trip tripOne = new Trip("Hawaii");
Trip tripTwo = new Trip("Bali");


tripList.add(tripOne);
tripList.add(tripTwo);
tripOne.addLocation("CostaRica");


//loop through all the lists and detail them and the number of locations in the trips
for (Trip t : tripList) {
    System.out.println(t.getTripName() + " - " + (t.getLocations().size()+1));
}



//tripList.
///create some trips
//Trip tripOne = new Trip("Hawaii");


		 //IImmutableList list1 = new ImmutableList(new int[]{1,2,3});

		 //IImmutableList list2 = new ImmutableList(list1);
		 //IImmutableList list3 = list1.concat(list2);
		 //IImmutableList list4 = new ImmutableList(new int[]{4,5,6,7});
		 //IImmutableList list5 = list1.concat(list4.concat(list3));
		 
		 /*String list1="123";
		 String list2="123";
		 String list3="123";
		 String list4="123";
		 String list5="123";*/
		 //System.out.println(list1);
		 //System.out.println(list2);
		 //System.out.println(list3);
		 //System.out.println(list4);
		 //System.out.println(list5);
		 }
}
