import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class todo_task extends JPanel implements ActionListener {
    JLabel label = new JLabel("How many task do you want to perform today");
    Image pg3 = new ImageIcon("pg3.png").getImage();
    JTextField tf = new JTextField();
    buttons submit = new buttons("submit");
    static String input="";
    todo_task1 tdt ;
    Color c = new Color(10, 132, 126);
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(pg3, 0, 0, getWidth(), getHeight(), this);
    }
    static int num ;

    todo_task(){
        setLayout(null);
        setBackground(Color.YELLOW);
        label.setFont(todo_task1.font);


        Home.back1.setBounds(10,20,50,50);
        label.setBounds(275,175,300,30);
        tf.setBounds(275,210 , 275,30);
        submit.setBounds(390,250,100,30);

        submit.addActionListener(e -> {
            input = tf.getText();
            try {
                String tmp = "123"; // maybe from JTextField.getText()
                 num = Integer.parseInt(input);
                System.out.println("Converted number: " + num  );
            } catch (NumberFormatException f) {
                System.out.println("Invalid number input!");
            }
            Main.frame.getContentPane().removeAll();
            Main.frame.revalidate();
            Main.frame.repaint();
            tdt = new todo_task1();
            tf.setBackground(c);



        });

        add(Home.back1);
//        add(label);
        add(tf);
//        add(submit);

        System.out.println("green");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
