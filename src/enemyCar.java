import javax.swing.*;

public class enemyCar extends Car{

    public enum enemyColor {BLUE, RED, GREEN, ORANGE, PURPLE}
    private String [] address = {
            "res/Photo/אדום.png",
            "res/Photo/ירוק.png",
            "res/Photo/כחול.png",
            "res/Photo/כתום.png",
            "res/Photo/סגול.png"
    };


    public enemyCar(int x, int y, enemyColor color) {
        super(x, y);


        if (color == enemyColor.BLUE) {
            setImage(new ImageIcon(address[2]));
        }
        else if (color == enemyColor.RED){
            setImage(new ImageIcon(address[0]));
        }
        else if (color == enemyColor.GREEN){
            setImage(new ImageIcon(address[1]));
        }
        else if (color == enemyColor.ORANGE){
            setImage(new ImageIcon(address[3]));
        }
        else if (color == enemyColor.PURPLE){
            setImage(new ImageIcon(address[4]));
        }
    }
}
