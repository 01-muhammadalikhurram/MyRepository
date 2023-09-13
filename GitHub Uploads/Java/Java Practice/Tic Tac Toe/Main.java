import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args) {

    /*

        Board ticTacToeBoard = new Board();

        String board[][] = new String[3][3];

        board = ticTacToeBoard.getBoard();

        ticTacToeBoard.showBoard(board);

        System.out.println();

        ticTacToeBoard.setBoard(1,1,"O");
        ticTacToeBoard.setBoard(1,2,"O");
        ticTacToeBoard.setBoard(1,3,"O");

        board = ticTacToeBoard.getBoard();

        ticTacToeBoard.showBoard(board);

        */

        System.out.println("<--------------------TIC TAC TOE-------------------->");

        int row,column;
        char choice;
        String val;

        Scanner scanner = new Scanner(System.in);
        Board ticTacToeBoard = new Board();

        String board[][] = new String[3][3];

        board = ticTacToeBoard.getBoard();
//        Random random = new Random();

//        System.out.print("Enter name for Player 1: ");
//        String player1 = scanner.nextLine();

//        System.out.print("Enter name for Player 2: ");
//        String player2 = scanner.nextLine();

        do {

            System.out.println("Let's Start!");

            do {

                System.out.print("Enter the row number (from 1 to 3): ");
                row = scanner.nextInt();

                System.out.print("Enter the column number (from 1 to 3): ");
                column = scanner.nextInt();

                System.out.print("Enter Value (\"X\" or \"O\"): ");
                val = scanner.next();
                ticTacToeBoard.setBoard(row,column,val);

                board = ticTacToeBoard.getBoard();

                ticTacToeBoard.showBoard(board);

            }while (board == null);

            System.out.print("Do You Want to Play Again (Y/N): ");
            choice = scanner.next().charAt(0);

        }while (choice != 'N');

    }

}

class Board{

    private String board[][];

    public Board(){

        board = new String[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "n";
            }
        }

    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(int i,int j,String val) {
        --i; --j;
        board[i][j] = val;
    }

    public void showBoard(String[][] board){

        for (int i=0 ; i<board.length ; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i==0 && j==0 ) {

                    if (board[i][j].equals(board[i+1][j]) && board[i+2][j].equals(board[i+1][j])) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("|");
                        }
                    }
                    else if (board[i][j].equals(board[i][j+1]) && board[i][j].equals(board[i][j+2])) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("---");
                        }
                    }
                    else if (board[i][j+1].equals(board[i+1][j+1]) && board[i+2][j+1].equals(board[i][j+1])) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("|");
                        }
                    }
                    else if (board[i][j+2].equals(board[i+1][j+2]) && board[i][j+2].equals(board[i][j+2])) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("|");
                        }
                    }
                    else if (board[i+1][j].equals(board[i+1][j+1]) && board[i+1][j].equals(board[i+1][j+2])) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("---");
                        }
                    }
                    else if (board[i+2][j].equals(board[i+2][j+1]) && board[i+2][j].equals(board[i+2][j+2])) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("---");
                        }
                    }
                }
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }

    }

}

/*
    public void showBoard(String board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == null){
                    System.out.print(" " + board[i][j] + " ");
                }
                else{
                    System.out.print(" " + board[i][j] + " ");
                        for (int k = 0; k < 1; k++) {
                            if (board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]))
                                System.out.print("---");
                            else if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]))
                                System.out.print("---");
                            else if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]))
                                System.out.print("---");
                            else if(board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]))
                                System.out.print("|");
                            else if(board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]))
                                System.out.print("|");
                            else if(board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]))
                                System.out.print("|");
                            else if(board[0][0].equals(board[1][1]) && board[2][2].equals(board[0][0]))
                                System.out.print("\\");
                            else if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]))
                                System.out.print("/");
                        }
                    }
                }
            }
            System.out.println();
        }

*/