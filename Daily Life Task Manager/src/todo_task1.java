import javax.swing.*;
import java.awt.*;

public class todo_task1 extends JPanel {

    JLabel[] labels = new JLabel[todo_task.num];
    JTextField[] tfs = new JTextField[todo_task.num];
    static Font font ;


    todo_task1(){
        setBackground(Color.YELLOW);
        setLayout(null);
        Main.frame.add(this);
        Main.frame.revalidate();
        Main.frame.repaint();

        font = new Font("Monotype Corsiva", Font.PLAIN, 24);

        for(int i = 0 ; i < todo_task.num ; i++)
        {
            labels[i]= new JLabel();
            tfs [i] = new JTextField();
        }
        for(int i = 0 ; i < todo_task.num ; i++)
        {

            labels[i].setText("task"+(i+1));
            labels[i].setFont(font);

            labels[i].setBounds(50 , 70*i+1 , 100 , 30);
            Main.frame.add(labels[i]);

            tfs[i].setBounds(150 , 70*i+1 , 500 , 50);
            Main.frame.add(tfs[i]);
        }
    }

}
