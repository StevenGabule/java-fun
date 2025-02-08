package fundamental;

import java.io.IOException;

public class GuessGame {
	public static void main(String[] args) throws IOException {
		boolean found = false;
		char answer = 'K';
		char ch;
		do {
			ch = (char) System.in.read();
			System.out.println(ch);
			if(ch == answer) {
				found = true;
				System.out.println("You found it!");
			} else {
				if(ch < answer) {
					System.out.println("Too low");
				} else {
					System.out.println("Too High");
				}
			}
		} while(!found);
	}
}
