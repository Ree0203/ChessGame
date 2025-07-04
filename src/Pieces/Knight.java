package Pieces;

public class Knight extends Piece{

    public Knight(int color, int col, int row) { 
        super(color, col, row); 
        if(color == Piece.BLACK) { 
            pieceImage = getImage(1*64, 0); 
        } else { 
            pieceImage = getImage(1*64, 3*64); 
        }
    }
}
