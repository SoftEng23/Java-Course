
public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = {1,2,3,4,5};
		/*
		elements[4] = 1;
		elements[0] = 5;
	    
		System.out.println(elements[0]+ " " + elements[4]);
		*/
		//store the first element temporarily 
				int temp = elements[0]; 
				
				//swap the elements 
				elements[0] = elements[elements.length-1]; 
				elements[elements.length-1] = temp; 
				
				//print the results 
				for (int i = 0; i < elements.length; i++){ 
					System.out.println(elements[i]); 
				} 
	}

}

