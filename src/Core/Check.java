package Core;

import java.util.ArrayList;

public class Check {
    private final ArrayList<Integer> blockSquares; // squares that the checked color can go to to avoid check
    private final int checkerSquare;

    public Check(ArrayList<Integer> blockSquares, int checkerSquare) {
        this.blockSquares = blockSquares;
        this.checkerSquare = checkerSquare;
    }

    /*
       check right next to king OR knight check == no piece can block
     */

    public Check(int checkerSquare) {
        blockSquares = new ArrayList<>(); // empty
        this.checkerSquare = checkerSquare;
    }

    public ArrayList<Integer> getBlockSquares() {
        return blockSquares;
    }

    public int getCheckerSquare() {
        return checkerSquare;
    }
}
