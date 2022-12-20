import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        LetterShape letterShape = new LetterShape('A', 45);
        LetterShape letterShape2 = new LetterShape('B', 90);

        list.add(letterShape);
        list.add(letterShape2);
        GUI gui = new GUI(list);
    }
}