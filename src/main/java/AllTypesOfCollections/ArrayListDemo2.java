package AllTypesOfCollections;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add('X');
		al.add('Y');
		al.add('Z');
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		
		//add one collection to another arraylist
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup); //[X, Y, Z, A, B, C, D]
		
		//remove
		al_dup.removeAll(al);
		System.out.println("After removing arraylist : " + al_dup);
		
		//Sort ......collections.sort()
        		
		
	}

}
