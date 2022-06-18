
public class ReverseLinearSearch {
	public static void main(String[] args) {

		// create some dummy data for our method
		char letter = 'f';

		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',

				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		// call your methods here
		ReverseLinearSearch ls = new ReverseLinearSearch();

		System.out.println(ls.findIndexBackwards(letter, letters));
	}

	// create your first method here
	public int findIndexBackwards(char target, char[] data) {
		if (data == null ) return -1;
		
		int result = -1;
		
		//loop through the data
		for (int i = data.length - 1; i > -1; i--) {
			
			char temp = data[i];
			
			//test current element against target
			if (temp == target) {
				return i;
			}
		}
		
		return result;
	}
}
