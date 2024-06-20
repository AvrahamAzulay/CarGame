import javax.swing.*;

public class Lobby extends JPanel {
    final JButton START = new JButton();
    final JButton INSTRUCTIONS = new JButton();

    public Lobby (){
        setLayout(null);
        this.setBounds(0,0, Window.WIDTH, Window.HEIGHT);

        this.add(START);
        this.START.setBounds(Window.WIDTH / 2 - 75, Window.HEIGHT /4 , 150, 80);
        this.START.setText("Start");

        this.add(INSTRUCTIONS);
        INSTRUCTIONS.setBounds(Window.WIDTH / 2 - 75, Window.HEIGHT / 4 + 90 , 150, 80);
        this.INSTRUCTIONS.setText("Instructions");


        START.addActionListener((event) -> {

            Scene scene = new Scene();
            add(scene);
            scene.requestFocus();

        });
    }

}
