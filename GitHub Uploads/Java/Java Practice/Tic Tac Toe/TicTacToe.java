import java.util.Scanner;
import java.util.Random;

public class TicTacToe{

    public static void main(String[] args) {

        System.out.println("<--------------------TIC TAC TOE-------------------->");

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Board ticTacTocBoard = new Board();

        String board[][] = new String[3][3];
        int choice = 1;
        int toss;
        int row;
        int column;

        do {

            System.out.print("Enter name for Player1: ");
            String player1 = input.nextLine();

            System.out.print("Enter name for Player2: ");
            String player2 = input.nextLine();

            toss = random.nextInt(2);

            if(toss==0)
                System.out.println(player1 "'s Turn");
            else if(toss==1)
                System.out.println(player2 "'s Turn");

            board = ticTacTocBoard.getBoard();

            ticTacTocBoard.showBoard(board);

            System.out.print("");

        }while (choice != 0);

    }

}