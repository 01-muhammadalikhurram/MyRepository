import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("<--------------------TIC TAC TOE-------------------->");

        int row;
        int col;
        boolean gameOver;

        Scanner scanner = new Scanner(System.in);
        Board ticTacToeBoard  = new Board();


        do {

            gameOver = ticTacToeBoard.showBoard();
            
            System.out.println("Enter Row and Column Number: ");
            row = scanner.nextInt();
            scanner.nextLine();
            col = scanner.nextInt();
            scanner.nextLine();

            ticTacToeBoard.setBoard(row,col);

        }while (!gameOver);

    }

}

class Board{

    static char[][] board;
    static char player;

    Board(){
        board = new char[3][3];

        player = 'X';

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                board[i][j] = ' ';

            }
        }

    }

//    public char[][] getBoard() {
//        return board;
//    }

    public void setBoard(int row,int col) {

        if (board[row][col] != ' '){
            System.out.println("Invalid! Position Already Occupied");
        }
        else{
            if(player == 'X'){
                player = 'O';
                board[row][col] = player;
            }
            else{
                player = 'X';
                board[row][col] = player;
            }
        }

    }

    public boolean showBoard(){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                System.out.print("|" + board[i][j] + "|");

            }
            System.out.println();
        }

        return gameOver();

    }

    public boolean gameOver(){

        for (int i = 0; i < board.length; i++) {
            if (board[i][0]==player && board[i][1]==player && board[i][2]==player){
                System.out.println(player + " wins!");
                return true;
            }
            else if (board[0][i]==player && board[1][i]==player && board[2][i]==player) {
                System.out.println(player + " wins!");
                return true;
            }
        }
        return false;
    }

}

