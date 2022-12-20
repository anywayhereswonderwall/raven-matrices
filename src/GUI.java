import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GUI  {
    private final int height = 700;
    private final int width = 1200;

    private final int cardHeight = 200;
    private final int cardWidth = 200;
    public GUI(List<Object> shapes) {

        JFrame frame = new JFrame("Raven");
        for (int i = 0; i < shapes.size(); i++) {
            frame.add((JComponent) shapes.get(i));
        }

        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
