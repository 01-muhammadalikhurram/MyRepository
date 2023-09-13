class Board{

    String board[][];

    public Board(){
        board = new String[3][3];
    }

    public String[][] getBoard() {
        return board;
    }

    public void putValue(int i,int j,String val){
        board[i][j] = val;
    }

    public void showBoard(String[][] board){

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++) {
                System.out.print(board[][]);
                for (int k=0 ; k<1 ; k++)
                if(brd[k][j].equals(brd[k+1][j]) && brd[k+1][j].equals(brd[k+2][j]))
                    System.out.print("|");
            }
            System.out.println();
        }

    }

}