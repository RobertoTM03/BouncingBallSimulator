package es.ulpgc.dis;

import es.ulpgc.dis.model.Ball;
import es.ulpgc.dis.model.BallSimulator;
import es.ulpgc.dis.presenter.BallPresenter;
import es.ulpgc.dis.view.MainFrame;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        BallPresenter presenter = new BallPresenter( mainFrame.getBallDisplay(), new BallSimulator( 0.001))
                .add(new Ball("1",0.8,-10, 10, 0, -9.8, 0.8))
                .add(new Ball("2",0.8,0, 20, 0, -1.625, 0.8))
                .add(new Ball("3",0.8,10, 25, 0, -50.79, 0.8));
        presenter.execute();
        mainFrame.setVisible(true);
    }
}
