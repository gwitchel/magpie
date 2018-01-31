/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int pos = sample.indexOf("slow");
		if (pos != -1) {
		    System.out.println("slow is found at position " + pos);
		  } else {
		      System.out.println("slow is not found");
		  }
		System.out.println ("sample.indexOf(\"quick\") = " + pos);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		// int indexOf(String str, int fromIndex)
		int i = 0; 
		String str = new String("Computer Science is the best, the greatest, and the most wonderful subject to study!");
		String subStr = new String("the"); 
		while (i < str.length()){
		    int j = str.indexOf(subStr, i); 
		    if( j != -1){
		        System.out.println(j);
		        i = j+3;
		      } else {
		          i = i+1; 
		      }
		  }
		
		

	}

}
