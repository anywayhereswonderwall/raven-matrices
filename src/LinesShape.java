import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class LinesShape extends JComponent {
    int linesCount;
    int rotation;
    public LinesShape(int linesCount, int rotation) {
        this.linesCount = linesCount;
        this.rotation = rotation;
    }
    public LinesShape(int linesCount) {
        this.linesCount = linesCount;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(Math.toRadians(rotation), 100, 100);
    }
}
