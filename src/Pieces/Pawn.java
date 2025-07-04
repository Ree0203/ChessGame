package Pieces;

public class Pawn extends Piece{

    public Pawn (int color, int col, int row) { 
        super(color, col, row); 
        if(color == Piece.BLACK) { 
            pieceImage = getImage(0, 64); 
        } else { 
            pieceImage = getImage(0, 2*64); 
        }
    }

}
