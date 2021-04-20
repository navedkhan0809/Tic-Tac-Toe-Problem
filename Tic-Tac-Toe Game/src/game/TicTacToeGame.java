package game;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		
		String comp = null;
		char[][] board = new char[3][3];
		
		System.out.println("Welcome to Tic-Tac-Toe Game");
		System.out.println("---------------------------");
		choosesign();
			
		System.out.println("fresh tic-tac-toe board is");
		drawboard(board);
			
	}

	/**
	 * 
	 */
	private static void choosesign() {
		String comp;
		System.out.println("You are player1,please choose x OR o");
		Scanner in = new Scanner(System.in);
		String p1 = in.nextLine();
			
			switch(p1) {
				case "o":
					p1 = "o";
					comp = "x";
					System.out.println("You(player1) choosed 'o' and comp choosed 'x'");
					break;
				case "x":
					p1 = "x";
					comp = "o";
					System.out.println("You choosed 'x' and comp choosed 'o'");
					break;
				default:
					System.out.println("Enter valid value");
				}
		
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
