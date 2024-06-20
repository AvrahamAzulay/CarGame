import javax.swing.*;

public class Window extends JFrame {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 800;

    public Window() {
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //this.getContentPane().setBackground(Color.LIGHT_GRAY);


        this.add(new Scene());

        this.setVisible(true);
    }


}