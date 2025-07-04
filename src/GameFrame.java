import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame {

    JFrame frame = new JFrame("Chess"); 
    JPanel panel = new JPanel(); 


    public GameFrame() { 
        initializeGui();
    }

    public void initializeGui() { 
        Board board = new Board();

        //initializes the pieces by assigning the array to the cords. 
        board.setPieces();

        //resize jframe by adapting to board size
        board.setPreferredSize(new Dimension(800, 800));
        frame.add(board); 
        frame.pack(); 

        //make frame start in the center of the screen
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); 
        frame.setResizable(false);
        panel.setLayout(null);
        frame.setVisible(true);
    }
}
