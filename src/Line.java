import java.awt.*;

public class Line {
    private int y;
    private double x;
    public static final int WIDTH = 30;
    public static final int HEIGHT = 90;

    public Line(double x,int y){
        this.x = x;
        this.y = y;
    }

    public void paint (Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect((int)x, y,WIDTH,HEIGHT);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
