package AllTypesOfCollections;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList----it will allows to sore homogenous and heterogenous data
		//ArrayList al = new ArrayList();
		
		
		// ArrayList  <Integer> al = new ArrayList <Integer>();   ----- allowa only Integer data 
		//ArrayList <String> al new ArrayList<String>();     ......allows only string i.e: homogenous
		
	//	List al = new ArrayList();
		
		//add new elements to arraylist
		ArrayList al = new ArrayList();
		al.add("Welcome");
		al.add('A');
		al.add(10);
		al.add(23.45);
		al.add(true);
		System.out.println(al); //[Welcome, A, 10, 23.45, true]
		
		
		//size of arraylist
	System.out.println("Number of elements in a ArrayList: " + al.size()); // Number of elements in a ArrayList: 5
	
	//remove
	al.remove(4);// 4 is index
	System.out.println("After removing elemnt from arraylist:" + al); //After removing elemnt from arraylist:[Welcome, A, 10, 23.45]

	
	//inser the new element n the middel of arraylist
	//add(index, object)
	al.add(2, "String");
	System.out.println("after adding new element in the middle of Arraylis:"+ al);//[Welcome, A, String, 10, 23.45]
	
	//read/retrieve the secifi value from arraylist
	System.out.println(al.get(3));
	
	//change element/replace element
	al.set(2, "Pthon");
	System.out.println("after replcing element:" + al); //[Welcome, A, Pthon, 10, 23.45]
	
	//verify /check is presnt or not ----returing true/false
	System.out.println(al.contains("Python"));
	System.out.println(al.contains("Pthon"));
	
	
	//ismpty()
	System.out.println(al.isEmpty());//false
	
	// for loop
	/*System.out.println("reading elements using for loop......");
	
	for (int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	*/
	
	///for each loop
	/*System.out.println("Reading elements using for each loop.....");
	for(Object e:al)
	{
		System.out.println(e);
		
	}*/
	
	//iterator()
	System.out.println("Reading elements using Interator....");
	Iterator it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next()); //printing element and move to next element
	}
			
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
