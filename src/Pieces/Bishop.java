package Pieces;

public class Bishop extends Piece{
    public Bishop(int color, int col, int row) { 
        super(color, col, row); 
        if(color == Piece.BLACK) { 
            pieceImage = getImage(2*64, 0); 
        } else { 
            pieceImage = getImage(2*64, 3*64); 
        }
    }
}
