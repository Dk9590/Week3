package week3Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {


	public static void main(String[] args) {
		

		int[] data = {40,20,30,45,60,80,90,100,205,105};
		
		//a) Create a empty Set Using TreeSet
		Set<Integer> numset = new TreeSet<Integer>();
		List<Integer> numlist = new ArrayList<Integer>();
		
		//b) Declare for loop iterator from 0 to data.length and add into Set
		for(int i=0;i<data.length;i++) {
			numset.add(data[i]);
		}
		
		//c) converted Set into List
		numlist.addAll(numset);

		//d) Print the second last element from List
		System.out.println( numlist.get(numlist.size()-2));				
	}
}

