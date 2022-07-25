package amazonSearchFunctionality;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer> ();
		int i = 1;
		while (i <=10) {
		//	 System.out.println(i);
			i ++;	
		}
		set.add(i);
		set.add(5);
		set.add(15);
		set.add(10);
		set.add(25);
		set.add(20);
	System.out.println(set.add(i));	

	Iterator<Integer> j1 = set.iterator();
	while (j1.hasNext())
	{
		System.out.println(j1.next());
	}
	set.remove(5);
	set.remove(10);
	set.removeAll(set);

	Iterator<Integer> j2 = set.iterator();
	while (j2.hasNext())
	{
		System.out.println(j2.next());
	}
	
	System.out.println(set.add(i));	
	/*
	Iterator<Integer> j = set.iterator();
	while (j.hasNext())
	{
		System.out.println(j.next());
	}*/
	}

}
