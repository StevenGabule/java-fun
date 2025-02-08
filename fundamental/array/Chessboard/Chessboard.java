package fundamental.array.Chessboard;

public class Chessboard {
	private static final int SIZE = 8;
	private String[][] board = new String[SIZE][SIZE];

	// Initialize board with empty squares and pieces
	public Chessboard() {
		// empty squares
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = " ";
			}
		}

		// Place initial pieces
		board[0] = new String[] {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"};
		board[1] = new String[] {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"};
		board[6] = new String[] {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"};
		board[7] = new String[] {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"};
	}

	public void printBoard() {
		for(int i = 0; i < SIZE; i++) {
			System.out.print((8 - i) + " |");
			for (int j = 0; j < SIZE; j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println("\n  -------------------------");
		}
		System.out.println("    a  b  c  d  e  f  g  h ");
	}
	
}
