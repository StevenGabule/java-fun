package fundamental.array.Chessboard;

public class KnightValidator {
	public static boolean isValidMove(int[][] moves, int startX, int startY, int endX, int endY) {
		// Convert chess notation (e.g., "a1" to [0,0])
		int x1 = startX, y1 = startY;
		int x2 = endX, y2 = endY;

		// All possible knight moves (±2 in one axis, ±1 in the other)
		int[][] knightMoves = {
			{2,1}, {2, -1}, {-2, 1}, {-2,-1},
			{1,2}, {1, -2}, {-1, 2}, {-1,2}
		};
		for(int[] move : knightMoves) {
			if(x1 + move[0] == x2 && y1 + move[1] == y2) {
				return true;
			}
		}
		return false;
	}
}
