package game;

class TicTacToeGame {
	public static void main(String[] args) {
	System.out.println("fresh tic-tac-toe board");
	char[][] board = new char[3][3];
	
		drawboard(board);
	}

	/**
	 * @param board
	 */
	private static void drawboard(char[][] board) {
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++) {
				board[i][j] = '-';
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}

