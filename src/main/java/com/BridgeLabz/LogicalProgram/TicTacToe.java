package com.BridgeLabz.LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	static boolean status = true;
	static ArrayList<Integer> playerPositon = new ArrayList<>();
	static ArrayList<Integer> cpuPosition = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

	try {
		char[][] gamrBoard = {  { ' ', '|', ' ', '|', ' ' },
								{ '_', '+', '_', '+', '_' },
								{ ' ', '|', ' ', '|', ' ' },
								{ '_', '+', '_', '+', '_' },
								{ ' ', '|', ' ', '|', ' ' } };
		// calling method  printing 
		printBoard(gamrBoard);
		while (status) {
			System.out.println("enter your postion in keyboard b/w (1-9)");
			int playerPos = sc.nextInt();
			while (playerPositon.contains(playerPos) || cpuPosition.contains(playerPos)) {
				System.out.println("place taken enter correct postion! ");
				playerPos = sc.nextInt();
			}
			System.out.println(playerPos);

			placePiece(gamrBoard, playerPos, "player");

			String result = checkWinner();
			if (result.length() >= 0) {
				System.out.println(result);
			}

			// generating CPU position and placing piece according to there generating the
			// CPU position
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			while (playerPositon.contains(cpuPos) || cpuPosition.contains(cpuPos)) {
				cpuPos = rand.nextInt(9) + 1;
			}
			placePiece(gamrBoard, cpuPos, "cpu");

			printBoard(gamrBoard);
			result = checkWinner();
			if (result.length() >= 0) {
				System.out.println(result);
			}

		}
	} catch (Exception e) {
		System.out.println("ENTER VALID INPUT:\nONLY NUMBER VALUE WHICH IS B/W 1-9: " );
		System.out.println("RUN AGAIN:");
	}
}
	// placing all piece of based on the user
	public static void placePiece(char[][] gamrBoard, int pos, String user) {
		char symbol = ' ';
		if (user.equals("player")) {
			symbol = 'x';
			playerPositon.add(pos);

		} else if (user.equals("cpu")) {
			symbol = 'O';
			cpuPosition.add(pos);
		}
		switch (pos) {
		case 1:
			gamrBoard[0][0] = symbol;
			break;
		case 2:
			gamrBoard[0][2] = symbol;
			break;
		case 3:
			gamrBoard[0][4] = symbol;
			break;
		case 4:
			gamrBoard[2][0] = symbol;
			break;
		case 5:
			gamrBoard[2][2] = symbol;
			break;
		case 6:
			gamrBoard[2][4] = symbol;
			break;
		case 7:
			gamrBoard[4][0] = symbol;
			break;
		case 8:
			gamrBoard[4][2] = symbol;
			break;
		case 9:
			gamrBoard[4][4] = symbol;
			break;
		default:
			System.out.println(" ENTER CORRECT NUMBER B/W 1-9");
			break;
		}
	}

	// printing board from............
	private static void printBoard(char[][] gamrBoard) {
		for (char[] cs : gamrBoard) {
			for (char c : cs) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static String checkWinner() {
		List<Integer> topRow = Arrays.asList(1, 2, 3);
		List<Integer> midRow = Arrays.asList(4, 5, 6);
		List<Integer> botRow = Arrays.asList(7, 8, 9);
		List<Integer> leftCol = Arrays.asList(7, 4, 1);
		List<Integer> midCol = Arrays.asList(8, 5, 2);
		List<Integer> rightCol = Arrays.asList(9, 6, 3);
		List<Integer> cross1 = Arrays.asList(1, 5, 9);
		List<Integer> cross2 = Arrays.asList(7, 5, 3);
		@SuppressWarnings("rawtypes")
		List<List> winning = new ArrayList<>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(rightCol);
		winning.add(midCol);
		winning.add(cross1);
		winning.add(cross2);
		for (List<?> l : winning) {
			if (playerPositon.containsAll(l)) {
				status = false;
				return "Congratulation!! you won the Game!!!";

			} else if (cpuPosition.containsAll(l)) {
				status = false;
				return " Cpu won ";
			} else if (playerPositon.size() + cpuPosition.size() == 9) {
				status = false;
				return " Draw match";
			}
		}

		return " ";

	}

}
