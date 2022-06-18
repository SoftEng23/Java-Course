
public class IfString {
public static void main(String[] args) {
	
/*
	String x = "bob";
	String y = x;
	String b = new String("bob");
	String a = "bob";
	if(x == y)System.out.print("1");
	if(x == b)System.out.print("2");
	if(x == a)System.out.print("3");
	
*/
	/* Integer i = new Integer(0);
	if(i == 0)System.out.print("=");
	if(i != 0)System.out.print("!");
	if(i > 0)System.out.print(">");
	if(i < 0)System.out.print("<");
	*/
	
	/*int i = 0;
	while(i < 5) {
		if(i == 0)System.out.print(0);
		i++;
		System.out.print((i > 2 ? 1 : 2));
	}
	*/
	
	/*for(byte i = 0; i < 5; i++) {
		System.out.print(i);
		*/
	
	int i = 0;
	while(i != 4) {
		switch(i) {
		case 0:
			System.out.print(0);
			break;
		case 1:
			System.out.print(1);
		default:
			System.out.print("X");
			break;
		}
		i++;
	}
	
	
}
}