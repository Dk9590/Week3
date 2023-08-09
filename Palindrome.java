package week3Day2;

public class Palindrome {

		public static void main(String[] args) {
		
			
			//a) Declare A String value
			String value = "amanaplanacanalpanama";
			
			//b) Declare another String rev value as ""
			String reverse ="";
			
			//c) Iterate over the String in reverse order
			int len = value.length();
			
			for(int i = len-1;i>=0;i--) {
				//d) Add the char into rev
				reverse = reverse + value.charAt(i);
			}
			
			//e) Compare the original String with the reversed String, if it is same then print palinDrome 
			if(reverse.equalsIgnoreCase(value)) {
				System.out.println("The Given string  is a Palindrome" +value);
			}
			else {
				System.out.println("The Given string  is not a Palindrome" +value);
			}	
			
		}

	}

