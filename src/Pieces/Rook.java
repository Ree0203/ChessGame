package Pieces;

public class Rook extends Piece{

    public Rook(int color, int col, int row){ 
        super(color, col, row); 
        if (color == Piece.BLACK) { 
            pieceImage = getImage(0, 0); 
        } else { 
            pieceImage = getImage(0, 3*64); 
        }
    }

}
