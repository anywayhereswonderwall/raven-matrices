import javax.swing.*;
import java.awt.*;

public class GUI  {
    private final int height = 700;
    private final int width = 1200;

    private final int cardHeight = 200;
    private final int cardWidth = 200;
    public GUI() {
        LetterShape letterShape = new LetterShape('A');
        letterShape.setPreferredSize(new Dimension(cardWidth, cardHeight));
        JFrame frame = new JFrame("Raven");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(letterShape);
        frame.setVisible(true);
    }
}
