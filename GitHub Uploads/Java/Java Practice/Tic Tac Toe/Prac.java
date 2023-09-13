import java.util.Scanner;
/*
public class Prac {

    public static void main(String[] args) {

        Board ticTacToeBoard = new Board();

        String board[][] = ticTacToeBoard.getBoard();

        ticTacToeBoard.showBoard(board);

        System.out.println();

        ticTacToeBoard.putValue(1,2,"O");
        ticTacToeBoard.putValue(2,2,"O");
        ticTacToeBoard.putValue(3,2,"O");

        board = ticTacToeBoard.getBoard();

        ticTacToeBoard.showBoard(board);

      //  ticTacToeBoard.show(board);



    }

}

class Board{

    static String board[][];
    String value;

    Scanner input = new Scanner(System.in);

    public Board(){

        board = new String[3][3];

        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                board[i][j] = "X";
            }
        }

    }

    public void putValue(int i,int j,String val){

        i--; j--;
        board[i][j] = val;

    }

    public String[][] getBoard() {
        return board;
    }

/*    public void showBoard(String[][] board){

        for(int i=0 ; i<3 ; i++ ){
            for (int j=0; j<3 ; j++ ){
                if(board[i][j]==null){
                    System.out.print("  ");
                }
                if(board[i][j]=="X"){
                    System.out.print(" X ");
                }
                if(board[i][j]=="O"){
                    System.out.print(" O ");
                }
                if (board[i][j].equals(board[i+1][j].equals(board[i+2][j]))){
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }

    }

    public void showBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    System.out.print("  ");
                } else if (board[i][j].equals("X")) {
                    System.out.print(" X ");
                } else if (board[i][j].equals("O")) {
                    System.out.print(" O ");
                }

                for (String i:board){
                    for (String j:i) {
                        if (board[i][j].equals(board[i+1][j].equals(board[i+2][j])))
                            System.out.print(" | ");
                    }
                }
            }

            }
            System.out.println();
        }
    }

    public void show(String board[][]){
        for (int i=0;i<1;i++){
            for (int j=0;j<3;j++){
                if (board[i][j].equals(board[i+1][j].equals(board[i+2][j])))
                    System.out.print(" | ");
            }
        }

        for (String i:board){
            for (String j:i) {
                if (board[i][j].equals(board[i+1][j].equals(board[i+2][j])))
                    System.out.print(" | ");
                }
            }
        }

    }


}*/




/* import java.util.Scanner;

public class Prac {

    public static void main(String[] args) {

        Board ticTacToeBoard = new Board();

        String board[][] = ticTacToeBoard.getBoard();

        ticTacToeBoard.showBoard(board);

        System.out.println();

        ticTacToeBoard.putValue(1, 2, "O");
        ticTacToeBoard.putValue(2, 2, "O");
        ticTacToeBoard.putValue(3, 2, "O");

        board = ticTacToeBoard.getBoard();

        ticTacToeBoard.showBoard(board);

    }

}

class Board {

    static String board[][];
    String value;

    Scanner input = new Scanner(System.in);

    public Board() {

        board = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "X";
            }
        }

    }

    public void putValue(int i, int j, String val) {

        i--;
        j--;
        board[i][j] = val;

    }

    public String[][] getBoard() {
        return board;
    }

    public void showBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    System.out.print("  ");
                } else if (board[i][j].equals("X")) {
                    System.out.print(" X ");
                } else if (board[i][j].equals("O")) {
                    System.out.print(" O ");
                }

                if (i < 2 && board[i][j].equals(board[i + 1][j]) && board[i][j].equals(board[i + 2][j])) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}


*/

public class TicTacToe{

    public static void main(String[] args) {

        Board brd = new Board();

        String board[][] = brd.getBoard();

        brd.showBoard(board);

        brd.putValues(1,1," O ");
        brd.putValues(2,1," X ");
        brd.putValues(3,1," O ");

        board=brd.getBoard();
        brd.showBoard(board);


    }
    
}


class Board{

    private static String board[][];

    public Board(){

        board = new String[3][3];

        for (int i=0 ; i<3 ; i++)
            for (int j=0 ; j<3 ; j++)
                board[i][j] = "X";

    }

    public String[][] getBoard() {
        return board;
    }

    public void putValues(int i,int j,String val){

        --i; --j;
        board[i][j] = val;

    }

    public void showBoard(String[][] brd){

        int i,j,k;

        for (i=0 ; i<3 ; i++){
            for (j=0 ; j<3 ; j++)
                System.out.print(" " + brd[i][j] + " ");
            if (j<3)
            for (k=0;k<1;k++)
                if(brd[k][j].equals(brd[k+1][j]) && brd[k+1][j].equals(brd[k+2][j])){
                    brd[k][j] = " | ";
                    brd[k+1][j] = " | ";
                    brd[k+2][j] = " | ";
                }
            System.out.println();
        }



    }

}
