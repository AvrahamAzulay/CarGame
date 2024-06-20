import java.awt.*;
import java.util.ArrayList;

public class Road {

    private ArrayList<Line> lines = new ArrayList<>();
    public static final int leftLane = (Window.WIDTH/6)-Car.widthCar/2;
    public static final int centerLane = (Window.WIDTH/2)-Car.widthCar/2;
    public static final int rightLane = ((Window.WIDTH/6)*5)-Car.widthCar/2;


    public Road (){

        for (int i = -Line.HEIGHT; i < Window.HEIGHT; i += Line.HEIGHT * 2) {
            lines.add(new Line(Window.WIDTH / 3 - (Line.WIDTH / 2), i));
        }
        for (int i = -Line.HEIGHT; i < Window.HEIGHT; i += Line.HEIGHT * 2) {
            lines.add(new Line(Window.WIDTH / 1.5 - (Line.WIDTH / 2), i));
        }

        movement();
    }

    public void movement() {
        new Thread(() -> {
            while (true) {
                for (Line line : lines) {
                    if (line.getY() >= Window.HEIGHT) {
                        line.setY(-90);
                    }
                    line.setY(line.getY() + 2);
                }

                try {
                    Thread.sleep(5);
                } catch (Exception e) {
                }
            }
        }).start();
    }
    public void paint(Graphics graphics){
        for (Line l : lines){
            l.paint(graphics);
        }
    }
}
