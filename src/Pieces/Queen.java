package Pieces;

public class Queen extends Piece{

    public Queen (int color, int col, int row) { 
        super(color, col, row); 
        if(color == Piece.BLACK) { 
            pieceImage = getImage(3*64, 0);
        } else { 
            pieceImage = getImage(3*64, 3*64); 
        }
    }
}
