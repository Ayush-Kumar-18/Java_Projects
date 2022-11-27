import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class time {
    JFrame f;
    //    JPanel T;
    Timer timer;
    JLabel t;
    time() {
        f = new JFrame("Timer");
//        T = new JPanel();
        t = new JLabel();
//        T.setBounds(10, 10, 100, 100);
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 180;
            @Override
            public void run() {
                t.setText("Time left: " + i);
                i--;

                if(i<0){
                    timer.cancel();
                    t.setText("Time over");
                }
            }
        } , 0, 1000);

        f.add(t);
        f.setSize(300, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new time();
    }
}
