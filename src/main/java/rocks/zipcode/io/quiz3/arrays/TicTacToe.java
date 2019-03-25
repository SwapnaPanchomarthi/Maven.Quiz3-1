package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
private String[][] board;
    public TicTacToe(String[][] board) {
        this.board=board;

    }

    public TicTacToe() {

    }

    public String[] getRow(Integer value) {
        String [] s= new String[3];
        String[] row1=new String[] {"X", "O", "X"};
        for(int i=0; i<row1.length;i++)
        {
            s[i]=row1[i];

        }

        return s;

    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
      return null;
    }
}
