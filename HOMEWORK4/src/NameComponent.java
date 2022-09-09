
import javax.swing.*;
import java.awt.*;
public class NameComponent extends JComponent {
    public void paintComponent(Graphics g){
    String name ="saba";
    Graphics2D g2=(Graphics2D) g;
    Rectangle rect = new Rectangle(200,200,80,80);
    g2.setColor(Color.red);
    g2.fill(rect);
    g2.setColor(Color.GREEN);
    g2.drawString(name,40,30);
}}
