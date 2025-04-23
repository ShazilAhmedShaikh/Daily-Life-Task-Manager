import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Home extends JPanel implements ActionListener {
    buttons b1 = new buttons("");
    buttons b2 = new buttons("");
    static buttons back = new buttons("◄");
    static buttons back1 = new buttons("◄");
    Image pg2 = new ImageIcon("pg2.png").getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(pg2, 0, 0, getWidth(), getHeight(), this);
    }

    Home() {
        setBackground(Color.DARK_GRAY);
        setLayout(null);

        b1.setBackgroundImage("b1.png");
        b2.setBackgroundImage("b2.png");

        b1.setBounds(250, 300, 300, 250);
        b1.setFont(todo_task1.font);
        b2.setBounds(800, 300, 300, 250);
        b2.setFont(todo_task1.font);

        b1.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.revalidate();
            Main.frame.repaint();
            Main.frame.setContentPane(Main.todoTask);
            Main.frame.revalidate();
            Main.frame.repaint();
        });
        b2.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.revalidate();
            Main.frame.repaint();
            Main.frame.setContentPane(Main.kindTask);
            Main.frame.revalidate();
            Main.frame.repaint();
        });
        back.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.revalidate();
            Main.frame.repaint();
            Main.frame.add(this);
            Main.frame.revalidate();
            Main.frame.repaint();
        });
        back1.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.revalidate();
            Main.frame.repaint();
            Main.frame.add(this);
            Main.frame.revalidate();
            Main.frame.repaint();
        });
        add(b1);
        add(b2);

    }
            @Override
            public void actionPerformed (ActionEvent e){


            }
        }
