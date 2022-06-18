
public class AlphabeticalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphabeticalSort me = new AlphabeticalSort();

		String num = me.findFirstWord("Mosa","Wilson");

		System.out.println(num);
	}
	public String findFirstWord(String a, String b) {
		  //convert Strings to array for iterating over
		  char[] aArray = a.toCharArray();
		  char[] bArray = b.toCharArray();
		  
		  //loop through letters of each
		  for (int i = 0; i < aArray.length; i++) {
			  //if letter in a comes before b, then return a
			  if (aArray[i] < bArray[i]) {
				  return a;
			  }
			  
			  //check if letter in b comes before a
			  if (aArray[i] > bArray[i]) {
				  return b;
			  }
			  
			  //otherwise they are equal and you can move to the next letter
		  }
		  
		  //you need this line in case the above loop doesn't return anything.
		  //this is for the compiler. 
		  return a;
	  }
}
