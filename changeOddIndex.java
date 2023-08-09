package week3Day2;

public class changeOddIndex{


		public static void main(String[] args) {
			
		
			String test ="changeme";

			//a) Convert the String to character array
			char[] carr = test.toCharArray();		

			//b) Traverse through each character (using loop)
			int index=0;
			for(int i=0;i<carr.length;i++) {
				index=i+1;
				//c)find the odd index within the loop
				if(index%2==1) {
					//d)within the loop, change the character to uppercase, if the index is odd else don't change
					carr[i] = Character.toUpperCase(carr[i]);					
				}				

			}

			System.out.print("The Characters at odd index positions of the String: "+ test);
			for (char c : carr) {
				System.out.print(c);
			}

		}

	}
