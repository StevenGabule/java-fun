package fundamental.array.Chessboard;

public class ChessGame {
	public static void main(String[] args) {
		Chessboard board = new Chessboard();
		board.printBoard();

		// Test knight move from b1 (x=0, y=1) to a3 (x=2, y=0)
		boolean isValid = KnightValidator.isValidMove(null, 0, 1, 2, 0);
		System.out.println("\nKnight move valid? " + isValid); // true

		// Test invalid knight move (vertical 2 squares)
		isValid = KnightValidator.isValidMove(null, 0, 1, 2, 1);
		System.out.println("Invalid move? " + !isValid);
		// 8 |♜|♞|♝|♛|♚|♝|♞|♜|
		// 	-------------------------
		// 7 |♟|♟|♟|♟|♟|♟|♟|♟|
		// 	-------------------------
		// 6 | | | | | | | | |
		// 	-------------------------
		// 5 | | | | | | | | |
		// 	-------------------------
		// 4 | | | | | | | | |
		// 	-------------------------
		// 3 | | | | | | | | |
		// 	-------------------------
		// 2 |♙|♙|♙|♙|♙|♙|♙|♙|
		// 	-------------------------
		// 1 |♖|♘|♗|♕|♔|♗|♘|♖|
		// 	-------------------------
		// 		a  b  c  d  e  f  g  h 
	}
}
