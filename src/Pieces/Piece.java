package Pieces;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Piece {

    final int PIECE_SIZE = 64; 
    File file = new File("src/Pieces/Chess.png"); 
    BufferedImage pieceImage; 
    public static final int WHITE = 0; 
    public static final int BLACK = 1; 
    public int x, y; 


    public Piece(int color, int col, int row) {
        this.x = getX(col); 
        this.y = getY(row); 
    }

    public int getX(int col) { 
        return col*100; 
    }

    public int getY(int row) { 
        return row*100; 
    }

    public BufferedImage getImage(int pieceX, int pieceY) { 
        return loadImage().getSubimage(pieceX, pieceY, PIECE_SIZE, PIECE_SIZE); 
    }

 
    

    private BufferedImage loadImage() { 
        try { 
            return ImageIO.read(new File("src/Pieces/Chess.png")); 
        } catch (IOException e) { 
            e.printStackTrace();
            return null; 
        }
    } 

    public void draw(Graphics g) { 
        g.drawImage(pieceImage, x, y, 100, 100, null); 
    }
}
