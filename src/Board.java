import javax.swing.*;

import Pieces.Bishop;
import Pieces.King;
import Pieces.Knight;
import Pieces.Pawn;
import Pieces.Piece;
import Pieces.Queen;
import Pieces.Rook;

import java.awt.*;
import java.util.ArrayList; 

public class Board extends JPanel{

    private final int SQUARE_WIDTH = 100; 
    public static ArrayList<Piece> pieces = new ArrayList<>(); 
    private static final int WHITE = 0; 
    private static final int BLACK = 1; 

    

    public void paintComponent(Graphics g) { 
        super.paintComponent(g); 
        drawBoard(g); 
        drawPieces(g);
    }

    public void drawBoard(Graphics g) { 
        boolean isWhite = true; 
        for(int i = 0; i<8; i++){ 
            for(int j = 0; j<8; j++) { 
                if(isWhite) { 
                    g.setColor(Color.decode("#eaf0d8"));
                } else { 
                    g.setColor(Color.decode("#585f6f"));
                }

                g.fillRect(j*SQUARE_WIDTH, i*SQUARE_WIDTH, SQUARE_WIDTH, SQUARE_WIDTH);
                isWhite = !isWhite; 
            }
            isWhite = !isWhite; 
        }
    }

    public void setPieces() { 
        //WHITE PIECES
        pieces.add(new Pawn(WHITE, 0, 6)); 
        pieces.add(new Pawn(WHITE, 1, 6)); 
        pieces.add(new Pawn(WHITE, 2, 6)); 
        pieces.add(new Pawn(WHITE, 3, 6)); 
        pieces.add(new Pawn(WHITE, 4, 6));
        pieces.add(new Pawn(WHITE, 5, 6));
        pieces.add(new Pawn(WHITE, 6, 6));
        pieces.add(new Pawn(WHITE, 7, 6));

        pieces.add(new Rook(WHITE, 0, 7)); 
        pieces.add(new Rook(WHITE, 7, 7)); 

        pieces.add(new Knight(WHITE, 1, 7)); 
        pieces.add(new Knight(WHITE, 6, 7)); 

        pieces.add(new Bishop(WHITE, 2, 7)); 
        pieces.add(new Bishop(WHITE, 5, 7)); 

        pieces.add(new Queen(WHITE, 3, 7)); 

        pieces.add(new King(WHITE, 4, 7)); 

        //BLACK PIECES 
        pieces.add(new Pawn(BLACK, 0, 1)); 
        pieces.add(new Pawn(BLACK, 1, 1)); 
        pieces.add(new Pawn(BLACK, 2, 1)); 
        pieces.add(new Pawn(BLACK, 3, 1)); 
        pieces.add(new Pawn(BLACK, 4, 1));
        pieces.add(new Pawn(BLACK, 5, 1));
        pieces.add(new Pawn(BLACK, 6, 1));
        pieces.add(new Pawn(BLACK, 7, 1));

        pieces.add(new Rook(BLACK, 0, 0)); 
        pieces.add(new Rook(BLACK, 7, 0)); 

        pieces.add(new Knight(BLACK, 1, 0)); 
        pieces.add(new Knight(BLACK, 6, 0)); 

        pieces.add(new Bishop(BLACK, 2, 0)); 
        pieces.add(new Bishop(BLACK, 5, 0)); 

        pieces.add(new Queen(BLACK, 3, 0)); 

        pieces.add(new King(BLACK, 4, 0)); 
    }

    public void drawPieces(Graphics g) { 
        for(Piece piece: pieces) { 
            piece.draw(g); 
        }
    }
}
