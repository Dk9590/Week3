package week3Day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacter {
	public static void main(String[] args) {		
		
		String word = "dinesh";
		
		//a) Convert String to Character array
		char[] carr = word.toLowerCase().toCharArray();	
		
		//b) Create a new Set -> HashSet
		Set<Character> charset = new HashSet<Character>();
		Set<Character> chdupset = new TreeSet<Character>();
		
		//c) Add each character to the Set and if it is already there, remove it
		for(int i=0;i<carr.length;i++) {
			if(!(charset.add(carr[i]))) {
				chdupset.add(carr[i]);
			}			
		}		
		charset.removeAll(chdupset);
		
		
		System.out.print("Unique character is" +word);
		//d) Finally, print the set
		for(char c : charset) {
			System.out.print(c + " ");
		}
	}
}

