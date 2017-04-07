package presentation;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		SortedSet<Integer> hs = new TreeSet<Integer>();
		
		hs.add(12);
		System.out.println(hs.toString());
		
		hs.add(10);
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add(4);
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add(7);
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add(100);
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		hs.add(43);
		System.out.println("------------------------");
		System.out.println(hs.toString());
		
		System.out.println(" ");
		
		//parcourir
		Iterator it = hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

		
		
	

}
