package es.ulpgc.dis.view;

import es.ulpgc.dis.model.BallDisplay;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final BallDisplay ballDisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Bouncing Ball");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);
        add((Component) (ballDisplay = createBallDisplay()));
    }

    public BallDisplay getBallDisplay() {
        return ballDisplay;
    }

    private SwingBallDisplay createBallDisplay() {
        return new SwingBallDisplay();
    }
}
