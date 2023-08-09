package week3Day2;

public class NameReverse {
public static void main(String[] args) {
	String name = "Dinesh";
	 char[] resultarray = name.toCharArray();
	 StringBuilder str = new StringBuilder();
	 System.out.println(str.append(resultarray));

     //iteration

     for (int i = resultarray.length - 1; i >= 0; i--)

      // print reversed String

         System.out.print(resultarray[i]);
}
}
