package Pieces;

public class King extends Piece{

    public King(int color, int col, int row) { 
        super(color, col, row); 
        if(color == Piece.BLACK) { 
            pieceImage = getImage(4*64, 0); 
        } else { 
            pieceImage = getImage(4*64, 3*64); 
        }

    }
}
