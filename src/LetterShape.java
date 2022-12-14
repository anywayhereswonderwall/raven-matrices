import javax.swing.*;
import java.awt.*;

public class LetterShape extends JComponent {
    char letter;
    int rotation;
    public LetterShape(char letter, int rotation) {
        this.letter = letter;
        this.rotation = rotation;
    }
    public LetterShape(char letter) {
        this.letter = letter;
        this.rotation = rotation;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(Math.toRadians(rotation), 100, 100);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        g.drawString(String.valueOf(letter), 10, 100);
    }

}
