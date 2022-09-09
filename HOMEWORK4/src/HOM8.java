import javax.swing.*;
public class HOM8 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle("circle");
        frame.setVisible(true);
        NameComponent na = new  NameComponent();
        frame.add(na);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
