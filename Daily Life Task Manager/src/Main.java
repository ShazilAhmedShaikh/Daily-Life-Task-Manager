import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

class Main{
    static JFrame frame;
    static todo_task todoTask ;
    static kind_task kindTask ;
    public static void main(String[] args) {

        int modes = 1 ;


        JPanel bgPanel = new JPanel() {
            Image bg = new ImageIcon("welcome.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }
        };

        bgPanel.setLayout(null);



        frame = new JFrame();
        todoTask = new todo_task();
        kindTask = new kind_task();

        frame.setSize(1920,1080);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(bgPanel);
        frame.revalidate();
        frame.repaint();
        Home home = new Home();

        Timer t = new Timer();
        TimerTask TASK = new TimerTask() {
            @Override
            public void run() {

                    frame.getContentPane().removeAll();
                    frame.revalidate();
                    frame.repaint();
                    frame.setContentPane(home);
                    frame.revalidate();
                    frame.repaint();
                    t.cancel();



            }
        };

        t.schedule(TASK , 5000);

        frame.setVisible(true);


    }

}