package fundamental;

import java.io.IOException;

public class KBIn {
	public static void main(String[] args) throws IOException {
		char ch;
		System.out.println("Press a key followed ENTER: ");
		ch = (char) System.in.read();
		System.out.println("Your key is: " + ch);
	}
}
