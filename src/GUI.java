import javax.swing.*;
import java.awt.*;

public class GUI {
    private Raknare raknare = new Raknare();
    private JLabel label = new JLabel();

    public GUI(){
        JFrame window = new JFrame("Klickräknare");
        window.setSize(400, 400);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        JButton clickButton = new JButton("Klick me!");

        clickButton.addActionListener(e -> {
            raknare.increase();
            updateLabel();
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            raknare.reset();
            updateLabel();
        });

        window.add(clickButton);
        window.add(label);
        window.add(resetButton);
        updateLabel();

        window.setVisible(true);
    }

    private void updateLabel() {
        label.setText("Klick: " + raknare.getCount());
    }

}
