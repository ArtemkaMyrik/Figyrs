import java.awt.*;

public class Rectangle extends Shape {
    int x;
    int y;
    public void draw(Graphics g){
        g.drawRect(10, 50, 100, 50);
    }
}
